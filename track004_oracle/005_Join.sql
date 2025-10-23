-- Join
-- 여러테이블을 한개의 테이블처럼 사용하는 것
-- 공통컬럼 기준으로 연결
-- 1-1. 등가조인 (=) : where 절        emp.deptno = dept.deptno
--      비등가조인 (= X) :             sal between losal and hisal
--      자체조인         :  emp e1 , emp e2

-- 1-2. outer join  : 매칭되지 않은 행도 포함. left,right, full outer join

-- ERD:  Entity(테이블), Relationship(관계), Diagram(표)
--       Entity(테이블), Relationship(관계), Attribute(속성)

-- #1. 등가조인






select *
from emp, dept
where emp.deptno = dept.deptno;

select *
from emp e, dept d
where e.deptno = d.deptno;

select *
from emp e join dept d on(e.deptno = d.deptno);

select *
from emp e join dept d using(deptno);

select *
from emp  e natural join dept d;

--1.  emp e 별명 , dept d 별명  / empno, ename, deptno, dname
select empno,ename,e.deptno,dname
from  emp e, dept d
where e.deptno = d.deptno;

select empno,ename,e.deptno,dname
from  emp e join dept d on( e.deptno = d.deptno);


select empno,ename,deptno,dname
from  emp e join dept d using(deptno);

select empno,ename,deptno,dname
from  emp e natural join dept d ;



-- #2. 외부조인 (매칭 x)

select * from dept;   -- deptno 10,20,30,40
select * from emp;    -- deptno 10,20,30

-- 1. 조건 (+) oracle에서만 
select ename, dname
from emp e, dept d
where e.deptno = d.deptno(+); -- 14 emp 테이블 보장, dept에서 모자라는 데이터 없는 데이터 null 채울께


select ename, dname
from emp e, dept d
where e.deptno(+) = d.deptno; -- 15 dept 테이블 보장, emp에서 모자라는 데이터 없는 데이터 null 채울께



-- 2. left join , right join (ANSI 조인 = 표준)
select ename, dname
from emp e inner join dept d 
 on (e.deptno = d.deptno);  -- inner join, 내부조인, 겹치는 애들만 outer join 아님 !!!
 
 select ename, dname
from emp e right outer join dept d
on( e.deptno = d.deptno);  -- right 쪽에 있는 테이블 보장 (null, operations)


 select ename, dname
from dept d left outer join emp e
on( e.deptno = d.deptno);  -- left 쪽에 있는 테이블 보장 (null, operations)

-- 3. outer join

select ename, dname
from emp e full outer join dept d
on (e.deptno = d.deptno);


-- 비표준 = , (+)
-- 표준 natural join, join on, join using, left join,right join,full  join






-- Q001.
select *
from emp,dept
order by empno;




-- Q002.
select *
from emp,dept
where emp.deptno = dept.deptno
order by empno;

select *
from emp join dept
on (emp.deptno = dept.deptno)
order by empno;

select *
from emp join dept
using (deptno)
order by empno;

select *
from emp natural join dept
order by empno;

-- Q003.
select *
from emp e, dept d
where e.deptno = d.deptno
order by empno;

select *
from emp e join dept d
on(e.deptno = d.deptno)
order by empno;

select *
from emp e join dept d
using(deptno)
order by empno;

select *
from emp e natural join dept d
order by empno;




-- Q004.
select empno, ename, deptno,dname, loc
from emp e join dept d
on e.deptno = d.deptno;


select empno, ename, d.deptno,dname, loc
from emp e , dept d
where e.deptno = d.deptno;

-- Q005.

select e.empno, e.ename, d.deptno, d.dname, d.loc
from emp e, dept d
where e.deptno = d.deptno
order by d.deptno,e.empno;

-- Q006.
select empno,ename,sal,d.deptno,dname,loc
from emp e join dept d on (e.deptno = d.deptno)
where e.sal >= 3000;

select empno,ename,sal,d.deptno,dname,loc
from emp e join dept d on (e.deptno = d.deptno)
where sal >= 3000;

select empno,ename,sal,d.deptno,dname,loc
from emp e natural join dept d 
where sal >= 3000;

select empno,ename,sal,dname, loc
from emp e, dept d
where e.deptno = d.deptno and e.sal >=3000;

select empno,ename,sal,dname, loc
from emp e join dept d
on( e.deptno = d.deptno )
where e.sal >=3000;

select empno,ename,sal,dname, loc
from emp e join dept d
using( deptno )
where e.sal >=3000;

select empno,ename,sal,dname, loc
from emp e natural join dept d
where e.sal >=3000;

-- Q007. 비등가 조인
select empno,ename,job, mgr,hiredate, sal, comm,deptno, grade,losal,hisal
from emp e, salgrade d
where sal between losal and hisal;


select *
from emp e, salgrade s
where e.sal >= losal and e.sal <=hisal; -- 등가 조인

select *
from emp e join salgrade s
on( e.sal >= losal and e.sal <=hisal); -- 등가 조인

select *
from emp e, salgrade s
where e.sal between losal and hisal;    -- 비등가

select *
from emp e join salgrade s
on( e.sal between losal and hisal);     -- 비등가

select *
from emp e join salgrade s
using( 겹치는 필드가 안보임 x);

-- Q008. 자체조인
select empno, ename, mgr, mgr.empno,mgr.ename
from emp e1, emp e2
where e1.mgr = e2.empno;

desc emp e1;


select e1.empno, e1.ename, e1.mgr, e2.empno MGR_EMPNO,e2.ename MGR_ENAME
from emp e1, emp e2
where e1.mgr = e2.empno
order by e1.mgr asc;

select e1.empno, e1.ename, e1.mgr, e2.empno MGR_EMPNO,e2.ename MGR_ENAME
from emp e1 join emp e2
on( e1.mgr = e2.empno)
order by e1.mgr asc;



-- Q6   = , JOIN ON , JOIN USING, NATURAL JOIN  ( 4가지다 표현도전)
--- EMP, DEPT 테이블을 이용하여
--  급여가 3000이상인 사원의  사원번호, 이름, 급여, 근무부서를   다음과 같이 출력하시오
힌트)
SELECT     사원번호, 이름, 급여, 근무부서
FROM       EMP, DEPT 테이블을
WHERE      급여가 3000이상인;

-- Q7  비등가조인
--- EMP, SALGRADE 테이블을 이용하여
--  유저 정보, 급여등급 , 그 등급의 최소급여와 최대급여를  다음과 같이 출력하시오
힌트)
SELECT * FROM SALGRADE;   -- GRADE , LOSAL(최소급여), HISAL(최대급여)
SELECT  *
FROM    EMP, SALGRADE 테이블
WHERE   유저의 급여가  BETWEEN  최소급여   AND      최대급여;

-- Q8  자체조인
--- EMP테이블을 2번 이용하여
--  사원정보(EMPNO, ENAME, MGR) 와  직속상관(EMPNO, ENAME)의 사원번호를 다음과 같이 출력하시오
힌트)
SELECT    사원정보(EMPNO, ENAME, MGR) , 직속상관(EMPNO, ENAME)
FROM      EMP E1, EMP E2
WHERE     E1.MGR     = E2.EMPNO;  -- 사원의 직속상관(MGR) , 직속상과(EMPNO)


-- Q009.
select e1.empno,e1.ename,e1.mgr,e2.empno as MGR_EMPNO, e2.ename as MGR_ENAME
from emp e1, emp e2
where e1.mgr = e2.empno(+)
order by e1.empno;


select e1.empno,e1.ename,e1.mgr,e2.empno as MGR_EMPNO, e2.ename as MGR_ENAME
from  emp e1 left join emp e2
on( e1.mgr = e2.empno)
order by e1.empno;

select e1.empno,e1.ename,e1.mgr,e2.empno as MGR_EMPNO, e2.ename as MGR_ENAME
from  emp e1 right join emp e2
on( e1.mgr = e2.empno)
order by e1.empno;

-- Q010.
select e1.empno,e1.ename,e1.mgr,e2.empno as MGR_EMPNO, e2.ename as MGR_ENAME
from emp e1, emp e2
where e1.mgr (+) = e2.empno
order by e1.empno;    (+) null 채워줄께, 매니저들의 번호와 이름은 있으나 .. 관리하는 사원없음.




-- Q011.
select empno, ename, job, mgr,hiredate,sal,comm,deptno,dname,loc
from emp e natural join dept d
order by deptno;


select *
from emp e natural join dept d
order by deptno;

select empno, ename, job, mgr,hiredate,sal,comm,deptno,dname,loc
from emp e natural join dept d
order by deptno , empno;


desc dept;
desc emp;
select * from dept;


-- Q012.
select empno,ename,job,mgr,hiredate,sal,comm,deptno,dname,loc
from emp e join dept d using(deptno)
where sal >=3000
order by deptno asc,ename;

select empno,ename,job,mgr,hiredate,sal,comm,e.deptno,dname,loc
from emp e join dept d on(e.deptno = d.deptno)
where sal >=3000
order by deptno asc,ename;


-- Q013.
select empno,ename,job,mgr,hiredate,sal,comm,d.deptno,dname,loc
from emp e join dept d on (e.deptno = d.deptno)
where sal<=3000
order by deptno, empno;


select empno,ename,job,mgr,hiredate,sal,comm,d.deptno,dname,loc
from emp e join dept d on (e.deptno = d.deptno)
where sal<=3000
order by deptno, empno;

desc emp;
desc dept;

-- Q014.
select e1.empno,e1.ename,e1.mgr, 
e2.empno as MGR_EMPNO,
e2.ename as MGR_ENAME
from emp e1 left outer join emp e2
on (e1.mgr = e2.empno)
order by e1.empno,e1.ename;





-- Q015.
select e1.empno,e1.ename,e1.mgr, 
e2.empno as MGR_EMPNO,
e2.ename as MGR_ENAME
from emp e1 right outer join emp e2
on (e1.mgr = e2.empno)
order by e1.empno,e1.ename;

-- Q016.
select e1.empno,e1.ename,e1.mgr, 
e2.empno as MGR_EMPNO,
e2.ename as MGR_ENAME
from emp e1 full outer join emp e2
on (e1.mgr = e2.empno)
order by e1.empno,e1.ename;


-- ex001.
select d.deptno, d.dname,e.empno,e.ename,sal
from emp e join dept d  on(e.empno = d.deptno (+))
where sal >=2000
order by deptno;

select * from dept;
select * from emp;

select deptno, dname,empno,ename,sal
from emp e natural join dept d 
where sal >=2000
order by deptno;


-- an
select d.deptno, dname,empno, ename, sal
from dept d, emp e
where d.deptno = e.deptno and sal>2000;


select d.deptno, dname,empno, ename, sal
from dept d join emp e
on( d.deptno = e.deptno )
where sal>2000;


select deptno, dname,empno, ename, sal
from dept join emp 
using( deptno )
where sal>2000;



select deptno, dname,empno, ename, sal
from dept natural join emp 
where sal>2000;

-- ex002.
select deptno,dname
,trunc(avg(sal)) as AVG_SAL
,max(sal) as MAX_SAL
,min(sal) as MIN_SAL
,count(*) as CNT
from emp e natural join dept d
group by deptno,dname;


select e.deptno,dname
,trunc(avg(sal)) as AVG_SAL
,max(sal) as MAX_SAL
,min(sal) as MIN_SAL
,count(*) as CNT
from emp e , dept d
where e.deptno = d.deptno
group by e.deptno,dname;

select * from dept;
select * from emp;

-- an
select e.deptno,dname
,trunc(avg(sal)) as AVG_SAL
,max(sal) as MAX_SAL
,min(sal) as MIN_SAL
,count(*) as CNT
from emp e , dept d
where e.deptno = d.deptno
group by e.deptno,dname;

select d.deptno,dname
,trunc(avg(sal)) as AVG_SAL
,max(sal) as MAX_SAL
,min(sal) as MIN_SAL
,count(*) as CNT
from emp e join dept d
on( e.deptno = d.deptno)
group by d.deptno,dname;

select deptno,dname
,trunc(avg(sal)) as AVG_SAL
,max(sal) as MAX_SAL
,min(sal) as MIN_SAL
,count(*) as CNT
from emp e join dept d
using( deptno)
group by deptno,dname;

select deptno,dname
,trunc(avg(sal)) as AVG_SAL
,max(sal) as MAX_SAL
,min(sal) as MIN_SAL
,count(*) as CNT
from emp e natural join dept d
group by deptno,dname;

-- ex003
select d.deptno,dname, empno,ename,job,sal
from emp e, dept d
where d.deptno = e.deptno(+)
order by d.deptno, e.ename;


select d.deptno,dname, empno,ename,job,sal
from emp e left outer join dept d on(d.deptno = e.deptno)
order by d.deptno, e.ename;

select d.deptno,dname, empno,ename,job,sal
from emp e right outer join dept d on(d.deptno = e.deptno)
order by d.deptno, e.ename;


select deptno,dname, empno,ename,job,sal
from emp e right outer join dept d using(deptno)
order by deptno, ename;



-- ex004
select d.deptno, dname, e1.empno, e1.ename, e1.mgr, e1.sal, e1.deptno
,losal,hisal,grade,e2.empno mgr_empno,e2.ename mgr_ename
from emp e1,dept d,salgrade s,emp e2
where e1.deptno(+) = d.deptno and e1.sal between losal(+) and hisal(+) 
and e1.mgr = e2.empno(+)
order by d.deptno,e1.empno;

select d.deptno, dname, e1.empno, e1.ename, e1.mgr, e1.sal, e1.deptno
,losal,hisal,grade,e2.empno as mgr_empno,e2.ename as mgr_ename
from emp e1 right join dept d on ( e1.deptno = d.deptno)
            left join salgrade s on(e1.sal between losal and hisal)
            left join emp e2 on(e1.mgr = e2.empno)
order by d.deptno,e1.empno;





-- 사고확장(연습문제)
--EX001
--EMP, DEPT 테이블을 이용하여
--SQL-99 이전 방식다음 , SQL-99방식 두가지 방식으로 다음과 같이 출력하시오.
--급여(SAL)이 2000초과인 사원들의 부서정보, 사원정보를 출력하시오.
--SQL-99 이전   =    (+)

--힌트)
--SELECT   DEPTNO , DNAME, EMPNO , ENAME, SAL
--FROM     DEPT D , EMP E
--WHERE    위의 두 테이블에서 DEPTNO 가 같다면    AND   급여가(SAL) > 2000

--SQL-99       inner join , left outer join , right outer join, full outer join 



--EX002
--EMP, DEPT 테이블을 이용하여
--SQL-99 이전 방식다음 , SQL-99방식 두가지 방식으로 다음과 같이 출력하시오.
--각 부서별 평균급여, 최대급여, 사원수를 출력하시오.
--SQL-99 이전   =    (+)
--힌트)
--SELECT   DEPTNO , DNAME, AVG(SAL), MAX(SAL), MIN(SAL), COUNT(*)
--FROM     DEPT D , EMP E
--WHERE    위의 두 테이블에서 DEPTNO 가 같다면   
--GROUP BY DEPTNO , DNAME


--SQL-99       inner join , left outer join , right outer join, full outer join





--EX003
--EMP, DEPT 테이블을 이용하여
--SQL-99 이전 방식다음 , SQL-99방식 두가지 방식으로 다음과 같이 출력하시오.
--모든 부서정보와 사원정보를 부서번호, 사원이름 순으로 정렬해 출력하시오.
--SQL-99 이전   =    (+)
--SQL-99       inner join , left outer join , right outer join, full outer join

--힌트)   값 중에 NULL 이 있으므로  OUTER JOIN
--SELECT   DEPTNO , DNAME, EMPNO, JOB, SAL
--FROM     DEPT D , EMP E
--WHERE    위의 두 테이블에서 DEPTNO 가 같다면    


--EX004
--EMP, DEPT 테이블을 이용하여
--SQL-99 이전 방식다음 , SQL-99방식 두가지 방식으로 다음과 같이 출력하시오.
--모든 부서정보와 사원정보, 급여등급정보, 각사원의 직속상관의 정보를
--부서번호, 사원번호 순서로 정렬해 출력하시오.
--SQL-99 이전   =    (+)
--SQL-99       inner join , left outer join , right outer join, full outer join

--힌트)   값 중에 NULL 이 있으므로  OUTER JOIN
--SELECT   DEPTNO , DNAME, EMPNO, ENAME, MGR ,  SAL, DEPTNO_1, LOSAL, HISAL, GRADE, MGR_EMPNO, MGR_ENAME
--FROM     EMP E1 , DEPT D ,  SALGRADE S, EMP E2
--WHERE    JOIN의 조건  



