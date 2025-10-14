-- 조건에 맞는 데이트 조회
-- #1. where
-- #2. 비교연산자 : (같다)=, (다르다) !=, <> ,  ^=
-- #3. 논리연산자 : AND/BETWEEN, AND (범위지정), OR/ IN , NOT
-- #4. like : 패턴검색
-- #5. null 처리 : NULL 여부 확인
-- #6. 집합연산자: UNION (중복제거하고 합집함), UNION ALL (중복 포함하고 합집함), MINUS(차집합), INTERSECT(교집합)


-- #1. 전체데이터 조회 ( emp 테이블에서)
select * from emp;

-- #2. where  조건조회
select * from emp where empno=7839; -- 같다 =
select * from emp where empno!=7839; -- 다르다 !=
select * from emp where empno<>7839; -- 다르다 <>
select * from emp where empno^=7839; -- 다르다 ^=

select * from emp where ename = 'KING';

select * from emp where empno = 7839 and ename='KING'; -- AND 두가지다 조건이 맞아야함.
select * from emp where empno = 7839 and ename='SCOTT';
select * from emp where empno = 7839 or ename='SCOTT';

select * from emp where sal*12 = 36000;
select * from emp where sal >= 3000;

select * from emp where ename >='S';
select * from emp where ename <='SOR';

select * from emp where deptno >= 20 and deptno <=30; -- >=, <=
select * from emp where deptno between 20 and 30; -- between and 는 이상과 이하

select * from emp where deptno = 10 or deptno = 30;
select * from emp where deptno in (10,30);

select * from emp where ename = 'KING';
select * from emp where ename like 'A%';
select * from emp where ename like '%A%';
select * from emp where ename like '%G';

select * from emp where ename like '_I%'; -- _ 첫글자, 두번째 글자가 I

select * from emp where comm = null; -- null 테이터 없어 - 상태
select * from emp where comm is null;
select * from emp where comm is not null;


--Q1.
select * from emp;
--Q2. 
select * from emp where deptno = 30;
--Q3. 
select * from emp where deptno = 30 and job = 'SALESMAN';

--q4. 
select * from emp where deptno = 30 or job = 'CLERK';

--q5.
select * from emp where sal*12 = 36000;

-- sql 처리순서
-- select  *                     3) * (모든컬럼값)
-- from    emp                   1) emp테이블 읽어오기
-- where   sal*12 = 360000       2) 각행에대해 (한명분의 자료묶음) sal*12 = 360000 조건평가
--Q6.
select * from emp where sal>=3000;
--Q7.
select * from emp where ename>='F';

--Q8.
select * from emp where ename<'FORZ';

--Q9.
select * from emp where  sal != 3000;

--Q10.
select * from emp where sal <>3000;

--Q11.
select * from emp where sal ^=3000;

--Q12. 
select * from emp where not sal = 3000;

--Q13.
select * from emp where job = 'manager' 
                    OR JOB = 'SALESMAN'
                    or JOB =  'CLERK';

--q14.
SELECT * FROM EMP WHERE JOB IN ('MANAGER','SALESMAN','CLEARK');
-- from ->where -> select
--q15.
select * from emp where job !='MANAGER' 
                    AND JOB <>'SALESMAN'
                    AND JOB ^='CLERK';

--q16.
select * from emp where not job in ('MANAGER','SALESMAN', 'CLERK');

--Q17.
select * from emp where sal >= 2000 and sal <=3000;

--Q18.
select * from emp where sal between 2000 and 3000;

--Q19.
select * from emp where sal not between 2000 and 3000;

--Q20.
select * from emp where ename like 'S%';

--Q21.
select * from emp where ename like '_L%';

--Q22.
select * from emp where ename like '%AM%';

--q23.
SELECT * FROM EMP WHERE ENAME NOT LIKE '%AN%';
--q24.
SELECT ENAME,SAL,SAL*12 AS ANNSAL,COMM FROM EMP;

--q25.
SELECT * FROM EMP WHERE COMM = NULL;

--q26.
SELECT * FROM EMP WHERE COMM IS NULL;

--q27.
SELECT * FROM EMP WHERE MGR IS NOT NULL;

--q28.
EMP로 부터 SAL이 NULL 이아니거나 그리고 COMM가 NULL 이면 출력한다.
-- SAL 에 비교값 없음 (NULL) FALSE AND TRUE
--q29.
SELECT * FROM EMP WHERE SAL >NULL OR COMM IS NULL;
--SAL 에 비교값 없음 (NULL) FALSE OR TRUE
