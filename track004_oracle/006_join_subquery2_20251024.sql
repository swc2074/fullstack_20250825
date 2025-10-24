-- 서브쿼리  select 안에 select

-- #1. 단일행(2073) 서브쿼리  emp 평균급여 보다 많이 받는 사원들
select ename, sal
from   emp
where   sal > 평균급여(2073)
--group by
--having
order by sal desc
;

-- step2)
select ename, sal
from   emp
where   sal > (  select avg(sal) from emp)
order by sal desc
;

-- #2. emp deptno가 10인 부서의 job인 사원들 ename, sal
select ename, sal
from  emp
where  job = deptno 가 10인 부서의 job
order by sal desc;

-- #2-1.-- 1개 이상이면 = 사용불가 , in 사용
select ename, sal
from  emp
where  job in (select job from emp where deptno = 10) -- 1개 이상이면 = 사용불가 , in 사용
order by sal desc;


-- #3. 다중행연산자
-- 1. in  "이 값이 목록에 있나요?"  deptno in (10,20,30)

-- 2. any, some "하나라도 만족하면 ok" ■ 최소값 기준비교
-- 컬럼 > any (서브쿼리) 최소값보다 크면 true
-- 컬럼 < any (서브쿼리) 최대값보다 작으면 true
   -- 컬럼 > any (1,2,3)   | (1)   | (2)  | (3)
   
   -- 컬럼 < any (1,2,3)   | (1)   | (2)  | (3)



-- 3. all "모두 만족해야 ok"           ■ 최대값 기준비교
-- 컬럼 > all (서브쿼리) 최대값보다 크면 true
-- 컬럼 < all (서브쿼리) 최소값보다 작으면 true


-- 암기 ) ■ 컬럼 > any 1  컬럼 > all 3 

-- 4.exist "서브쿼리가 존재하면 ok"


-- #4. 다중 열 서브쿼리
-- where sal>any, sal in any
select  ename,deptno,job
from emp
where (deptno,job) in ( select deptno, job from emp where sal > 2000   );

-- #5. 인라인뷰 (from)
select empno, ename, d.deptno, dname
from (select * from emp where deptno = 20) e, (select *from dept) d
where e.deptno = d.deptno;

-- #6.with (단일 쿼리에서 가능)
with 
 e6 as ( select * from emp where deptno = 30 )
,d6 as ( select * from dept )

select empno, ename, d6.deptno, dname
from  e6,  d6
where e6.deptno = d6.deptno;


with 
e6 as ( select * from emp where deptno = 30)
select count(*) from e6;

-- #7. 스칼라서브쿼리
-- 데이터가 많은 경우 성능 저하
select  empno, ename, sal
    ,( select grade from salgrade where emp.sal between losal and hisal ) as salgrade
    , deptno
    ,(select loc from dept where emp.deptno = dept.deptno ) as location
from emp;






create table atest   as select 1 num from dual
      union all      select 2     from dual 
      union all      select 3     from dual
      union all      select 4     from dual
      union all      select 5     from dual
      union all      select 6     from dual;

select * from atest;

-- 컬럼 >any 1 최소값보다 크다, 컬럼> all 3 최대값보다 크다   최소값 작다

select num  from atest where  num < any(select num from atest  where num in(3,4,5)) order by num; -- 5보다 작다  1 2 3 4
select num  from atest where  num > any(select num from atest  where num in(3,4,5)) order by num; -- 3보다 크다  4 5 6
select num  from atest where  num < all(select num from atest  where num in(3,4,5)) order by num; -- 3보다 작다 1 2 
select num  from atest where  num > all(select num from atest  where num in(3,4,5)) order by num; -- 5보다 크다  6




-- Q001
select sal
from emp
where ename = 'JONES'
;

-- Q002
select empno,ename,job,mgr,hiredate,sal,comm,deptno
from emp
where sal > 2975;

-- Q003
select empno, ename,job, mgr,hiredate,sal,comm,deptno
from emp
where sal > (select sal from emp where ename = 'JONES');

-- Q004
select empno,ename,job,mgr,hiredate,sal,comm,deptno
from emp
where hiredate < (select hiredate from emp where ename = 'SCOTT');

-- Q005
select empno,ename,job,sal,d.deptno,dname,loc
from emp e, dept d
where d.deptno = 20
and sal > (select avg(sal) from emp e natural join dept d 
);

select empno,ename,job,sal,d.deptno,dname,loc
from emp e, dept d
where e.deptno = d.deptno 
and e.deptno = 20
and sal > (select avg(sal) from emp 
);

select empno,ename,job,sal,d.deptno,dname,loc
from emp e join dept d
on( e.deptno = d.deptno )
and e.deptno = 20
and sal > (select avg(sal) from emp 
);

select empno,ename,job,sal,deptno,dname,loc
from emp e join dept d
using( deptno )
where deptno = 20
and sal > (select avg(sal) from emp e 
);

select empno,ename,job,sal,deptno,dname,loc
from emp e natural join dept d
where deptno = 20
and sal > (select avg(sal) from emp e 
);

-- Q006
select empno,ename,job,mgr,hiredate,sal,comm,deptno
from emp
where deptno in(20,30);

-- Q007
select empno,ename,job,mgr,hiredate,sal,comm,deptno
from emp
where sal in (select max(sal) from emp group by deptno);


-- Q008
select max(sal)
from emp
where deptno in(10,20,30)
group by deptno;

select max(sal)
from emp
where deptno in(10,20,30)
group by deptno;

select *
from emp
where sal in(select max(sal) from emp group by deptno);

select *
from emp
where sal = any(select max(sal) from emp group by deptno);

select *
from emp
where sal = some(select max(sal) from emp group by deptno);

-- Q009

select num  from atest where  num < any(select num from atest  where num in(3,4,5)) order by num;

select *
from emp
where sal = any (select max(sal) from emp group by deptno);

-- Q010
select *
from emp
where sal = some (select max(sal) from emp group by deptno);

-- Q011
select *
from emp
where sal < any (select max(sal) from emp where deptno in(30));

select *
from emp
where sal < any( select distinct sal from emp where deptno =30)
order by sal,empno asc;



-- Q012
select sal
from emp
where deptno in (30);


select distinct sal
from emp
where deptno = 30;

-- Q013
select *
from emp
where sal > any (select min(sal) from emp where deptno in(30))
order by empno;

select *
from emp
where sal > any ( select sal  from emp where deptno = 30);

-- Q014

select *
from emp
where sal < all ( select sal  from emp where deptno = 30);

-- Q015
select *
from emp
where sal > all ( select sal  from emp where deptno = 30);

-- Q016
select *
from emp
where exists(select * from emp where 1=1);

select *
from emp
where exists(select * from emp where deptno=10);

select *
from emp
where exists(select dname from dept where deptno=10);



-- Q017
select *
from emp
where exists(select dname from dept where deptno=50);

-- Q018
select empno,ename,job,mgr hiredate,sal,comm,deptno
from emp
where (deptno,sal) in (select deptno, max(sal) from emp 
group by deptno);

-- Q019
select empno,ename,d.deptno,dname,loc
from (select * from emp where deptno = 10) e,
      (select * from dept ) d
where e.deptno = d.deptno;



select empno,ename,d.deptno,dname,loc
from emp e join dept d on (e.deptno = d.deptno)
where e.deptno = 10;

select empno,ename,deptno,dname,loc
from emp e join dept d using (deptno)
where deptno = 10;

select empno,ename,deptno,dname,loc
from emp e natural join dept d
where deptno = 10;

-- Q020
with 
  e as (select * from emp where deptno = 10)
 ,d as (select * from dept )
 select empno,ename,e.deptno,dname,loc
 from e,d
 where e.deptno = d.deptno;
 
 
 
 

-- Q021

select  empno, ename, job, sal
    ,( select grade from salgrade where emp.sal between losal and hisal ) as salgrade
    , deptno
    ,(select dname from dept where emp.deptno = dept.deptno ) as dname
from emp;


select * from salgrade;
select * from emp;
select * from dept;



-- ex001
select job,empno,ename,sal,d.deptno,dname
from emp e, dept d
where job = (select job from emp where ename = 'ALLEN')
and d.deptno = 30;


select job,empno,ename,sal,d.deptno,dname
from emp e, dept d
where e.deptno = d.deptno
and job = (select job from emp where ename = 'ALLEN');

select job,empno,ename,sal,d.deptno,dname
from emp e join dept d
on e.deptno = d.deptno
where job = (select job from emp where ename = 'ALLEN');

select job,empno,ename,sal,deptno,dname
from emp e join dept d
using( deptno)
where job = (select job from emp where ename = 'ALLEN');


select job,empno,ename,sal,deptno,dname
from emp e join dept d
using( deptno)
where job in (select job from emp where ename = 'ALLEN');


with ALLEN_JOB AS (select job from emp where ename = 'ALLEN')
select job,empno,ename,sal,deptno,dname
from emp e join dept d
using( deptno)
           JOIN ALLEN_JOB  using(job);


select job,empno,ename,sal,deptno,dname
from emp e join dept d
using( deptno)
where exists (select 1 from emp a where a.ename ='ALLEN' and a.job=e.job);


-- ex002

select job, empno,ename,dname,hiredate,loc,sal
,( select grade from salgrade where e.sal between losal and hisal ) as salgrade
from emp e, dept d
where sal > (select avg(sal) from emp e, dept d )
order by sal desc,empno asc;



select  job,empno,ename,dname,hiredate,loc,sal
from emp e, dept d, salgrade s
where e.deptno = d.deptno and  e.sal between s.losal and s.hisal
and e.sal>(select avg(sal) from emp)
order by sal desc, empno;

select  empno,ename,dname,hiredate,loc,sal
from emp e join dept d on(e.deptno = d.deptno) 
           join salgrade s on(e.sal between s.losal and s.hisal)
where e.sal>(select avg(sal) from emp)
order by sal desc, empno;


WITH AVG_SAL(AVG_SAL) as (select avg(sal) from emp)
select  empno,ename,dname,hiredate,loc,sal
from emp e join dept d on(e.deptno = d.deptno) 
           join salgrade s on(e.sal between s.losal and s.hisal)
           join AVG_SAL a on(e.sal > a.AVG_SAL)
order by sal desc, empno;



select  job,empno,ename,dname,hiredate,loc,sal
from emp e join dept d on(e.deptno = d.deptno) 
           join salgrade s on(e.sal between s.losal and s.hisal)
           where exists(
           select 1 from emp x where e.sal > (select avg(sal) from emp))
order by sal desc, empno;



-- ex003
select empno, ename,job,d.deptno,dname,loc
from emp e join dept d
on e.deptno = d.deptno
where e.deptno = 10
and e.job not in (select job from emp where deptno = 30)
;


select empno,ename,job, d.deptno,dname, loc
from emp e, dept d
where d.deptno = 10 and job not in (select job from emp where deptno = 30 );


select empno,ename,job, d.deptno,dname, loc
from emp e, dept d
where e.deptno = d.deptno and d.deptno = 10 and job not in (select job from emp where deptno = 30 );

with job_in_30 as (select job from emp where deptno = 30)
select empno,ename,job, d.deptno,dname, loc
from emp e join dept d on e.deptno = d.deptno
where e.deptno =10 and e.job not in(select job from job_in_30);



select empno,ename,job, d.deptno,dname, loc
from emp e join dept d on e.deptno = d.deptno
where e.deptno =10 
and not exists(select 1 from emp x where x.deptno = 30 and x.job=e.job);

-- ex004
1)
select *
from emp
where sal > all(select max(sal) from emp where job = 'SALESMAN');

2)

select *
from emp
where (empno,sal) 
in (select empno, sal from emp where sal > all (select max(sal) from emp where job = 'SALESMAN');

3)
select *
from emp
where sal > all(select max(sal) from emp where job = 'SALESMAN')
order by empno asc;



select empno, ename,sal,grade
from emp e, salgrade s
where e.sal between s.losal and s.hisal
sal > all (select sal from emp where job = 'SALESMAN')
order by empno;

select empno, ename,sal,grade
from emp e, salgrade s
where e.sal between s.losal and s.hisal
sal > all (select sal from emp where job = 'SALESMAN')
order by empno;

--SELECT    EMPNO, ENAME, JOB, DEPTNO, DNAME, LOC
--FROM      EMP E, DEPT D 
--WHERE     JOIN 조건
--AND    10번부서에서
--AND    JOIN NOT IN(30번부서에는 존재하지 않는 직책 )


--EX001
--EMP 테이블에서 다음과 같이 출력하시오.
--전체 사원 중 ALLEN과 같은 직책(JOB)인 사원들의 사원정보, 부서정보를 다음과 같이 출력하시오.
--힌트)
--SELECT   JOB, EMPNO, ENAME, SAL, DEPTNO,DNAME
--FROM     EMP
--WHERE    JOB =   (ALLEN과 같은 직책(JOB))  


--JOIN ON, JOIN USING, NATURAL JOIN ,   WITH( 테이블 선언) ,  IN , EXISTS
 


--EX002
--EMP 테이블에서 다음과 같이 출력하시오.
--전체 사원의 평균급여(SAL) 보다 높은 급여를 받는 사원들의 사원정보, 부서정보, 급여등급정보를 출력하시오.
--급여가 많은 순으로 정렬하되 급여가 같은경우에는 사원번호를 기준으로 오름차순으로 정렬

--힌트)
--SELECT   JOB, EMPNO,DNAME  , HIREDATE , LOC, SAL, GRADE
--FROM      EMP E, DEPT D, SALGRADE S
--WHERE     JOIN 조건,     
--AND       평균급여(SAL) 보다 높은 급여를 받는 사원들
--ORDER    BY    급여가 많은 순으로 정렬 , 사원번호를 기준으로 오름차순




--EX003
--EMP 테이블에서 다음과 같이 출력하시오.
--10번부서에서 근무하는 사원 중 
--30번부서에는 존재하지 않는 직책을 가진 사원들의 사원정보, 부서정보를 다음과 같이 출력하는 SQL문을 작성하시오.

--힌트)
--SELECT    EMPNO, ENAME, JOB, DEPTNO, DNAME, LOC
--FROM      EMP E, DEPT D 
--WHERE     JOIN 조건
--AND    10번부서에서
--AND    JOIN NOT IN(30번부서에는 존재하지 않는 직책 )



--EX004
--EMP 테이블에서 다음과 같이 출력하시오.
--직책이 SALESMAN인 사람들의 최고급여보다 높은 급여를 급여를 받는 사원들의 사원정보, 급여등급정보를 다음과 같이 출력하시오.
--다중행 함수 사용하지 않는 방법 (IN, ANY, ALL, EXISTS), 다중행 함수 사용하는 방법 2가지로 작성하시오.
--사원번호를 기준으로 오름차순으로 정렬하시오.
--힌트)
--SELECT    EMPNO, ENAME,SAL, GRADE
--FROM      EMP E, SALGRADE
--WHERE     JOIN 조건
--AND       직책이 SALESMAN인 사람들의 최고급여보다 높은 급여를 급여
--ORDER BY  EMPNO;

--힌트1)  애니1 올3 
--필드 >ANY 1   최소보다 크다, 최대보다 작다        > ALL 3  최대보다 크다, 최소보다 작다

