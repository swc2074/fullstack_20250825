-- Q1.  dept_temp  모든데이터 삭제

delete from dept_temp;

commit;
select * from dept_temp;
-- Q2.  insert 이용해서 데이터 삽입, 반영



insert into dept_temp select deptno,dname,loc from dept;

select * from dept_temp;
rollback; 
commit;

-- Q3.  dept_temp 테이블에서  40번부서의이름을 DATABASE ,  지역을 SEOUL로 수정하시오.
update dept_temp 
set dname = 'DATABASE' , LOC = 'SEOUL' WHERE DEPTNO=40;

select * from dept_temp;

-- Q4. 위데이터 되돌리기
rollback;




-- #0. 준비 -  다음 문제들을 풀으시오
-- Q1. DEPT 테이블을 복사해 DEPT_TCL테이블을 작성하시오.
create table dept_tcl as select * from dept;
desc dept_tcl;
select * from dept_tcl;

commit;

-- Q2. DEPT_TCL 테이블에 다음과 같이 데이터를 입력, 수정, 삭제 하시오.
--    2-1.  데이터 삽입   50, 'DATABASE', 'SEOUL'
delete from dept_tcl;
rollback;
commit;

insert into dept_tcl values (50, 'DATABASE', 'SEOUL');

--    2-2.  부서번호가 40인  LOC를 INCHEON 으로 수정
update dept_tcl set loc = 'INCHEON' where deptno = 40;
--    2-3.  DNAMD이 RESEARCH 인데이터 삭제
delete from dept_tcl where dname = 'RESEARCH';
--    2-4.  전체데이터 확인

select * from dept_tcl;


-- #1. 데이터 반영 (INSERT, UPDATE, DELETE)
COMMIT;
-- #2. 데이터 되돌리기(  COMMIT 이후에는 ROLLBACK 효과 X)

ROLLBACK;

INSERT INTO DEPT_TCL  DEPT_TCL VALUES (20,'AI','INCHEON');
ROLLBACK;
SELECT * FROM DEPT_TCL;

-- #3. SAVEPOINT

insert inTO dept_tcl values (60,'AI','INCHEON');  -- insert (작업하고 저장)
SAVEPOINT sp_insert;  -- 기준접 1


UPDATE DEPT_TCL SET DEPTNO = 20 WHERE DEPTNO =60; -- update 설정(작업하고 저장)
SAVEPOINT SP_UPDATE;  -- insert 확정, 이후작업만 되돌리기(기준점 설정2)

ROLLBACK TO sp_insert;


✅ 문제 1:  다음과 같이 테이블을 작성하고 데이터를 삽입하세요
※AppUser 의 FK는 무시하세요.

create table MbtiType (
               mbit_type_id number(2) primary key,
               name         varchar(10)not null,
               description  varchar(50)
               );
               
select * from MbtiType;

insert into MbtiType values(3, 'ENFP', '열정적이고 창의적인 성향');
insert into MbtiType values(7, 'INTJ', '논리적이고 전략적인 성향');


#### 1. `MbtiType`
| 필드명 | 타입 | 설명 |
|--------|------|------|
| mbti_type_id | INT (PK) | MBTI 유형 ID |
| name | VARCHAR(10) | 유형 이름 (예: ENFP) |
| description | TEXT | 성향 설명 |

**예시 데이터**
```sql
(3, 'ENFP', '열정적이고 창의적인 성향')
(7, 'INTJ', '논리적이고 전략적인 성향')
```
---an
create table MbtiType(
  mbti_type_id number primary key,
  name varchar2(10),
  description varchar2(100)
);

select * from MbtiType;

-- number,varchar2


#### 2. `AppUser`
| 필드명 | 타입 | 설명 |
|--------|------|------|
| app_user_id | INT (PK) | 사용자 고유 ID |
| email | VARCHAR(100) | 이메일 주소 |
| password | VARCHAR(255) | 암호화된 비밀번호 |
| mbti_type_id | INT (FK → MbtiType.mbti_type_id) | 연결된 MBTI 유형 |
| created_at | DATETIME | 가입일 |

**예시 데이터**
```sql
(1, 'alice@example.com', 'hashed_pw_123', 3, 2, '2025-10-01 10:00:00')
(2, 'bob@example.com', 'hashed_pw_456', 7, 1, '2025-10-02 14:30:00')
```
create table AppUser(
       app_user_id number(2) primary key,
       email varchar(100) not null,
       password varchar(255),
       mbti_type_id number(2),
       
       created_at date('yyyy-mm-dd hh:mm:ss')
       
       );
   
select * from AppUser;    

alter table AppUser add (MbtiType.mbti_type_id) as FK number(10);


insert into AppUser values((1, 'alice@example.com', 'hashed_pw_123', 3, 2, '2025-10-01 10:00:00');


--- an
create table AppUser(
 app_user_id number(5) primary key,
 email      varchar2(100),
 password   varchar2(255),
 mbti_type_id number(3),
 created_at  date
 );

select * from AppUser;

✅ 문제 1: AppUser 테이블에 사용자 이름(name) 컬럼을 추가하세요.
컬럼 타입은 VARCHAR2(50)이며 NULL 허용

alter table AppUser add name varchar2(50);
desc AppUser;

✅ 문제 2: AppUser 테이블의 email 컬럼에 NOT NULL 제약을 추가하세요.
alter table AppUser modify email varchar2(100) not null;

alter table AppUser email varchar(100) not null;
 
✅ 문제 3: AppUser 테이블의 password 컬럼 길이를 255 → 100으로 줄이세요.

alter table AppUser modify password varchar2(100);
 
✅ 문제 4: MbtiType 테이블에 컬럼 category를 추가하세요.
타입은 VARCHAR2(20)이며 기본값은 '기본'

alter table MbtiType add category varchar2(20) default '기본';

select column_name, data_default
from    user_tab_columns
where   table_name = 'MBTITYPE'; -- 테이블명 대문자

desc MbtiType;
 
✅ 문제 5: MbtiType 테이블의 description 컬럼 이름을 details로 변경하세요.

alter table MbtiType rename column description to details;
 
✅ 문제 6: AppUser 테이블의 name 컬럼을 삭제하세요.

alter table AppUser add name varchar(50);

alter table AppUser drop column NAME;
DESC AppUser;
 
✅ 문제 7:  MbtiType 테이블 이름을 MbtiInfo로 변경하세요.
alter table MbtiType rename to MbtiInfo;
desc MbtiInfo;

alter table MbtiInfo rename to MbtiType;
desc MbtiType;



