-- 007_ddl_dml_tx_user.sql


-- ★ 데이터 베이스언어
-- crud (create,read,update,delete)
-- 1. dml 조작어 insert(삽입)  select(조회) update(수정) delete (지우기)  → CRUD
-- 2. ddl 정의어 create(만들기) alter (테이블 수정)  drop(삭제: 복구안됨.) → CAD
-- 3. dcl 제어어 (접근권한) grant(주세요), revoke(권한빼기)
-- 4. tcl 제어어 (트랜잭션) commit(반영), rollback(되돌리기), savepoint(지점)


--------------------------------------------------------------------------------------
-- 1. dml 조작어 insert(삽입)  select(조회) update(수정) delete (지우기)  → CRUD

-- #1. 테이블 복사해오기
create table dept_temp as select * from dept;

desc dept_temp;
select * from dept_temp;

-- #2. insert
-- insert into 테이블명 (필드1, 필드2,,,) values(값1,값2 ,,,,)

insert into dept_temp( deptno, dname, loc ) values (50, 'DATABASE', 'SEOUL');
insert into dept_temp                       valueS (60, 'NETWORK','BUSAN');
insert into dept_temp                       values (70, 'WEB', NULL    );
insert into dept_temp(deptno,loc,dname)     values (80, ' ', 'FRONT');
insert into dept_temp(loc,dname ,deptno)    values ('INCHEON', 'BACK',90);
insert into dept_temp(deptno,dname)         values (99, 'MOBILE');


commit; -- 반영

select *  from dept_temp;

-- Q1. EMP 테이블을 복사해 EMP_TEMP 테이블 만드시오.

create table EMP_TEMP as select * from emp;

desc emp_temp;
select * from emp_temp;

-- Q2. 모든필드 명시하는 방법이용해서 다음의 값 넣기 - 9999, '홍길동', 'PRESIDENT' , NULL, '2001/01/01', 5000,1000,10
insert into emp_temp(empno,ename,job,mgr,hiredate,sal,comm,deptno) values(9999, '홍길동', 'PRESIDENT' , NULL, '2001/01/01', 5000,1000,10);

-- Q3. 필드 명시 안하는 방법이용해서 다음의 값 넣기 -- 1111,'성춘향', 'MANAGER', 9999, '2001-01-05',4000, NULL,20
insert into emp_temp                                       values(1111,'성춘향', 'MANAGER', 9999, '2001-01-05',4000, NULL,20);

commit;
select * from emp_temp;

-- 1. dml 조작어 insert(삽입)  select(조회) update(수정) delete (지우기)  → CRUD


select * from dept_temp;


-- #1. update
update 테이블명
set 바꿀필드1 = 바꿀값1 , 바꿀필드2 + 바꿀값2 ,,,,
where 조건;

-- #2. 전체데이터 업데이트
update dept_temp set LOC = 'INCHEON';  -- 전체데이터 업데이트
update dept_temp set LOC = 'NEWYORK' where deptno = 10; -- 해당하는 조건
update dept_temp set LOC = 'DALLAS'  where deptno = 20 and dname = 'RESEARCH';

SELECT * FROM DEPT_TEMP;



10   ACCOUNTING   NEW YORK
20   RESEARCH   DALLAS
30   SALES   CHICAGO
40   OPERATIONS   BOSTON
50   DATABASE   SEOUL
60   NETWORK   BUSAN
70   WEB   
70   WEB   
80      FRONT
80   FRONT   
90   BACK   INCHEON
99   MOBILE   




