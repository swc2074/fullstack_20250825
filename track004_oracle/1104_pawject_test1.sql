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