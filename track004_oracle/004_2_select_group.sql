-- 1. 
select * from emp;

-- 2. 집계함수  - sum, count, max, min , avg
select sum(sal) from emp;  -- 1개

-- 3. 부서의 직업별 급여의 평균
select deptno, job, avg(sal) from emp group by deptno, job;

-- 4. where vs having -- 급여의 평균에서 2000이상
select deptno, job, avg(sal) -- 5
from emp         -- 1 
where sal>=1500   -- 2 전체테이터에서 필터
group by deptno, job -- 3 [부서의 직업별], 급여의 평균
having avg(sal) > 2000; -- 4 3번에서 나온 급여의 평균으로 having

-- 5. rollup, cube, grouping sets / pivot,unpivot
-- [부서의 직업별], 명수, 급여의 평균
-- rollup : 10부서의 직업 급여의 평균, 20 부서의 급여의 평균, 30부서의 급여의 평균 = 전체 총계 소에서 >  대로
select deptno, job, count(*), round(avg(sal),1)
from emp
group by rollup(deptno, job);


-- cube : deptno + job전체 총계, job 총계, deptno 총계, deptno + job 각각의 세부 내용  큰거에서 > 작은걸로
select deptno, job, count(*), round(avg(sal),1)
from emp
group by cube(deptno, job);


-- grouping 뭘로 묶였는지 확인 - 해당컬럼이 실제로 그룹화되었니?
select deptno, job, grouping(deptno),grouping(job)
from emp  --1 
group by cube(deptno, job); -- 2 deptno + job , job , deptno, 둘다세부

-- pivot  행테이터를 열로 표시

select *
from  (  select 컬럼, 컬럼2, 집계대상 컬럼 from 테이블명 ) -- 원본데이터 : pivot을 적용할 대상
pivot ( 집계함수(집계대상   )for 컬럼기준 in (값1, 값2, 값3,,,)); -- 집계함수 : 어떤컬럼기준으로 만들 것인지 지정


-- 1) job 별 부서 10,20,30의 최대급여
select *
from ( select deptno, job, sal from emp)
pivot ( max(sal) for deptno in (10,20,30)); -- job 별 부서 10,20,30 의 최대급여

-- 2) 직무별 부서별 사원 수 - job 별  부서 10,20,30의 사원수

select *
from ( select deptno, job--(기준점)
, empno  from emp)
pivot ( count(empno) for deptno in (10,20,30));

-- 3) 부서별 직무 평균 급여

select *
from ( select deptno, job, sal from emp)
pivot (avg(sal) for job in ('CLERK','MANAGER','SALESMAN'));

-- UNPIVOT 열테이터를 행으로
-- decode(job,'CLERK',sal) job 필드에서 CLERK 인경우만 SAL 반환, 아니면 NULL
select *
from (
 select deptno, max(decode (job,'CLERK',sal))CLERK, max( decode(job,'MANAGER',sal)) manager
 from emp  -- #1
 group by deptno  -- #2
)       -- 원본데이터 : unpivot을 적용할대상 (열형태로 집계된 데이터)



unpivot (
      SAL for job in (CLERK, MANAGER)
);   -- unpivot: 열을 행으로 변환, 기준컬럼 열이름이었던것을 행 값으로 변환
 -- 풀이1) DEPTNO, CLERK(열), MANAGER(열)
 -- 풀이2) DEPTNO, JOB, SAL
                  CLERK
                  MANAGER


-- Q025

select deptno, job, count(*), max(sal), sum(sal),avg(sal)
from emp
group by rollup(deptno, job);


-- Q026

select deptno, job, count(*), max(sal),sum(sal),avg(sal)
from emp
group by cube(deptno,job);

-- Q027
select deptno, job, count(*)
from emp
group by deptno, rollup(job);

-- Q028
select deptno, job, count(*)
from emp
group by job, rollup(deptno);

-- Q029 ????
select deptno,job, count(*)
from emp
group by grouping sets(deptno,job);

-- 다중그룹을 한번에 지정
1) group by deptno  -- job null
2) group by job

-- Q030
select deptno, job, count(*),max(sal),sum(sal),avg(sal),grouping(deptno),grouping(job)
from emp
group by cube(deptno,job);

-- Q031
select   decode(  grouping(deptno),1,'all_dept',deptno) as deptno    -- grouping(deptno)rk 1이라면 적용안되었다라는 의미
,decode(grouping(job),1,'all_job',job) as job
,count(*),max(sal),sum(sal), avg(sal)
from emp
group by cube(deptno,job)
order by deptno,job;

-- Q032
--
select deptno,job,count(*), sum(sal),grouping(deptno), grouping(job), grouping_id(deptno,job)
from emp
group by cube(deptno, job)
order by deptno,job;

1) deptno (0), job(0)  grouping_id(0)          -- 정상조합                 0*2^1 + o*2^0 =0
2) deptno (0), job(1:null) grouping_id(1)      -- deptno 실제갑, job null  0*2^1 + 1*2^0 =1
3) deptno (1:null), job(0) grouping_id(2)      -- job실제값, deptno null   1*2^1 + o*2^0 =2
4) deptno (1:null), job(1:null) grouping_id(3) -- 전체 집계  둘다 null      1*2^1 + 1*2^0 =3  2^0은 1


-- Q033
select deptno,ename
from emp
group by deptno,ename;

-- Q034
select deptno, listagg(ename,',') within group(order by sal desc) as enames
from emp

group by deptno;

-- Q035
select deptno,job, max(sal)
from emp
group by deptno,job
order by deptno, job;

-- Q036
select *
from ( select deptno, job, sal from emp)
pivot (max(sal) for deptno in(10,20,30));

-- Q037
select *
from (select deptno, job,sal from emp)
pivot( max(sal) for job in( 'PRESIDENT', 'MANAGER', 'ANALYST' , 'CLERK', 'SALESMAN'));

PRESIDENT   MANAGER    ANAYLYST   CLERK SALESMAN


-- Q038
select deptno
, max( decode(job, 'CLERK', sal)) as CLERK
,max( decode(job, 'SALESMAN', sal)) as SALESMAN
,max( decode(job, 'PRESIDENT', sal)) as PRESIDENT
,max( decode(job, 'MANAGER', sal)) as MANAGER
,max( decode(job, 'ANALYST', sal)) as ANALYST
from emp
group by deptno;

select deptno
,max(decode(job,


-- Q039
select *
from (
select deptno
, max( decode(job, 'CLERK', sal)) as CLERK
,max( decode(job, 'SALESMAN', sal)) as SALESMAN
,max( decode(job, 'PRESIDENT', sal)) as PRESIDENT
,max( decode(job, 'MANAGER', sal)) as MANAGER
,max( decode(job, 'ANALYST', sal)) as ANALYST
from emp
group by deptno
)
unpivot (
       sal  for job in (PRESIDENT, MANAGER, ANALYST , CLERK, SALESMAN)
)
order by deptno,sal;



--Ex001
--EMP 테이블을 이용하여 다음과 같이 출력하시오.
--부서번호(DEPTNO) , 평균급여(AVG_SAL) , 최고급여(MAX_SAL) , 최저급여(MIN_SAL) , 사원수(CNT) 를 조회하시오
--평균급여를 출력시 소수점을 제외하고 각 부서번호별로 출력하시오.

select deptno
,round(avg(sal),0) as AVG_SAL
, max(sal) as MAN_SAL
, min(sal) as MIN_SAL
, count(empno)
from emp
group by deptno;

select deptno
,trunc(avg(sal)) as AVG_SAL
, max(sal) as MAN_SAL
, min(sal) as MIN_SAL
, count(*)
from emp
group by deptno;





--Ex001
--EMP 테이블을 이용하여 다음과 같이 출력하시오.
--부서번호(DEPTNO) , 평균급여(AVG_SAL) , 최고급여(MAX_SAL) , 최저급여(MIN_SAL) , 사원수(CNT) 를 조회하시오
--평균급여를 출력시 소수점을 제외하고 각 부서번호별로 출력하시오.

--힌트)
--STEP1)
--SELECT    부서번호(DEPTNO) , 평균급여(AVG_SAL) , 최고급여(MAX_SAL) , 최저급여(MIN_SAL) , 사원수(CNT)
--FROM      EMP  
--GROUP BY  집계함수빼고 GROUP의 기준점;
--STEP2)  평균급여를 출력시 소수점을 제외 - TRUNC( AVG(SAL))


--Ex002
--EMP 테이블을 이용하여 다음과 같이 출력하시오.
--같은직책(JOB)에 종사하는 사원이 3명 이상인 직책과 인원수를 출력하시오.

select job,count(job)
from emp
group by job
having count(job) >=3
order by count(*) desc, job desc;

select job,count(*)
from emp
group by job
having count(*) >=3
order by count(*) desc, job desc;



--Ex002
--EMP 테이블을 이용하여 다음과 같이 출력하시오.
--같은직책(JOB)에 종사하는 사원이 3명 이상인 직책과 인원수를 출력하시오.

--힌트) 
--STEP1)     같은직책(JOB)에    /    종사하는 사원이 3명 이상인 직책과    인원수
--SELECT     직책(JOB) , 인원수
--FROM       EMP  
--GROUP BY  집계함수빼고 GROUP의 기준점;
--HAVING     사원이 3명 이상인 직책


--Ex003
--EMP 테이블을 이용하여 다음과 같이 출력하시오.
--사원들의 입사년도(HIRE_YEAR)를 기준으로 부서별 몇명이 입사했는지 조회하시오.

select deptno, count(hiredate) as HIRE_YEAR
from emp
group by deptno;


select to_char(hiredate, 'yyyy'), deptno, count(*)  CNT
from emp
group by to_char(hiredate, 'yyyy'), deptno;


--Ex003
--EMP 테이블을 이용하여 다음과 같이 출력하시오.
--사원들의 입사년도(HIRE_YEAR)를 기준으로 부서별 몇명이 입사했는지 조회하시오.

--힌트) 
--STEP1)     
--SELECT     입사년도(HIRE_YEAR)를 기준으로     / 부서별    / 몇명이 입사
--FROM       EMP  
--GROUP BY   입사년도(HIRE_YEAR)를 기준으로     / 부서별 

-- STEP2)
--  입사년도(HIRE_YEAR)를 기준으로   TO_CHAR(   입사일 , 'YYYY' )

--Ex004
--EMP 테이블을 이용하여 다음과 같이 출력하시오.
--추가수당(COMM)을 받는 사원수와 받지않는 사원수를 조회하시오.

select count(empno),comm
from emp
group by comm
having comm is null
union all
select count(empno),comm
from emp
group by comm
having comm is not null;


select nvl2(comm, 'O','X')as EXIST_COMM, count(*) cnt
from emp
group by nvl2(comm, 'O','X');

select decode(comm,null,'X','O')as EXIST_COMM, count(*) cnt
from emp
group by decode(comm,null,'X','O');


select case when comm is null then 'X' else 'O' end exist_comm, count(*) cnt
from emp
group by case when comm is null then 'X' else 'O' end;


--Ex004
--EMP 테이블을 이용하여 다음과 같이 출력하시오.
--추가수당(COMM)을 받는 사원수와 받지않는 사원수를 조회하시오.

--힌트) 
--STEP1)     
--SELECT     추가수당(COMM)을 받는 사원수 - 받으면 O ,  안받으면 X  / 전체 카운트
--FROM       EMP  
--GROUP BY   추가수당(COMM)을 받는 사원수 - 받으면 O ,  안받으면 X

-- STEP2)
--   NVL2(    추가수당(COMM) , 받으면 O ,  안받으면 X )

--Ex005
--EMP 테이블을 이용하여 다음과 같이 출력하시오.
--각 부서의 입사연도별 사원수, 최고급여, 급여합, 평균급여를 출력하고
--각 부서별 소계와 총계를 출력하시오. (ROLLUP)

select count(hiredate),max(sal),sum(sal), avg(sal)
from emp
group by rollup(deptno);


select deptno,to_char(hiredate, 'yyyy') HIRE_YEAR,count(*) as CNT ,max(sal),sum(sal), avg(sal) as AVG_SAL
from emp
group by rollup( deptno,to_char(hiredate, 'yyyy'));



--Ex005
--EMP 테이블을 이용하여 다음과 같이 출력하시오.
--각 부서의 입사연도별 사원수, 최고급여, 급여합, 평균급여를 출력하고
--각 부서별 소계와 총계를 출력하시오. (ROLLUP)

--힌트) 
--STEP1)     
--SELECT     입사연도별 사원수, 최고급여, 급여합, 평균급여
--FROM       EMP  
--GROUP BY   입사연도별
--STEP2)   입사년도(HIRE_YEAR)를 기준으로   TO_CHAR(   입사일 , 'YYYY' )





























