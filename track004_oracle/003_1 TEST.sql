-- 사고확장 --
--Q1. 
select *
from emp
where ename like '%S';

--Q2.
select empno,ename,job,sal,deptno
from emp
where deptno =30
and
job = 'SALESMAN';

--Q3. union X
select empno,ename,job,sal,deptno
from emp
where deptno in(20,30) 
and sal>2000;

--Q3. union O
select empno,ename,job,sal,deptno
from emp
where deptno in(20)
and sal>2000
union
select empno,ename,job,sal,deptno
from emp
where deptno in(30)
and sal>2000;

--Q4.
select *
from emp
where SAL < 2000 or SAL >3000;

--Q5.
select ename,empno,sal,deptno
from emp
where ename like '%E%' 
and deptno=30
and sal not between 1000 and 2000;



--Q6.
select *
from emp
where ename not like '_L%' 
and comm is null
and mgr is not null
and job in ('MANAGER','CLERK');


1. 2000 과 3000사이 범위
2. 두번째가 L인 글자 찾기
3. 값이 없음
4. 중복 출력
5. 3000이 아닌 SAL 값