-- 1
select *
from emp;

-- 2. 집계 sum, max, min, avg, count
select sum(sal) from emp;  -- 급여의 합계
select sum(comm) from emp;  -- null 값이 있어도 계산가능

select sal, sum(sal), max(sal), min(sal), avg(sal), count(sal) 
from emp; 

select sum(sal), max(sal), min(sal), round(avg(sal),2)평균 , count(sal) 갯수
from emp;

-- 3. group by
select   --5
from     --1
where    --2 (전체필터링)
group by --3 그룹핑
having   --4 그룹핑안에서 조건 (그룹핑 후 필터링)
order by --6

select deptno, sum(sal)
from emp
group by deptno;

-- 4. group by (합계를 구했을때  9000이상이 그룹)
select  deptno, sum(sal), count(*)
from emp
group by deptno
having sum(sal) >= 9000;

-- Q001.
select sum(sal)
from emp;
-- Q002.
select ename, sum(sal)
from emp;

select * from emp;
-- Q003.
select sum(comm)
from emp;

-- Q004.
select 
 sum(distinct sal) as "sum(distict sal)"
,sum(all sal) as "sum(allsal)"
,sum(sal) as "sum(sal)"
from emp;

-- Q005.
select count(*)
from emp;

-- Q006.
select count(*)
from emp
where deptno = 30;

-- Q007.
select count(distinct sal)
,count(all sal)
,count(sal)
from emp;

-- Q008.
select count(comm)
from emp;

-- Q009.
select count(comm)
from emp
where comm is not null;

-- Q010.
select max(sal)
from emp
where deptno = 10;

-- Q011.
select min(sal)
from emp
where deptno = 10;

-- Q012.
select max(hiredate)
from emp
where deptno = 20;

-- Q013.
select min(hiredate)
from emp
where deptno = 20;

-- Q014.
select avg(sal)
from emp
where deptno = 30;

-- Q015.
select avg(distinct sal)
from emp
where deptno = 30;

-- Q016.


select avg(sal)
from emp
where deptno = 10
union all
select avg(sal)
from emp
where deptno = 20
union all
select avg(sal)
from emp
where deptno = 30;

-- Q017
select avg(sal), deptno
from emp
group by deptno;

-- Q018.
select deptno, job,avg(sal)
from emp
group by deptno,job  -- 집계함수 (avg, sal,min, max,count) 빼고 다 그룹핑
order by deptno,job;

-- Q019.
select ename, deptno, avg(sal)
from emp
group by deptno, ename;

-- Q020.
select deptno, job, avg(sal)
from emp  -- 

group by deptno,job
having avg(sal) >=2000
order by deptno,job
;

-- Q021.
select deptno, job avg(sal) --4
from emp              --1
where avg(sal) >=2000  --2
group by deptno,job    --3
order by deptno,job;   -- 5

-- Q022.
select deptno,job,avg(sal)
from emp
group by deptno,job
having avg(sal) >=2000
order by deptno,job;

-- Q023
select deptno, job, avg(sal)
from emp
where sal <=3000
group by deptno,job
having avg(sal) >=2000
order by deptno,job
;


-- Q024
select deptno,job,count(*),max(sal),sum(sal),avg(sal)
from emp
group by deptno,job
order by deptno,job;




