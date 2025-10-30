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


select * from appuser;





create table post(
      ID   NUMBER not  null,
      APP_USER_ID  NUMBER not null ,
      TITLE   varchar2(200) not null,
      CONTENT  CLOB not null,
      PASS varchar2(100),
      CREATED_AT date default sysdate,
      HIT number default 0,
      primary key(id)
      );
      
      
      select * from post;
create sequence post_seq;

create table PostDto(
      ID   NUMBER not  null,
      APP_USER_ID  NUMBER not null ,
      TITLE   varchar2(200) not null,
      CONTENT  CLOB not null,
      PASS varchar2(100),
      CREATED_AT date default sysdate,
      HIT number default 0,
      primary key(id)
      );


-- 1. [글쓰기]글쓰기 sql:
	insert into post(id,               app_user_id, title, content, pass) 
	          values(post_seq.nextval,       ?    ,   ?  ,     ?  , ?   );
              
          insert into post(id,               app_user_id, title, content, pass) 
          values(post_seq.nextval,  1   ,   'king'  ,     'music'  , '11'  );
          
           insert into post(id,               app_user_id, title, content, pass) 
          values(post_seq.nextval,  1   ,   'banana'  ,     'zoo'  , '11'  );
              
              select * from post;

-- 2. [전제보기]전체글가져오기 , appuser테이블에서 email 도 같이 가져오기 sql :

	select       p.*  , u.email
	from   post p join appuser u on p.app_user_id=u.app_user_id;
	

-- 3. [상세보기]글번호 해당하는 글가져오기 sql :
	select * from post where id=1;
	update post set hit=hit+1 where id=1;

-- 4. 글수정하기 sql:
	update post set title= 'king2', content='music2' where id=1 and pass='11';

-- 5. 글번호 해당하는 삭제
	delete from post where id=1 and pass='11';

