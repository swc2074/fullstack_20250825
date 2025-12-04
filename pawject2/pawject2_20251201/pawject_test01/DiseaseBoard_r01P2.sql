select table_name from user_tables;

alter table disease add createdat date;
alter table disease add BIP varchar2(100);
ALTER TABLE disease ADD bhit NUMBER DEFAULT 0;
commit;
desc disease;
select * from disease; 

-- 질환 보드 테이블
create table DISEASE(
    disno number   primary key,
    disname varchar2(50),
    disex   varchar2(150),
    kindpet varchar2(200),
    infval  varchar2(200),
    mannote varchar2(200),
    bhit      NUMBER           NOT NULL,
    createdat   DATE             NOT NULL,
    );

create sequence disease_seq;
select sequence_name from user_sequences;
create sequence disno_seq;
desc disease;
select * from disease;
delete from disease;


    
   insert into disease 
    (DISNO , DISNAME ,DISEX, KINDPET,INFVAL,MANNOTE)
    values(disno_seq.nextval
    ,'고관절 이형성증 (CHD)'
    ,'대퇴골과 골반 연결 부위 비정상 발달로 통증 및 관절염 유발.'
    ,'리트리버, 셰퍼드 등 대형견'
    ,'발생률: 특정 대형견 품종에서 **15% ∼ 50%**까지 보고됨.'
    ,'🚨 OFA/PennHIP 평가: 유전적 소양을 생후 4개월부터 평가하여 관리 방향 설정.');
    
    insert into disease 
    (DISNO , DISNAME ,DISEX, KINDPET,INFVAL,MANNOTE)
    values(disno_seq.nextval,
    '슬개골 탈구 (PL)'
    ,'무릎의 슬개골이 정상 위치에서 벗어남.'
    ,'말티즈, 푸들, 포메라니안 등 소형견'
    ,'국내 유병률: 소형견에서 60% ∼ 70% 이상 보고됨.'
    ,'등급 구분: 4단계 (Grade I ∼ IV) 로 구분되며, 보통 Grade II 이상에서 수술적 교정을 고려.');
    
    insert into disease 
    values(disno_seq.nextval,
    '비대성 심근증 (HCM)'
    ,'심장 근육이 두꺼워져 심장 기능 저하. 고양이 최다 발병 심장병.'
    ,'메인쿤, 랙돌, 스핑크스'
    ,'메인쿤 발생률: 20% ∼ 30% 유전적 소인 높음.'
    ,'벽 두께: 좌심실 후벽 및 중격의 두께가 6 mm 이상일 때 진단 (품종별 기준 다름).');
    
    iinsert into disease 
    (DISNO , DISNAME ,DISEX, KINDPET,INFVAL,MANNOTE) 
    values(disno_seq.nextval,
    '추간판 탈출증 (IVDD)'
    ,'척추 디스크 돌출로 신경 압박.'
    ,'닥스훈트, 웰시코기 등 장단족 견종'
    ,'닥스훈트 발생률: 전체 견종 중 약 20% ∼ 25% 차지 (유전적으로 취약).'
    ,'등급 구분: 5단계 (Grade I ∼ V) 로 구분되며, Grade III 이상은 마비 증상 위험.');
    
    insert into disease 
    (DISNO , DISNAME ,DISEX, KINDPET,INFVAL,MANNOTE)
    values(disno_seq.nextval,
    '기관 허탈 (기관지 붕괴)'
    ,'기관 연골 약화로 기관이 납작하게 좁아짐.'
    ,'요크셔테리어, 포메라니안, 치와와'
    ,'발병 연령: 주로 4 ∼ 14세에 나타나며, 소형견 기관 질환의 **약 80%**를 차지.'
    ,'단계 구분: 기관 내강이 0% ∼ 100% 좁아진 정도로 심각성 평가.');
    

    
    insert into disease 
    (DISNO , DISNAME ,DISEX, KINDPET,INFVAL,MANNOTE)
    values(disno_seq.nextval,
    '진행성 망막 위축 (PRA)'
    ,'망막 시세포 점진적 손상으로 실명.'
    ,'푸들, 코카 스패니얼, 닥스훈트'
    ,'실명 진행: 초기(야맹증)부터 최종 실명까지 수개월 ∼ 2년 내외 소요 (품종별 다름).'
    ,'유전자 검사: 특정 품종은 DNA 검사로 발병 유전자 보유 여부를 99% 정확도로 확인 가능.'
    );
    
    insert into disease 
    (DISNO , DISNAME ,DISEX, KINDPET,INFVAL,MANNOTE) 
    values(disno_seq.nextval,
    '다낭성 신장 질환 (PKD)'
    ,'신장에 낭종(물혹)이 생겨 신부전 유발.'
    ,'페르시안, 엑조틱, 히말라얀'
    ,'페르시안 유병률: 지역 및 혈통에 따라 **최대 30% ∼ 50%**에서 유전자 검사 양성.'
    ,'낭종 크기: 신장 초음파 상 1 mm 크기의 낭종부터 확인 가능하며 크기 증가에 따라 신기능 저하.'
    );
    
    
    insert into disease 
    (DISNO , DISNAME ,DISEX, KINDPET,INFVAL,MANNOTE)
    values(disno_seq.nextval,
    '뇌수두증 (Hydrocephalus)'
    ,'뇌척수액 과다 축적으로 뇌 압박.'
    ,'치와와, 말티즈, 포메라니안 등 소형견'
    ,'진단 기준: MRI/CT 상 뇌실 지수(VH Ratio)가 0.4 이상일 때 의심.'
    ,'수술 성공률: 션트 수술 성공률은 보고에 따라 **50% ∼ 90%**로 다양.'
    );
    
   insert into disease 
    (DISNO , DISNAME ,DISEX, KINDPET,INFVAL,MANNOTE)
    values(disno_seq.nextval,
    '폰 빌레브란트 병 (vWD)'
    ,'혈액 응고 인자 부족으로 출혈 경향.'
    ,'도베르만, 셰틀랜드 쉽독, 푸들'
    ,'도베르만 유병률: **약 60%**의 개체가 유전자 변이를 보유하며, **최소 10%**가 출혈 증상을 보임.'
    ,'응고 인자 수치: vWF 인자 농도가 50% 이하일 때 임상 증상 위험 증가.'
    );
    
    insert into disease 
    (DISNO , DISNAME ,DISEX, KINDPET,INFVAL,MANNOTE)
    values(disno_seq.nextval,
    '체리아이 (Cherry Eye)'
    ,'제3안검 눈물샘이 밖으로 돌출.'
    ,'불독, 비글, 코카 스패니얼, 시츄'
    ,'재발률: 단순 봉합술 시 재발률이 **5% ∼ 40%**로 보고되며, 수술 방법에 따라 다름.'
    ,'돌출 지속 시간: 수 시간 이내에 복원 수술을 받는 것이 눈물샘 기능 유지에 유리.'
    );
    
    commit;

ALTER TABLE disease MODIFY infval VARCHAR2(1000);
ALTER TABLE disease MODIFY CREATEDAT  date default sysdate;

desc disease; 



-- 1. create (insert)
insert into disease (disno,disname,disex,kindpet,infval,mannote)
values(disno_seq.nextval, ?, ?, ?, ?, ?);

--2. selectAll
select * from disease order by disno desc;


-- 페이징 ??
select  *
from  (
  select row_number() over (order by createdat desc) as rnum,
          oxno, disno, oxquestion, oxanswer, oxcomment, oxbhit, createdat
   from  disease_ox 
)  A
where   A.rnum  between  #{start}   and #{end};

select *
from (
   select row_number() over (order by createdat desc) as rnum,
          oxno, disno, oxquestion, oxanswer, oxcomment, oxbhit, createdat
   from disease_ox
) A
where A.rnum between 1 and 5;

desc disease_ox;

--3. select 단일 조회
SELECT *
FROM disease
WHERE disno = #{disno};

select * from disease where disno=?

--4.조회수 업데이트 올리기 ??
update  disease   set     bhit = bhit + 1    where   id=#{id};

update disease
set bhit = bhit + 1
where disno = 14;

--5. OX 문제 수정 (UPDATE)
UPDATE disease
SET 
    disname      = #{disname},
    disex = #{disex},
    kindpet   = #{kindpet},
    infval  = #{infval},
    mannote  = #{mannote}
   
WHERE disno = #{disno};


update disease set disname=?, disex=?, kindpet=?, infval=?, mannote=? 
where disno=?

UPDATE disease
SET 
    disname      = 등창,
    disex = '등창(Pyoderma)은 주로 바이러스 감염으로 발생한다.',
    kindpet   = 'X',
    infval  = '30~45% 등창은 주로 세균 감염으로 발생하며 피부 손상·습도·알레르기가 원인이 됩니다.',
    mannote  = '피부 손상·습도·알레르기가 주의'
WHERE disno = 14;

--6. OX 문제 삭제 (DELETE)

DELETE FROM disease
WHERE disno = #{disno};

delete from disease 
where disno = 14;

select * from disease_ox;
commit;



--------------------------------------------------------------------------------
SQL> desc disease
 Name                                      Null?    Type
 ----------------------------------------- -------- ----------------------------
 DISNO                                     NOT NULL NUMBER
 DISNAME                                            VARCHAR2(50)
 DISEX                                              VARCHAR2(150)
 KINDPET                                            VARCHAR2(200)
 INFVAL                                             VARCHAR2(100)
 MANNOTE                                            VARCHAR2(200)
 
 4-2. dto [com.company.model]
 public class PawPostDto {
	private int disno;
	private String disname;
	private String disex;
	private String kindpet;
	private String infval;
	private String mannote;
 
 4-3. dao [com.company.model]
 create: insert into disease(disno,disname,disex,kindpet,infval,mannote) values(disno_seq.nextval, ?, ?, ?, ?, ?);
 read : select * from disease;
  		select * from disease where disno=?;
 update: update disease set disname=?,disex=?,kindpet=?, infval = ?, mannote = ?  where disno = ?;
 delete: delete from disease where disno = ?;  	
 -------------------------------------------------------------------------------