--Q19
select round(1234.5678)    r
,      round(1234.5678,0)  r1
,      round(1234.5678,1)  r2
,      round(1234.5678,2)  r3
,      round(1234.5678,-1) r4
,      round(1234.5678,-2) r5

from dual;

--Q20
select trunc(1234.5678)    r
,      trunc(1234.5678,0)  r1
,      trunc(1234.5678,1)  r2
,      trunc(1234.5678,2)  r3
,      trunc(1234.5678,-1) r4  --숫자제거
,      trunc(1234.5678,-2) r5

from dual;


--Q21
select ceil(3.14), floor(3.96), ceil(-3.14),floor(-3.96)
from dual;

--Q22
select mod(10,3)  , mod(10,2)    ,mod(10,4)
from dual;
--Q23
select sysdate, sysdate-1 어제, sysdate+1 내일
from dual;

--Q24
select sysdate, add_months(sysdate,3) "3개월뒤"
from dual;

--Q25
select empno,ename,hiredate,add_months(hiredate,120) "10주년"
from emp;

--Q26
select empno, ename, hiredate, sysdate,add_months(hiredate,504) "42주년"
from emp
where add_months(hiredate,504) >sysdate;

--Q27
-- 오늘날짜 기준으로
select empno, ename, hiredate,to_date('2024-12-21','yyyy-mm-dd')
, months_between(hiredate, to_date('2024-12-21','yyyy-mm-dd')  ) months1
, months_between(to_date('2024-12-21','yyyy-mm-dd'),hiredate  ) months2
, trunc (months_between(to_date('2024-12-21','yyyy-mm-dd'),hiredate  )  ) months3

from emp;

--Q28
select sysdate, next_day(sysdate,'월요일'), last_day(sysdate)
from dual;

--Q29
select sysdate
, round(sysdate, 'CC') "CC  세기 - Century"
, round(sysdate, 'YYYY') YYYY
, round(sysdate, 'Q') "Q-분기"
, round(sysdate, 'DDD') "DDD -연중일수"
, round(sysdate, 'HH') "HH 시간"

FROM DUAL;

--Q30
select sysdate

, trunc(sysdate, 'CC') "CC  세기 - Century"
, trunc(sysdate, 'YYYY') YYYY
, trunc(sysdate, 'Q') "Q-분기"
, trunc(sysdate, 'DDD') "DDD -연중일수"
, trunc(sysdate, 'HH') "HH 시간"

FROM DUAL;

--Q31

EMPNO  숫자 + '500' (문자열 500이지만, 알파벳포함x A) = 자동변환
select empno, ename
, empno + '500'
from emp
where ename='SCOTT';

select empno, ename
, empno + to_number( '500')
from emp
where ename='SCOTT';


--Q32
select empno, ename
, empno + '500a'
from emp
where ename='SCOTT';

--Q33
select sysdate, to_char(sysdate,'yyyy/mm/dd  hh24:mi:ss')

from dual;

--Q34 ~Q38
-- Q6-34
SELECT SYSDATE,
       TO_CHAR(SYSDATE, 'MM') AS MM,
       TO_CHAR(SYSDATE, 'MON') AS MON,
       TO_CHAR(SYSDATE, 'MONTH') AS MONTH,
       TO_CHAR(SYSDATE, 'DD') AS DD,
       TO_CHAR(SYSDATE, 'DY') AS DY,
       TO_CHAR(SYSDATE, 'DAY') AS DAY
  FROM DUAL;

-- Q6-35
SELECT SYSDATE,
       TO_CHAR(SYSDATE, 'MM') AS MM,
       TO_CHAR(SYSDATE, 'MON', 'NLS_DATE_LANGUAGE = KOREAN' ) AS MON_KOR,
       TO_CHAR(SYSDATE, 'MON', 'NLS_DATE_LANGUAGE = JAPANESE') AS MON_JPN,
       TO_CHAR(SYSDATE, 'MON', 'NLS_DATE_LANGUAGE = ENGLISH' ) AS MON_ENG,
       TO_CHAR(SYSDATE, 'MONTH', 'NLS_DATE_LANGUAGE = KOREAN' ) AS MONTH_KOR,
       TO_CHAR(SYSDATE, 'MONTH', 'NLS_DATE_LANGUAGE = JAPANESE') AS MONTH_JPN,
       TO_CHAR(SYSDATE, 'MONTH', 'NLS_DATE_LANGUAGE = ENGLISH' ) AS MONTH_ENG
  FROM DUAL;

-- Q6-36
SELECT SYSDATE,
       TO_CHAR(SYSDATE, 'MM') AS MM,
       TO_CHAR(SYSDATE, 'DD') AS DD,
       TO_CHAR(SYSDATE, 'DY', 'NLS_DATE_LANGUAGE = KOREAN' ) AS DY_KOR,
       TO_CHAR(SYSDATE, 'DY', 'NLS_DATE_LANGUAGE = JAPANESE') AS DY_JPN,
       TO_CHAR(SYSDATE, 'DY', 'NLS_DATE_LANGUAGE = ENGLISH' ) AS DY_ENG,
       TO_CHAR(SYSDATE, 'DAY', 'NLS_DATE_LANGUAGE = KOREAN' ) AS DAY_KOR,
       TO_CHAR(SYSDATE, 'DAY', 'NLS_DATE_LANGUAGE = JAPANESE') AS DAY_JPN,
       TO_CHAR(SYSDATE, 'DAY', 'NLS_DATE_LANGUAGE = ENGLISH' ) AS DAY_ENG
  FROM DUAL;

-- Q6-37
SELECT SYSDATE,
       TO_CHAR(SYSDATE, 'HH24:MI:SS') AS HH24MISS,
       TO_CHAR(SYSDATE, 'HH12:MI:SS AM') AS HHMISS_AM,
       TO_CHAR(SYSDATE, 'HH:MI:SS P.M.') AS HHMISS_PM
  FROM DUAL;

-- Q6-38
SELECT SAL,
       TO_CHAR(SAL, '$999,999') AS SAL_$,
       TO_CHAR(SAL, 'L999,999') AS SAL_L,
       TO_CHAR(SAL, '999,999.00') AS SAL_1,
       TO_CHAR(SAL, '000,999,999.00') AS SAL_2,
       TO_CHAR(SAL, '000999999.99') AS SAL_3,
       TO_CHAR(SAL, '999,999,00') AS SAL_4
  FROM EMP;


--Q39 숫자로만 이뤄진문자열  가능
select 1300 - '1500', '1300' + 1500
from dual;

select '1,500 - 1,300'
from dual;

select '1500' - '1300'
from dual;

select '1,500' - '1,300'
from dual;

--Q41. to_number
select to_number('1,500') - to_number('1,300')
from dual;

select to_number('1,500','999,999') - to_number('1,300','999,999')
from dual;

--Q42. to_char
select to_date('2025-10-17','yyyy-mm-dd')
from dual;

-- Q6-43
SELECT *
  FROM EMP
 WHERE HIREDATE > TO_DATE('1981/06/01', 'YYYY/MM/DD');

-- Q6-44
SELECT TO_DATE('49/12/10', 'YY/MM/DD') AS YY_YEAR_49,
       TO_DATE('49/12/10', 'RR/MM/DD') AS RR_YEAR_49,
       TO_DATE('50/12/10', 'YY/MM/DD') AS YY_YEAR_50,
       TO_DATE('50/12/10', 'RR/MM/DD') AS RR_YEAR_50,
       TO_DATE('51/12/10', 'YY/MM/DD') AS YY_YEAR_51,
       TO_DATE('51/12/10', 'RR/MM/DD') AS RR_YEAR_51
  FROM DUAL;
