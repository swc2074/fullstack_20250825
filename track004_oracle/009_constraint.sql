
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

select table_name from user_tables;

create table DISEASE(
    disno number   primary key,
    disname varchar2(50),
    disex   varchar2(150),
    kindpet varchar2(200),
    infval  varchar2(200),
    mannote varchar2(200)
    );
    
create table PETDISEASE(
    disid varchar2(20),
    disname varchar2(50),
    Fedm number(10),
    Pdm  number(10),
    Proteindm number(10)
    );
    
    select * from disease;
    
    insert into disease 
    values(1,'고관절 이형성증 (CHD)'
    ,'대퇴골과 골반 연결 부위 비정상 발달로 통증 및 관절염 유발.'
    ,'리트리버, 셰퍼드 등 대형견'
    ,'발생률: 특정 대형견 품종에서 **15% ∼ 50%**까지 보고됨.'
    ,'🚨 OFA/PennHIP 평가: 유전적 소양을 생후 4개월부터 평가하여 관리 방향 설정.');
    
    insert into disease 
    values(2,
    '슬개골 탈구 (PL)'
    ,'무릎의 슬개골이 정상 위치에서 벗어남.'
    ,'말티즈, 푸들, 포메라니안 등 소형견'
    ,'국내 유병률: 소형견에서 60% ∼ 70% 이상 보고됨.'
    ,'등급 구분: 4단계 (Grade I ∼ IV) 로 구분되며, 보통 Grade II 이상에서 수술적 교정을 고려.');
    
    insert into disease 
    values(3,
    '비대성 심근증 (HCM)'
    ,'심장 근육이 두꺼워져 심장 기능 저하. 고양이 최다 발병 심장병.'
    ,'메인쿤, 랙돌, 스핑크스'
    ,'메인쿤 발생률: 20% ∼ 30% 유전적 소인 높음.'
    ,'벽 두께: 좌심실 후벽 및 중격의 두께가 6 mm 이상일 때 진단 (품종별 기준 다름).');
    
    insert into disease 
    values(4,
    '추간판 탈출증 (IVDD)'
    ,'척추 디스크 돌출로 신경 압박.'
    ,'닥스훈트, 웰시코기 등 장단족 견종'
    ,'닥스훈트 발생률: 전체 견종 중 약 20% ∼ 25% 차지 (유전적으로 취약).'
    ,'등급 구분: 5단계 (Grade I ∼ V) 로 구분되며, Grade III 이상은 마비 증상 위험.');
    
    insert into disease 
    values(5,
    '기관 허탈 (기관지 붕괴)'
    ,'기관 연골 약화로 기관이 납작하게 좁아짐.'
    ,'요크셔테리어, 포메라니안, 치와와'
    ,'발병 연령: 주로 4 ∼ 14세에 나타나며, 소형견 기관 질환의 **약 80%**를 차지.'
    ,'단계 구분: 기관 내강이 0% ∼ 100% 좁아진 정도로 심각성 평가.');
    
    insert into disease 
    values(5,
    '기관 허탈 (기관지 붕괴)'
    ,'기관 연골 약화로 기관이 납작하게 좁아짐.'
    ,'요크셔테리어, 포메라니안, 치와와'
    ,'발병 연령: 주로 4 ∼ 14세에 나타나며, 소형견 기관 질환의 **약 80%**를 차지.'
    ,'단계 구분: 기관 내강이 0% ∼ 100% 좁아진 정도로 심각성 평가.');
    
    insert into disease 
    values(6,
    '진행성 망막 위축 (PRA)'
    ,'망막 시세포 점진적 손상으로 실명.'
    ,'푸들, 코카 스패니얼, 닥스훈트'
    ,'실명 진행: 초기(야맹증)부터 최종 실명까지 수개월 ∼ 2년 내외 소요 (품종별 다름).'
    ,'유전자 검사: 특정 품종은 DNA 검사로 발병 유전자 보유 여부를 99% 정확도로 확인 가능.'
    );
    
    select * from disease;
    -- infval  varchar2(200),
    update disease set title= 'king2', content='music2' where id=1 and pass='11';

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

create table PETDISEASE(
    disid varchar2(20),
    disname varchar2(50),
    Fedm number(10),
    Pdm  number(10),
    Proteindm number(10)
    );
    
    select * from disease;


insert into petdisease 
values(
'PET-D-005'
,'고관절 이형성증 (CHD)'
,80
,0.5
,25
);

insert into petdisease 
values(
'PET-D-001'
,'슬개골 탈구 (PL)'
,80
,0.5
,25
);

insert into petdisease 
values(
'PET-D-034'
,'비대성 심근증 (HCM)'
,80
,0.5
,25
);

insert into petdisease 
values(
'PET-D-038'
,'추간판 탈출증 (IVDD)'
,80
,0.5
,25
);

insert into petdisease 
values(
'PET-D-025'
,'기관 허탈'
,80
,0.5
,25
);

insert into petdisease 
values(
'PET-D-006'
,'진행성 망막 위축 (PRA)'
,80
,0.5
,25
);

insert into petdisease 
values(
'PET-D-040-C'
,'다낭성 신장 질환 (PKD)'
,80
,0.5
,25
);

insert into petdisease 
values(
'PET-D-036'
,'뇌수두증'
,80
,0.5
,25
);


insert into petdisease 
values(
'PET-D-043-vW'
,'폰 빌레브란트 병 (vWD)'
,80
,0.5
,25
);

insert into petdisease 
values(
'PET-D-048'
,'체리아이'
,80
,0.5
,25
);

select * from petdisease;
select * from disease;

commit;


