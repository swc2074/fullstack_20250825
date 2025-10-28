-- 008_object.sql

-- 1. 시퀀스 : 자동번호생성기 ★
-- 2. 뷰    : 가상테이블 (select 문 결과를 저장한 객체)★
-- 3. 동의어 : 객체에 대한 별칭
-- 4. 인덱스 : 검색성능향상 ★
-- 5. 클러스터 : 여러테이블을 물리적으로 같은공간에 저장


---------------------------------------------------------
-- 1. 시퀀스 : 자동번호생성기 ★
---------------------------------------------------------
create sequence emp_seq;  -- 시작1, 증가단위 1, 10^27
create sequence dept_seq;

create sequence emp_seq2
start with 1000 -- 시퀀스 시작값
increment by    -- 몇개씩증가?
maxvalue  9999  -- 최대값 까지 지정가능
nocache;        -- 메모리에 미리 몇개 값저장해둘지....


-- #2. 시퀀스 사용하기
select emp_seq.nextval from dual;
select dept_seq.nextval from dual;

desc dept_test;

select table_name from user_tables;
insert into dept_temp values (dept_seq.nextval,'ai','INCHEON');
select * from dept_temp;

-- Q appuser_seq 시퀀스만들기;

create sequence appuser_seq;

desc appuser;

alter table appuser modify email varchar2(100) not null unique;  -- 유일한값

drop table appuser;

create table appuser(
      APP_USER_ID NUMBER NOT NULL primary key,
      EMAIL   varchar2(100) not null unique,
      password  varchar2(100),
      MBTI_TYPE_ID number,
      CREATED_AT date
      );


select column_name from user_ind_columns where table_name='appuser' and  column_name='email';

SELECT table_name, constraint_name, column_name
FROM user_cons_columns
WHERE constraint_name IN (
  SELECT constraint_name
  FROM user_constraints
  WHERE constraint_type = 'U'
);

delete from appuser;
select table_name from user_tables;

select * from appuser;
delete from appuser where app_user_id !=24910;





