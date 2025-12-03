--운동정보테이블 (1단계 CRUD 파트)
--| 필드명             | 타입           | 설명 |
--|--------------------|----------------|------|
--| `execid`      | INT (PK)       | 운동 고유 ID |
--| `exectype`    | VARCHAR(50)    | 운동 종류 (예: 산책, 수영, 노즈워크 등) |
--| `description`      | VARCHAR(255)   | 운동에 대한 간단 설명 |
--| `avgkcal30min` | FLOAT        | 평균 칼로리 소모량 (소형견 기준, 30분 기준) |
--| `exectargetmin` | INT   | 권장 운동 시간 (분) |
--| `suitablefor`     | VARCHAR(100)   | 추천 대상 (예: 소형견, 노령견 등) |
--| `intensitylevel`  | VARCHAR(20)    | 운동 강도 (예: 저강도, 중강도, 고강도) |
--| `createdat`       | DATETIME       | 등록일 |
--| `updated_at`       | DATETIME       | 수정일 |


--(1, '산책', '가장 기본적인 야외 운동으로 스트레스 해소와 사회성 향상에 효과적입니다.', 80.0, 30, '모든 견종, 노령견 포함', '저강도', NOW(), NOW()),
--
--(2, '노즈워크', '간식을 숨겨두고 냄새로 찾게 하는 놀이로, 정신 자극과 집중력 향상에 좋습니다.', 60.0, 20, '실내 생활견, 고양이도 가능', '저강도', NOW(), NOW()),
--
--(3, '수영', '관절에 부담이 적고 전신 근육을 사용하는 고강도 운동입니다.', 120.0, 25, '중형견 이상, 관절 약한 반려동물', '고강도', NOW(), NOW()),
--
--(4, '터그놀이', '줄다리기 형태의 놀이로, 근력과 집중력을 동시에 향상시킵니다.', 70.0, 15, '활동적인 소형견, 고양이도 가능', '중강도', NOW(), NOW()),
--
--(5, '레이저 포인터 추적', '고양이에게 인기 있는 실내 운동으로, 사냥 본능을 자극합니다.', 50.0, 10, '고양이 전용, 실내 생활 반려동물', '중강도', NOW(), NOW());

-- desc exerciseinfo;
-- delete from exerciseinfo;
-- commit;

-- select     column_name, data_default
-- from       user_tab_columns
-- where      table_name='POST';

create sequence exerciseinfo_seq;

create table exerciseinfo(
    execid         int           primary key,
    exectype       VARCHAR2(50),
    description    VARCHAR2(255),
    avgkcal30min   FLOAT,
    exectargetmin  int,
    suitablefor    VARCHAR2(100),
    intensitylevel VARCHAR2(100),
    createdat      DATE  DEFAULT SYSDATE,
    updatedat      DATE  DEFAULT SYSDATE
 );

insert into exerciseinfo (execid, exectype, description, avgkcal30min, exectargetmin, suitablefor, intensitylevel ) 
values(exerciseinfo_seq.nextval, '산책', '기본적인 야외활동/스트레스 해소', 80.0, 30, '모든 견종, 노령견 포함', '저강도' );

select * from exerciseinfo;

select * from exerciseinfo  where  execid=1;  
  
update exerciseinfo set exectype='1', description='1', avgkcal30min=10.0, exectargetmin=5, suitablefor='1', intensitylevel='1'     where  execid=1;

delete from exerciseinfo   where  execid=1;

commit;

drop table exerciseinfo;

--insert into exerciseinfo(execid,
--                         exectype,
--                         description,
--                         avgkcal30min,
--                         exectargetmin,
--                         suitablefor,
--                         intensitylevel,
--                         createdat,
--                         updatedat) 
--values ( 1,
--        '산책',
--        '가장 기본적인 야외 운동으로 스트레스 해소와 사회성 향상에 효과적입니다.',
--        80.0,
--        30,
--        '모든 견종, 노령견 포함',
--        '저강도',
--        2025/11/3,
--        2025/11/3);

insert into exerciseinfo (execid, exectype, description, avgkcal30min, exectargetmin, suitablefor, intensitylevel ) 
values(exerciseinfo_seq.nextval,
       '노즈워크', 
       '간식을 숨겨두고 냄새로 찾게 하는 놀이로, 정신 자극과 집중력 향상에 좋습니다.', 
       60.0,
       20, 
       '실내 생활견, 고양이도 가능',
       '저강도');
       
insert into exerciseinfo (execid, exectype, description, avgkcal30min, exectargetmin, suitablefor, intensitylevel ) 
values(exerciseinfo_seq.nextval,
       '수영', 
       '관절에 부담이 적고 전신 근육을 사용하는 고강도 운동', 
       120.0, 
       25, 
       '중형견 이상, 관절 약한 반려동물', 
       '고강도'
 );
  
insert into exerciseinfo (execid, exectype, description, avgkcal30min, exectargetmin, suitablefor, intensitylevel ) 
values(exerciseinfo_seq.nextval,
        '터그놀이', 
        '줄다리기 형태의 놀이로, 근력과 집중력을 동시에 향상', 
        70.0,
        15, 
        '활동적인 소형견, 고양이도 가능',
        '중강도'
        );
  
 
insert into exerciseinfo (execid, exectype, description, avgkcal30min, exectargetmin, suitablefor, intensitylevel ) 
values(exerciseinfo_seq.nextval,
        '레이저 포인터 추적', 
        '고양이에게 인기 있는 실내 운동, 사냥 본능을 자극', 
        50.0, 
        10, 
        '고양이 전용, 실내 생활 반려동물', 
        '중강도'
    );














