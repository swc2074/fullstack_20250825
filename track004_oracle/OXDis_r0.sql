select table_name from user_tables;

select * from emp;

DESC disease;
select * from disease;

drop table disease;
delete from disease;
create sequence disease_seq;
commit;

delete from disease_ox;
-- 1. 피부 알레르기
INSERT INTO disease (
    disno, disname, disex, kindpet, infval, mannote
) VALUES (
    disease_seq.NEXTVAL,
    '피부 알레르기(Dermatitis)',
    '알레르기 반응으로 피부 가려움·염증 발생',
    '불독, 리트리버 등',
    '발병 원인: 환경·음식 알레르기',
    '치료: 약물·알레르기 테스트 필요'
);

-- 2. 슬개골 탈구
INSERT INTO disease (
    disno, disname, disex, kindpet, infval, mannote
) VALUES (
    disease_seq.NEXTVAL,
    '슬개골 탈구(PL)',
    '슬개골이 제자리에서 벗어남',
    '소형견(포메라니안, 치와와)',
    '발병률: 소형견에게 흔함',
    '등급: Grade I~IV'
);

-- 3. 심장비대증
INSERT INTO disease (
    disno, disname, disex, kindpet, infval, mannote
) VALUES (
    disease_seq.NEXTVAL,
    '심장비대증(DCM)',
    '심근 기능 약화로 심장 확장',
    '도베르만, 대형견',
    '발병 연령: 중년~노령',
    '관리: 약물·식이 요법'
);

-- 4. 추간판 탈출증
INSERT INTO disease (
    disno, disname, disex, kindpet, infval, mannote
) VALUES (
    disease_seq.NEXTVAL,
    '추간판 탈출증(IVDD)',
    '척추 디스크 돌출로 신경 압박',
    '닥스훈트, 웰시코기 등',
    '발생률: 장단족 견종 20~25%',
    '등급: Grade I~V'
);

-- 5. 기관 허탈
INSERT INTO disease (
    disno, disname, disex, kindpet, infval, mannote
) VALUES (
    disease_seq.NEXTVAL,
    '기관 허탈(기관지 붕괴)',
    '기관 연골 약화로 기도 좁아짐',
    '요크셔테리어, 포메라니안',
    '발병 연령: 4~14세',
    '기관 내강 0~100%로 단계화'
);

-- 6. 고양이 비뇨기 증후군
INSERT INTO disease (
    disno, disname, disex, kindpet, infval, mannote
) VALUES (
    disease_seq.NEXTVAL,
    '고양이 비뇨기 증후군(FLUTD)',
    '요로 폐색 및 결석 문제',
    '단모종·비만 고양이',
    '재발률 높음',
    '증상: 배뇨 곤란·혈뇨'
);

-- 7. 신부전
INSERT INTO disease (
    disno, disname, disex, kindpet, infval, mannote
) VALUES (
    disease_seq.NEXTVAL,
    '신부전(Kidney Failure)',
    '신장 기능 저하',
    '노령견·노령묘',
    '만성·급성 모두 발생',
    '관리: 수액·저단백 식이'
);

-- 8. 당뇨병
INSERT INTO disease (
    disno, disname, disex, kindpet, infval, mannote
) VALUES (
    disease_seq.NEXTVAL,
    '당뇨병(Diabetes)',
    '인슐린 부족으로 혈당 조절 불가',
    '중년~노령 반려동물',
    '증상: 다식·다음·체중 감소',
    '관리: 인슐린 주사'
);

-- 9. 고관절 이형성증
INSERT INTO disease (
    disno, disname, disex, kindpet, infval, mannote
) VALUES (
    disease_seq.NEXTVAL,
    '고관절 이형성증(HD)',
    '고관절 기형으로 통증·절뚝거림',
    '골든·랩라·셰퍼드',
    '유전적 영향 큼',
    '등급: OFA 평가 기준 사용'
);

-- 10. 등창(피부 농피증)
INSERT INTO disease (
    disno, disname, disex, kindpet, infval, mannote
) VALUES (
    disease_seq.NEXTVAL,
    '등창(Pyoderma)',
    '세균 감염으로 피부 고름 생성',
    '모든 견종',
    '원인: 알레르기·습기·기생충',
    '관리: 항생제·피부관리'
);

-- 11. 췌장염
INSERT INTO disease (
    disno, disname, disex, kindpet, infval, mannote
) VALUES (
    disease_seq.NEXTVAL,
    '췌장염(Pancreatitis)',
    '췌장 염증으로 소화 기능 저하',
    '소형견, 비만견',
    '급성·만성 형태 존재',
    '관리: 저지방 식단·수액요법'
);

-- 12. 갑상선 기능저하증
INSERT INTO disease (
    disno, disname, disex, kindpet, infval, mannote
) VALUES (
    disease_seq.NEXTVAL,
    '갑상선 기능저하증(Hypothyroidism)',
    '갑상선 호르몬 부족',
    '중년~노령견',
    '증상: 피로·체중 증가·탈모',
    '관리: 호르몬 보충제 투여'
);

-- 13. 갑상선 항진증(고양이)
INSERT INTO disease (
    disno, disname, disex, kindpet, infval, mannote
) VALUES (
    disease_seq.NEXTVAL,
    '고양이 갑상선 항진증(Hyperthyroidism)',
    '갑상선 기능 과다로 신진대사 상승',
    '노령묘',
    '증상: 체중 감소·다식',
    '치료: 약물·방사선 요법'
);

-- 14. 심부전
INSERT INTO disease (
    disno, disname, disex, kindpet, infval, mannote
) VALUES (
    disease_seq.NEXTVAL,
    '심부전(Heart Failure)',
    '심장 기능 저하',
    '노령견·노령묘',
    '증상: 기침·호흡곤란',
    '관리: 약물·저염식'
);

-- 15. 장염(가스트로엔테라이트)
INSERT INTO disease (
    disno, disname, disex, kindpet, infval, mannote
) VALUES (
    disease_seq.NEXTVAL,
    '장염(Gastroenteritis)',
    '장 염증으로 설사·구토 유발',
    '모든 반려동물',
    '원인: 바이러스·세균·음식',
    '관리: 수액·항생제'
);

-- 16. 고양이 감기(허피스바이러스)
INSERT INTO disease (
    disno, disname, disex, kindpet, infval, mannote
) VALUES (
    disease_seq.NEXTVAL,
    '고양이 허피스바이러스(FHV)',
    '상부호흡기 감염',
    '고양이',
    '증상: 재채기·눈곱',
    '관리: 항바이러스·면역보조'
);

-- 17. 파보바이러스 감염증
INSERT INTO disease (
    disno, disname, disex, kindpet, infval, mannote
) VALUES (
    disease_seq.NEXTVAL,
    '파보바이러스(Parvo)',
    '치명적 장염 바이러스',
    '강아지',
    '전염성 매우 높음',
    '예방: 백신 필수'
);

-- 18. 켄넬코프
INSERT INTO disease (
    disno, disname, disex, kindpet, infval, mannote
) VALUES (
    disease_seq.NEXTVAL,
    '켄넬코프(Kennel Cough)',
    '기관지염 유사 전염성 기침',
    '모든 견종',
    '전염 속도 빠름',
    '관리: 항생제·휴식'
);

-- 19. 요로감염
INSERT INTO disease (
    disno, disname, disex, kindpet, infval, mannote
) VALUES (
    disease_seq.NEXTVAL,
    '요로감염(UTI)',
    '요도·방광 감염',
    '고양이·강아지',
    '증상: 잦은 배뇨',
    '치료: 항생제'
);

-- 20. 방광결석
INSERT INTO disease (
    disno, disname, disex, kindpet, infval, mannote
) VALUES (
    disease_seq.NEXTVAL,
    '방광결석(Bladder Stone)',
    '요로 내 결석 형성',
    '고양이·강아지',
    '원인: 미네랄 불균형',
    '관리: 처방식·수술'
);

-- 21. 이도염(귀염증)
INSERT INTO disease (
    disno, disname, disex, kindpet, infval, mannote
) VALUES (
    disease_seq.NEXTVAL,
    '이도염(Ear Infection)',
    '귀 내부 염증',
    '장모견·습한 환경',
    '증상: 귀 냄새·긁음',
    '관리: 세정·약물'
);

-- 22. 치은염(잇몸염증)
INSERT INTO disease (
    disno, disname, disex, kindpet, infval, mannote
) VALUES (
    disease_seq.NEXTVAL,
    '치은염(Gingivitis)',
    '잇몸 염증',
    '고양이·강아지',
    '원인: 치석·치태',
    '관리: 스케일링'
);

-- 23. 치주병
INSERT INTO disease (
    disno, disname, disex, kindpet, infval, mannote
) VALUES (
    disease_seq.NEXTVAL,
    '치주병(Periodontal Disease)',
    '치아 주위 조직 염증',
    '소형견·노령견',
    '증상: 구취·치아 흔들림',
    '관리: 치료·발치 필요'
);

-- 24. 부신피질기능항진증(쿠싱)
INSERT INTO disease (
    disno, disname, disex, kindpet, infval, mannote
) VALUES (
    disease_seq.NEXTVAL,
    '쿠싱증후군(Cushing Disease)',
    '부신호르몬 과다 분비',
    '중년~노령견',
    '증상: 식욕 증가 다음당뇨',
    '관리: 약물치료'
);

-- 25. 부신기능저하증(애디슨)
INSERT INTO disease (
    disno, disname, disex, kindpet, infval, mannote
) VALUES (
    disease_seq.NEXTVAL,
    '애디슨병(Addison Disease)',
    '부신호르몬 부족',
    '중형견·대형견',
    '증상: 무기력·설사',
    '관리: 호르몬 주사'
);

-- 26. 고양이 허피스 각막염
INSERT INTO disease (
    disno, disname, disex, kindpet, infval, mannote
) VALUES (
    disease_seq.NEXTVAL,
    '고양이 각막염(Keratitis)',
    '눈 각막 염증',
    '고양이',
    '원인: FHV 재활성화',
    '관리: 항바이러스 점안'
);

-- 27. 회충 감염
INSERT INTO disease (
    disno, disname, disex, kindpet, infval, mannote
) VALUES (
    disease_seq.NEXTVAL,
    '회충 감염(Roundworm)',
    '장내 기생충 감염',
    '강아지·고양이',
    '전염성 있음',
    '치료: 구충제'
);

-- 28. 옴 진드기 감염
INSERT INTO disease (
    disno, disname, disex, kindpet, infval, mannote
) VALUES (
    disease_seq.NEXTVAL,
    '옴(Sarcoptic Mange)',
    '피부에 기생충 감염',
    '반려견',
    '증상: 심한 가려움',
    '관리: 외부기생충 약물'
);

-- 29. 모낭충(데모덱스)
INSERT INTO disease (
    disno, disname, disex, kindpet, infval, mannote
) VALUES (
    disease_seq.NEXTVAL,
    '데모덱스(Demodicosis)',
    '모낭충 번식으로 피부 탈모',
    '강아지',
    '원인: 면역저하',
    '관리: 외부기생충 치료'
);

-- 30. 백내장
INSERT INTO disease (
    disno, disname, disex, kindpet, infval, mannote
) VALUES (
    disease_seq.NEXTVAL,
    '백내장(Cataract)',
    '수정체 혼탁으로 시력 저하',
    '노령견',
    '원인: 유전·당뇨',
    '관리: 수술 가능'
);

-- 31. 녹내장
INSERT INTO disease (
    disno, disname, disex, kindpet, infval, mannote
) VALUES (
    disease_seq.NEXTVAL,
    '녹내장(Glaucoma)',
    '안압 상승으로 시신경 손상',
    '강아지·고양이',
    '증상: 눈 통증·충혈',
    '관리: 안압약·수술'
);

-- 32. 만성 호흡기 질환(고양이)
INSERT INTO disease (
    disno, disname, disex, kindpet, infval, mannote
) VALUES (
    disease_seq.NEXTVAL,
    '고양이 천식(Feline Asthma)',
    '기관지 염증으로 호흡 장애',
    '고양이',
    '원인: 스트레스·먼지',
    '관리: 스테로이드 흡입'
);

-- 33. 안구건조증
INSERT INTO disease (
    disno, disname, disex, kindpet, infval, mannote
) VALUES (
    disease_seq.NEXTVAL,
    '안구건조증(KCS)',
    '눈물 분비 감소',
    '견종: 시츄·푸들',
    '증상: 눈곱·충혈',
    '관리: 인공눈물·면역약'
);

-- 34. 고양이 구내염
INSERT INTO disease (
    disno, disname, disex, kindpet, infval, mannote
) VALUES (
    disease_seq.NEXTVAL,
    '고양이 구내염(Stomatitis)',
    '입안 심각한 염증',
    '고양이',
    '원인: 면역 문제',
    '관리: 스테로이드·발치'
);

-- 35. 요도 폐색(고양이)
INSERT INTO disease (
    disno, disname, disex, kindpet, infval, mannote
) VALUES (
    disease_seq.NEXTVAL,
    '요도 폐색(Urethral Obstruction)',
    '수컷 고양이에게 흔한 요로 막힘',
    '고양이(수컷)',
    '응급상황',
    '관리: 카테터·수액'
);

-- 36. 고혈압
INSERT INTO disease (
    disno, disname, disex, kindpet, infval, mannote
) VALUES (
    disease_seq.NEXTVAL,
    '고혈압(Hypertension)',
    '혈압 지속 상승',
    '노령견·노령묘',
    '원인: 신장·갑상선 문제',
    '관리: 혈압약'
);

-- 37. 간염
INSERT INTO disease (
    disno, disname, disex, kindpet, infval, mannote
) VALUES (
    disease_seq.NEXTVAL,
    '간염(Hepatitis)',
    '간의 염증',
    '강아지',
    '증상: 황달·구토',
    '관리: 식이·약물'
);

-- 38. 간부전
INSERT INTO disease (
    disno, disname, disex, kindpet, infval, mannote
) VALUES (
    disease_seq.NEXTVAL,
    '간부전(Liver Failure)',
    '간 기능 상실',
    '노령견',
    '원인: 유전·독성물질',
    '관리: 집중 치료'
);

-- 39. 식도염
INSERT INTO disease (
    disno, disname, disex, kindpet, infval, mannote
) VALUES (
    disease_seq.NEXTVAL,
    '식도염(Esophagitis)',
    '식도 염증',
    '강아지·고양이',
    '원인: 역류·이물질',
    '관리: 약물·식단조절'
);

-- 40. 장폐색
INSERT INTO disease (
    disno, disname, disex, kindpet, infval, mannote
) VALUES (
    disease_seq.NEXTVAL,
    '장폐색(Intestinal Obstruction)',
    '이물질로 장이 막힘',
    '강아지·고양이',
    '증상: 구토·식욕부진',
    '관리: 수술 필요'
);

-------------------------------------------------------------
질환 table
-------------------------------------------------------------

CREATE TABLE disease_ox (
    oxno        NUMBER           PRIMARY KEY,
    disno       NUMBER           NOT NULL,
    oxquestion  VARCHAR2(300)    NOT NULL,
    oxanswer    CHAR(1)          NOT NULL CHECK (oxanswer IN ('O','X')),
    oxcomment   VARCHAR2(400),
    oxbhit      NUMBER           NOT NULL,
    createdat   DATE             NOT NULL,
    CONSTRAINT fk_disease_ox FOREIGN KEY(disno)
        REFERENCES disease(disno)
);

CREATE SEQUENCE disease_ox_seq;

desc disease_ox;

select * from disease;
select * from disease_ox;
select * from disease_ox
where oxno=5;
delete from disease_ox
where disno=1;
delete from disease_ox
where oxno=5;

--1. OX 문제 등록 (INSERT)
INSERT INTO disease_ox (
    oxno, disno, oxquestion, oxanswer, oxcomment, oxbhit,createdat
) VALUES (
    disease_ox_seq.NEXTVAL,  #{disno},  #{oxquestion},  #{oxanswer},  #{oxcomment},#{oxbhit},#{sysdate} 
);   

INSERT INTO disease_ox (
    oxno, disno, oxquestion, oxanswer, oxcomment, oxbhit,createdat
) VALUES (
    disease_ox_seq.NEXTVAL, 1,
    '피부 알레르기(피부염)는 음식 알레르기로만 발생한다.', 'X',
    '피부 알레르기는 음식 외에도 환경 알레르기(꽃가루, 집먼지 등)로도 발생합니다.',
    0,sysdate
);

INSERT INTO disease_ox (
    oxno, disno, oxquestion, oxanswer, oxcomment, oxbhit,createdat
) VALUES (
    disease_ox_seq.NEXTVAL, 2,
    '슬개골 탈구는 Grade I부터 IV까지 단계가 나누어진다.', 'O',
    '슬개골 탈구는 I~IV 단계로 나누어져 증상과 치료 방법을 판단합니다.',
    0,sysdate
);

INSERT INTO disease_ox (
    oxno, disno, oxquestion, oxanswer, oxcomment, oxbhit,createdat
) VALUES (
    disease_ox_seq.NEXTVAL, 3,
    '심장비대증(DCM)은 주로 소형견에게 나타나는 질환이다.', 'X',
    'DCM은 도베르만 등 대형견에서 더 흔하게 나타나는 심장 질환입니다.',
    0,sysdate
);

INSERT INTO disease_ox (
    oxno, disno, oxquestion, oxanswer, oxcomment, oxbhit,createdat
) VALUES (
    disease_ox_seq.NEXTVAL, 4,
    '추간판 탈출증(IVDD)은 웰시코기와 닥스훈트처럼 장단족 견종에서 특히 많이 발생한다.', 'O',
    'IVDD는 장단족 견종에서 유전적으로 높은 발생률을 보입니다(약 20~25%).',
    0,sysdate
);

INSERT INTO disease_ox (
    oxno, disno, oxquestion, oxanswer, oxcomment, oxbhit,createdat
) VALUES (
    disease_ox_seq.NEXTVAL, 5,
    '기관 허탈은 대부분 1~3세의 어린 개에서 발생한다.', 'X',
    '기관 허탈은 주로 4~14세의 중·노령 소형견에게 흔합니다.',
    0,sysdate
);

INSERT INTO disease_ox (
    oxno, disno, oxquestion, oxanswer, oxcomment, oxbhit,createdat
) VALUES (
    disease_ox_seq.NEXTVAL, 6,
    '고양이 비뇨기 증후군(FLUTD)은 재발이 잦은 질환이다.', 'O',
    'FLUTD는 스트레스·결석·체질 등 다양한 원인으로 재발 가능성이 매우 높습니다.',
    0,sysdate
);

INSERT INTO disease_ox (
    oxno, disno, oxquestion, oxanswer, oxcomment, oxbhit,createdat
) VALUES (
    disease_ox_seq.NEXTVAL, 7,
    '신부전은 급성만 존재하며 만성 형태는 없다.', 'X',
    '신부전은 급성과 만성으로 나뉘며 특히 만성 신부전은 노령 반려동물에서 흔합니다.',
    0,sysdate
);

INSERT INTO disease_ox (
    oxno, disno, oxquestion, oxanswer, oxcomment, oxbhit,createdat
) VALUES (
    disease_ox_seq.NEXTVAL, 8,
    '당뇨병에 걸린 반려동물은 인슐린 치료가 필요할 수 있다.', 'O',
    '동물의 당뇨는 대부분 인슐린 의존형으로 인슐린 주사가 필요합니다.',
    0,sysdate
);

INSERT INTO disease_ox (
    oxno, disno, oxquestion, oxanswer, oxcomment, oxbhit,createdat
) VALUES (
    disease_ox_seq.NEXTVAL, 9,
    '고관절 이형성증(HD)은 유전적 요인도 영향을 미치는 질환이다.', 'O',
    'HD는 유전적 요인이 크게 작용하며 대형견에서 많이 발생합니다.',
    0,sysdate
);

INSERT INTO disease_ox (
    oxno, disno, oxquestion, oxanswer, oxcomment, oxbhit,createdat
) VALUES (
    disease_ox_seq.NEXTVAL, 10,
    '등창(Pyoderma)은 주로 바이러스 감염으로 발생한다.', 'X',
    '등창은 주로 세균 감염으로 발생하며 피부 손상·습도·알레르기가 원인이 됩니다.',
    0,sysdate
);





select * from disease_ox;

--2. select
SELECT 
    o.oxno,
    o.disno,
    d.disname,
    o.oxquestion,
    o.oxanswer,
    o.oxcomment
FROM disease_ox o
JOIN disease d ON o.disno = d.disno
ORDER BY o.oxno DESC;


-- 페이징
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
--3. 특정 OX 문항 단일 조회
SELECT *
FROM disease_ox
WHERE oxno = #{oxno};

SELECT *
FROM disease_ox
WHERE oxno = 14;

--4.조회수 업데이트 올리기
update  disease_ox   set     bhit = bhit + 1    where   id=#{id};

update disease_ox
set oxbhit = oxbhit + 1
where oxno = 14;

--5. OX 문제 수정 (UPDATE)
UPDATE disease_ox
SET 
    disno      = #{disno},
    oxquestion = #{oxquestion},
    oxanswer   = #{oxanswer},
    oxcomment  = #{oxcomment},
   
WHERE oxno = #{oxno};


UPDATE disease_ox
SET 
    disno      = 10,
    oxquestion = '등창(Pyoderma)은 주로 바이러스 감염으로 발생한다.',
    oxanswer   = 'X',
    oxcomment  = '등창은 주로 세균 감염으로 발생하며 피부 손상·습도·알레르기가 원인이 됩니다.'
WHERE oxno = 14;

--6. OX 문제 삭제 (DELETE)

DELETE FROM disease_ox
WHERE oxno = #{oxno};

DELETE FROM disease_ox
WHERE oxno = 14;

select * from disease_ox;
commit;
