-- #1. 테이블구조확인
desc emp;



desc dept;


show user;  -- 실행) 현재줄 선택하고 ctrl + enter
select table_name  from user_tables;  - 사용할 수 있는 테이블 확인
-- #2. 전체 테이블 조회

select * from emp;


-- #3. 열조회
select empno, ename from emp;
select ename, job   from emp;


-- #4. 
select distinct  job from emp;
select all job from emp;

-- #5. 연산 및 별칭

desc emp;
-- 3달치 급여

select ename "유저", sal as "월급" , sal+sal+sal  as "3달치 월급" from emp;


-- #6. 정렬
select ename, sal  
from emp   
order by sal asc;  -- asc는 오름차순

select ename, sal from emp order by sal desc; --desc는 내림차순


