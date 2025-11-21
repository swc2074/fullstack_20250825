select * from disease;
create sequence disno_seq;
commit;

insert into disease(disno,disname,disex,kindpet,infval,mannote) values(disno_seq.nextval, '테스트', '설명?', '종류 ?', '정보값 ?', '관리주의?');
insert into disease(disno,disname,disex,kindpet,infval,mannote) values(disno_seq.nextval, '테스트1', '설명1?', '종류1 ?', '정보값1 ?', '관리주의1?');
insert into disease(disno,disname,disex,kindpet,infval,mannote) values(disno_seq.nextval, '테스트12', '설명12?', '종류12 ?', '정보값12 ?', '관리주의12?');
insert into disease(disno,disname,disex,kindpet,infval,mannote) values(disno_seq.nextval, '테스트123', '설명123?', '종류123 ?', '정보값123 ?', '관리주의123?');
insert into disease(disno,disname,disex,kindpet,infval,mannote) values(disno_seq.nextval, '테스트1234', '설명1234?', '종류1234 ?', '정보값1234 ?', '관리주의1234?');

select * from disease;
select * from disease where disno=3;

select * from post;

update disease set disname= '비대성심근증(HCM)',disex='심장근육이 두꺼워져 심장 기능저하. 고양이 최다 발병 심장병.',kindpet='고양이,메인쿤, 랙돌, 스핑크스', infval = '메인쿤 발생률: 20%∼30% 유전적 소인 높음.', mannote = '벽두께: 좌심실 후벽 및 중격의 두께가 6 mm 이상일 때 진단(품종별 기준 다름).'  where disno = 3;

delete from disease where disno = 21;
commit;



create table userinfo(
    no number not null,
    email varchar2(100)  not null,
    age number     
);

create table userinfo1(
    no number not null,
    email varchar2(100)  not null,
    age number     
);

commit;

desc unserinfo;

create table userinfo(
no number not null primary key,
email varchar2(100) not null unique,
age number
);

desc userinfo;
create sequence userinfo_seq;
          
insert into userinfo(no, email, age) 
          values(post_seq.nextval,  'nn@naver.com'   , '20'  );  
          
insert into userinfo(no, email, age) 
          values(post_seq.nextval,  '444@naver.com'   , '40'  );
insert into userinfo(no, email, age) 
          values(post_seq.nextval,  '555@naver.com'   , '30'  );
insert into userinfo(no, email, age) 
          values(post_seq.nextval,  '222@naver.com'   , '10'  );
          
insert into userinfo(no, email, age) 
          values(post_seq.nextval,  '222@naver.com'   , '10'  );  
          
select * from userinfo;  
select * from userinfo where no = 1;
update userinfo set age=40 where no=1;
update userinfo set age=40, email = 'ddd' where no=1;
delete from userinfo where no=1;

          
          
          
select * from post;

select       p.*  , u.email
	from   post p join appuser u on p.app_user_id=u.app_user_id;
	
select * from post where id=1;
update post set hit=hit+1 where id=1;
update post set title= 'king2', content='music2' where id=1 and pass='11';

delete from post where id=1 and pass='11';



-- ex004 
create table milk(
mno number not null primary key,
mname varchar2(100) not null unique,
mnum number not null,
mtotal number
);

select * from milk;
create SEQUENCE milk_seq;
desc milk;
       
insert into milk(mno,mname,mnum,mtotal) 
          values(milk_seq.nextval,  'white'   , '1', '1000'  );  
          
        
            
select * from milk where no = 1;
update milk set nname='name3' where mno=1;
update milk set mname='banana', mnum=1, mtotal=2000 where mno=2;
delete from milk where mno=1;
delete from milk;

alter table milk rename column nname to mname;
alter table milk rename column nnum to mnum;

commit;
de
-----------------------------


   연습문제) 프로젝트 새로만들기~!
      Q1. spring 프로젝트 spring005 만드시오.
      Q2. datasource설정하는 
         root-context.xml 과  application.properties를 작성하시오.
      Q3. ApplicationContext, DataSource를 테스트하시오.
      Q4. mybatis를   
         root-context.xml 에 설정하고 mybatis 테스트를 하시오.
      Q5. table 작성 - sql 기본구문 5개 작성
      Q6. dto 작성
      Q7. dao 작성
      Q8. dao 테스트

      SQL> desc sboard1;
      Name                                      Null?    Type
      ----------------------------------------- -------- ----------------------------
      ID                                        NOT NULL NUMBER
      APP_USER_ID                               NOT NULL NUMBER
      BTITLE                                    NOT NULL VARCHAR2(1000)
      BCONTENT                                  NOT NULL CLOB
      BPASS                                     NOT NULL VARCHAR2(255)
      BFILE                                              VARCHAR2(255)
      BHIT                                               NUMBER(10)  default 0
      BIP                                       NOT NULL VARCHAR2(255)
      CREATE_AT                                          TIMESTAMP(6) default sysdate

----------------------------------
alter table sboard1 rename column CREATE_AT to "createdAt";
create table sboard1(

      ID              NUMBER  NOT NULL  primary key
      ,APP_USER_ID     NUMBER NOT NULL
      ,BTITLE          VARCHAR2(1000) NOT NULL
      ,BCONTENT        CLOB  NOT NULL
      ,BPASS           VARCHAR2(255) NOT NULL
      ,BFILE           VARCHAR2(255) default 'no.png'
      ,BHIT            NUMBER(10)  default 0
      ,BIP             VARCHAR2(255) NOT NULL
      ,CREATED_AT       TIMESTAMP(6) default systimestamp

);

update sboard1  set bhit = bhit + 1   where id=19;

delete  from sboard1;
drop table sboard1;
DESC SBOARD1;
select * from sboard1;
create sequence sboard1_seq;

--insert:
         insert into sboard1(ID , APP_USER_ID, BTITLE, BCONTENT, BPASS, BIP)
         values (sboard1_seq.nextval , 21, 'title', 'content', '1111', '127.0,0,1');
         
         insert into sboard1(ID , APP_USER_ID, BTITLE, BCONTENT, BPASS, BIP)
         values (sboard1_seq.nextval , 22, 'title22', 'content22', '2222', '127.0,0,1');
         
         insert into sboard1(ID , APP_USER_ID, BTITLE, BCONTENT, BPASS, BIP)
         values (sboard1_seq.nextval , 23, 'title33', 'content33', '3333', '127.0,0,1');
         
         insert into sboard1(ID , APP_USER_ID, BTITLE, BCONTENT, BPASS, BIP)
         values (sboard1_seq.nextval , 24, 'title44', 'content44', '4444', '127.0,0,1');
         
          insert into sboard1(ID , APP_USER_ID, BTITLE, BCONTENT, BPASS, BIP)
         values (sboard1_seq.nextval , 25, 'title44', 'content55', '5555', '127.0,0,1');
         
--selectAll
         select * from sboard1  order by id desc;

--select
        select * from sboard1 where id=4;
--update
        update sboard1
        set BTITLE='new14', BCONTENT='content1'
        where id=4 and BPASS='4444';

--delete
        delete from sboard1 where id=4 and BPASS='4444';

select * from sboard1;

commit;


--1117 ex006
-----------------------------------------------------------------
이름           널?       유형            
------------ -------- ------------- 
APP_USER_ID  NOT NULL NUMBER        
EMAIL        NOT NULL VARCHAR2(100) 
PASSWORD              VARCHAR2(100) 
MBTI_TYPE_ID          NUMBER        
CREATED_AT            DATE  


desc appuser;
select * from appuser;
create sequence appuserid_seq;

--insert:
insert into appuser(APP_USER_ID, EMAIL, PASSWORD, MBTI_TYPE_ID)
         values (appuserid_seq.nextval ,'A@A', 1111, 3);


         insert into appuser(APP_USER_ID, EMAIL, PASSWORD, MBTI_TYPE_ID, CREATED_AT)
         values (appuserid_seq.nextval ,'A@A', 1111, 3, SYSDATE);
         
         insert into appuser(APP_USER_ID, EMAIL, PASSWORD, MBTI_TYPE_ID, CREATED_AT)
         values (appuserid_seq.nextval ,'A@B', 1111, 4, SYSDATE);
         
         insert into appuser(APP_USER_ID, EMAIL, PASSWORD, MBTI_TYPE_ID, CREATED_AT)
         values (appuserid_seq.nextval ,'A@C', 1111, 5, SYSDATE);
         
           insert into appuser(APP_USER_ID, EMAIL, PASSWORD, MBTI_TYPE_ID, CREATED_AT)
         values (appuserid_seq.nextval ,'A@D', 1111, 6, SYSDATE);
         
          insert into appuser(APP_USER_ID, EMAIL, PASSWORD, MBTI_TYPE_ID, CREATED_AT)
         values (appuserid_seq.nextval ,'A@E', 1111, 7, SYSDATE);
         
         insert into appuser(APP_USER_ID, EMAIL, PASSWORD, MBTI_TYPE_ID, CREATED_AT)
         values (appuserid_seq.nextval ,'A@F', 1111, 8, SYSDATE);
         
        
--selectAll
         select count(*) cnt from appuser where  email='A@z'   and password='1111'
         select * from appuser  order by APP_USER_ID desc;
         select * from appuser  where APP_USER_ID=2;

--select
        select * from appuser where APP_USER_ID=4;
--update
        update appuser
        set EMAIL='A@B', MBTI_TYPE_ID=5
        where APP_USER_ID=1 and PASSWORD=1111;

--delete
        delete from appuser where APP_USER_ID=6 and PASSWORD=11;
        delete from post where APP_USER_ID=6 and PASSWORD=11;
        
        delete from appuser;
        truncate table appuser;
        select * from appuser;

select * from post where APP_USER_ID = 6;


-----------------------------------------------------
-----------------------------------------------------
desc appuser;
select * from appuser;
--      create : 회원가입 (시퀀스이용)
insert into appuser (APP_USER_ID , EMAIL, PASSWORD, MBTI_TYPE_ID)  
values (appuser_seq.nextval, 'a@a' , '1111',1);

--      read   : 로그인(이메일과 비번이 같으면 로그인) , 마이페이지 (세션이용), 전체 유저확인
select count(*) cnt from appuser  where  email='a@a'  and PASSWORD='1111';
select * from appuser   order by app_user_id desc; 
select * from appuser   where app_user_id=21; 
--
--      update : 마이페이지 정보수정 (mbti와 비밀번호 수정할수 있게)
update appuser  set  password='1234' , MBTI_TYPE_ID=2  where app_user_id=2  and password='1111'; 
--      delete : 탈퇴
delete from appuser  where app_user_id=6  and password='11'; 
------------------------------------------------------------
------------------------------------------------------------

select table_name from user_tables;
delete from MBTITYPE;
delete from post;
desc appuser;
select * from appuser;

SELECT username, account_status FROM dba_users WHERE username='scott';
alter table appuser add (bhit number);
alter table appuser add (id number);

select * from appuser 
where app_user_id = 21;
desc appuser;

select count(*) cnt from appuser where email='1@1';

delete from appuser
where app_user_id = 1;
