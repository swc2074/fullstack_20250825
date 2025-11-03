
-- ■ 제약조건
1. not null  null 입력금지
2. unique    중복금지, null 허용
3. primary key 고유식별자, 중복/null금지
4. foreign key 다른테이블 참조
5. check       조건검사


-- rdb
-- 테이블 관계 속성
-- foreign key
-- 1. 다른 테이블 참조
-- 2. 부모테이블의 값만 입력 가능
-- 3. 참조무결성 유지


-- 부서는 많은 사원(emp_fk)을 가진다.
-- 부서테이블(dept_fk)이 먼저 존재


create table DEPT_FK(
    deptno number primary key,
    dname varchar2(50)
);


create table EMP_FK(
    empno number primary key,
    ename varchar2(50)  not null,
    deptno number(2),
    constraint FK_DEPT foreign key(deptno) reference DEPT_FK(deptno) ON DELETE CASCADE                  
);
 -- 내테이블의 DEPTNO       부모테이블 (DEPTNO)
-- 

CREATE  TABLE  DEPT_FK(
    DEPTNO  NUMBER        PRIMARY KEY,   
    DNAME   VARCHAR2(50)
);

CREATE  TABLE  EMP_FK(
    EMPNO  NUMBER        PRIMARY KEY, 
    ENAME  VARCHAR2(50)  NOT NULL,
    DEPTNO NUMBER(2),
    CONSTRAINT FK_DEPT  FOREIGN KEY(DEPTNO)  REFERENCES  DEPT_FK(DEPTNO) ON DELETE CASCADE
);                    --  내테이블의 DEPTNO              부모테이블(DPETNO)

select table_name from user_tables;

-- 1. INSERT : dept_fk
10, 'bug_hunter'
20, 'pawject'

insert into dept_fk values(10, 'bug_hunter');
insert into dept_fk values(20, 'pawject');
insert into dept_fk values(30, 'test');

insert into emp_fk(empno,ename,deptno) values(1,'first',30);
insert into emp_fk(empno,ename,deptno) values(2,'second',40); -- parent key not found 부모에 없는값은 못넣음.
insert into emp_fk(empno,ename,deptno) values(3,'third',50);

select * from dept_fk;


-- 2. on delete casecade

delete from dept_fk where deptno=30;
select * from emp_fk;

-- Q1. jsp + orcle 외래키
desc appuser;
이름           널?       유형            
------------ -------- ------------- 
APP_USER_ID  NOT NULL NUMBER        
EMAIL        NOT NULL VARCHAR2(100) 
PASSWORD              VARCHAR2(100) 
MBTI_TYPE_ID          NUMBER        
CREATED_AT            DATE  

desc post;


이름          널?       유형            
----------- -------- ------------- 
ID          NOT NULL NUMBER        
APP_USER_ID NOT NULL NUMBER        
TITLE       NOT NULL VARCHAR2(200) 
CONTENT     NOT NULL CLOB          
PASS                 VARCHAR2(100) 
CREATED_AT           DATE          
HIT                  NUMBER 


alter table  post add constraint fk_post_appuser foreign key(app_user_id)  references appuser(app_user_id);

select app_user_id
from post
where app_user_id not in(select app_user_id from appuser;);

select constraint_name, table_name,column_name
from user_cons_columns
where table_name = 'POST';

delete from appuser;
delete from post;
commit;


ALTER TABLE  post  ADD CONSTRAINT  fk_post_appuser  FOREIGN KEY(APP_USER_ID)   REFERENCES  appuser(APP_USER_ID);

SELECT  constraint_name, table_name , column_name 
from  user_cons_columns
where  table_name='POST';  --대문자

delete from appuser;
delete from post;
commit;

select * from post;
