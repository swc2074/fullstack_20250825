-- 003_select_function
-- 1. 문자열
-- 2. 숫자
-- 3. 날짜
-- 4. 변환
-- 5. 조건
-------------------------------------------------------
-- 1. 문자열
-- 1-1. upper 대문자,  lower 소문자, initcap 대소문자 변환
-- 1-2. length 문자열길이
-- 1-3. substr 부분문자열, instr 위치 문자열
-- 1-4. replace 바꾸기, lpad, rpad 채우기
-- 1-5. trim , ltrim, rtrim 공백빼기
-- 1-6. concat 문자열연결


-- #1. 대소문자
select ename, upper(ename), lower(ename), initcap(ename)
from emp;

-- #2. 문자열 길이
select ename, length(ename), lengthb(ename),'킹', length('킹'),lengthb('킹')
from emp;

-- #3. substr 부분문자열(문자열, 어디서부터, 몇개), instr 위치문자열
select ename, substr(ename,1,2), substr(ename,1,3) ,substr(ename,2,2),substr(ename,3,2),substr(ename,-3,2)
from emp;

select substr('oracle',-1),substr('oracle',-3),substr('oracle',-3,2)
from dual;

select instr('oracle','a') from dual;
select ename, instr(ename,'A')  -- 있으면 위치, 없으면 0
from emp;

--#4.replace (어떤문자를 찾아서 바꾸기), lpad, rpad 채우기
select replace ('010-1234-2567','-',' ')
from dual;

select lpad('oracle', 10, '#'),rpad('oracle',10,'#')
from dual;

--#5. trim, ltrim, rtrim 공백빼기
select trim('  _*oracle*_  '), ltrim('  _*oracle*_  '),rtrim('  _*oracle*_  ')
from dual;

--#6. concat 문자열연결 - 두개의 문자열만 연결가능
select concat('Hello', 'Oracle')
from dual;

select concat(concat('Hello', 'Oracle'), '★')  -- concat 중첩해서 사용
from dual;

select 'Hello' || 'Oracle' || '❤' 
from dual;


---------------------------------------------------------------------------------
--##1. 문자열 연습문제
select ename, upper(ename),lower(ename),initcap(ename)
from emp;

-- ##2. 
select ename
from emp
where  upper(ename)= upper('KING');

select ename
from emp
where  lower(ename)= lower('king');

--##3.
select ename
from emp
where upper(ename) = 'KING'
or lower(ename)='king';

select  ename
from emp
where upper(ename) like upper('%king%');

select  ename
from emp
where upper(ename) like upper('%a%'); -- 포함되는 (대소문 구분없이)

--##4.
select ename,length(ename)
from emp;

--##5.
select ename,length(ename)
from emp
where length(ename)>=5;

--##6.
select length('한글'),lengthb('한글')
from dual;

--##7.
select JOB,substr(job,1,2),substr(job,3,2),substr(job,5)
from EMP;

--##8.
1. 역순으로,끝에서 부터
select JOB,substr(job,-length(job)),substr(job,-length(job),2),substr(job,-3)
from emp;


--##9.
-- 1. 해당위치의 글자가뭔지 확인 
-- 2. instr이용해서 해당값 구하기
select 'HELLO, ORACLE!'
,instr('HELLO, ORACLE!','L') as instr_1
,instr('HELLO, ORACLE!','L',5) as instr_2
,instr('HELLO, ORACLE!','L',2,2) as instr_2
from dual;



--##10.
select *
from emp
where instr(ename,'S') >0;


--##11. 
select *
from emp
where ename like '%S%';


--##12.
select *
from emp;

select '010-1234-5678' as replace_before
,replace('010-1234-5678','-',' ') replace1
,replace('010-1234-5678','-','') replace2
from dual;

--##13.
select 'Oracle'
, lpad('Oracle',10,'#') lpad_1
, rpad('Oracle',10,'*') rpad_1
, lpad('Oracle',10,'  ')lpad_2
, rpad('Oracle',10,'  ')rpad_2
from dual;

--##14.



select rpad('911225-',14,'*') juno
,rpad('010-1234-',13,'*') phone
from dual;

--##15.
select concat(empno,ename),concat(empno, concat(':',ename))
from emp
where ename=upper('Scott');

--##16.
공백제거
select
'[' || trim(' * *Oracle* * ') || ']' as trim -- 양쪽 공백제거
,'[' || trim(leading from ' * *Oracle* * ') || ']' as trim -- 앞쪽 공백제거
,'[' || trim(trailing from ' * *Oracle* * ') || ']' as trim --오른쪽 공백제거
,'[' || trim(both from ' * *Oracle* * ') || ']' as trim --양쪽공백제거
from dual;

select
'[' || trim(' * *Oracle* * ') || ']' as trim -- 양쪽 공백제거
,'[' || ltrim(' * *Oracle* * ') || ']' as trim --왼쪽 공백제거
,'[' || rtrim(' * *Oracle* * ') || ']' as trim --오른쪽 공백제거
,'[' || trim(' * *Oracle* * ') || ']' as trim --양쪽공백제거
from dual;

--##17.
trim 삭제할 문자 삭제
select
'[' || trim(' * *Oracle* * ') || ']' as trim -- 양쪽 공백제거
,'[' || trim(leading '*' from '* *Oracle* *') || ']' as trim -- 앞쪽 공백제거
,'[' || trim(trailing '*' from '* *Oracle* *') || ']' as trim --오른쪽 공백제거
,'[' || trim(both '*' from '* *Oracle* *') || ']' as trim --양쪽공백제거
from dual;


--##18.

select
 '[' ||         trim(' * *Oracle* * ')           || ']' as trim0 --trim 양쪽 공백제거
,'[' ||         ltrim(' * *Oracle* * ','* ')         || ']' as ltrim1 --왼쪽 공백제거
,'[' ||         ltrim('*-Oracle-*','*')         || ']' as ltrim2 --ltrim 원하는 문자열 제거
,'[' ||         rtrim(' * *Oracle* * ',' *')         || ']' as rtrim1 --rtrim 오른쪽 공백제거
,'[' ||         rtrim('*-Oracle-*','*-')         || ']' as rtrim2 --rtrim 원하는 문자열 제거
from dual;


--------------------------------------------------------------------------------------
-- 003_select_function.sql
-- 1.문자열
-- 2. 숫자 : round / trunc(반올림/버림) , ceil(올림), floor(내림), mod (나머지)
-- 3. 날짜 : sysdate, add months, next_day, last_day
-- 4. 변환 : to_char (날짜형색변환), to_date
-- 5. 조건 :  nvl, nvl2(null), decode, case(조건분기)
---------------------------------------------------------------------------------------
-- 2. 숫자 : round/trunc(반올림/버림), ceil(올림), floor(내림), mod(나머지)
select round( 1234.5678),round( 1234.5678 ,2), trunc(1234.5678, 2), ceil(1.1), floor(4.8), mod(10,3)
from dual; -- 12345    1234.57

-----------------------------------------------------------------------------------------
-- 3. 날짜 : sysdate(시스템날짜,시간반환), add_months(몇달뒤에), next_day, last_day
select sysdate , add_months( sysdate,3), months_between('24-12-1','25-12-1')
from dual;

select next_day(sysdate, 2) "다음주 월요일", last_day(sysdate) "해당월의 마지막 날짜"
from dual;

-----------------------------------------------------------------------------------------
-- 4. 변환 : to_char (날짜형식변환), to_date
select to_char(sysdate,'yyyy-mm-dd'), to_date('2025-10-16','yyyy-mm-dd')
from dual;

         -- 숫자1234를 문자열로 변환한 다음 +1
select    to_char(1234)+1,                    to_number('5678') +1
from dual;

select    to_char('일이삼사')+1,                    to_number('5678') +1
from dual;

select    "1234" +1 , 1+ "1234" -- 자료형이 안맞아 오류남.
from dual;

--------------------------------------------------------------------------------------
-- 5. 조건 : nv1, nv1 (null), decode,case (조건분기)

select nvl(null, '대체값')  -- null 이면 대체값/ null value logic(replacement)
from dual;

select nvl( comm, '입력안됨.')   -- x 오류
from emp;

select nvl( to_char(comm), '입력안됨.') -- O 자료형 맞춰야함.
from emp;

select nvl2(null,'A','B')
from dual;

select nvl2(mgr,mgr,'--') -- 문자 표현
from emp;

select nvl2(mgr,to_char(mgr),'상위관리자 x')
from emp;

select decode(deptno,10, '부서10', 20, '부서20', 30,'부서30')
from emp;

select  case 
            when deptno=10 then '부서10'
            when deptno=20 then '부서20'
            when deptno=30 then '부서30'
            
            else                '부서x'
        end
from emp;
------------------
select  case deptno
            when 10 then '부서10'
            when 20 then '부서20'
            when 30 then '부서30'
            else                '부서x'
        end
from emp;



===========================================
-------------------------------------------------------------------------------------
-- 003_select_function.sql
-- 1. 문자열
-- 2. 숫자   :   round / trunc(반올림/버림) , ceil( 올림 ) , floor ( 내림) , mod  (나머지)
-- 3. 날짜   :   sysdate (시스템날짜), add_months(몇달뒤에) , next_day, last_day
-- 4. 변환   :   to_char (날짜형식변환), to_date
-- 5. 조건   :   nvl, nvl2 ( null) , decode, case ( 조건분기 ) 
-------------------------------------------------------------------------------------
-- 2. 숫자   :   round / trunc(반올림/버림) , ceil( 올림 ) , floor ( 내림) , mod  (나머지)
select   round(  1234.5678   )   , round(  1234.5678  , 2  ) , trunc(  1234.5678  , 2  ) , ceil(1.1) , floor(4.8)  , mod(10,3)
from dual;     -- 1235              1234.57                       1234.56                      2          4            1

-------------------------------------------------------------------------------------
-- 3. 날짜   :   sysdate (시스템날짜,시간반환), add_months(몇달뒤에) , next_day, last_day
select   SYSDATE  , add_months(  SYSDATE, 1) ,    months_between(  '25-12-1'  , '24-12-1' )
from     dual;

select  NEXT_DAY(SYSDATE,  '월요일')  "다음주 월요일" ,   LAST_DAY(SYSDATE)  "해당월의 마지막 날짜"
from dual;

select  NEXT_DAY(SYSDATE,  1)  "다음주 월요일" ,   LAST_DAY(SYSDATE)  "해당월의 마지막 날짜"
from dual;

-------------------------------------------------------------------------------------
-- 4. 변환   :   to_char (날짜형식변환), to_date
--                날짜를     문자로                         문자를         날짜로
select   TO_CHAR( SYSDATE , 'YYYY-MM-DD' ) ,  TO_DATE(  '2025-10-16' , 'YYYY-MM-DD'  )
from     dual;

--        숫자1234를 문자열로 변환한 다음 +1   ( 자동변환해서 오류가 안날수 있음. )
select    TO_CHAR(1234)               + 1       ,   TO_NUMBER('5678') + 1 
from     dual;

select    TO_CHAR('일이삼사')               + 1   ,   TO_NUMBER('5678') + 1   -- 오류
from     dual;

select           "1234"   + 1  , 1+"1234"       --  자료형이 안맞으면 오류남.
from     dual;

-------------------------------------------------------------------------------------
-- 5. 조건   :   nvl, nvl2 ( null) , decode, case ( 조건분기 ) 

select   nvl(  NULL , '대체값' )             from      dual; -- null 이면 대체값    / null  value  logic( replacement )
select   nvl(          comm  , '입력안됨.')   from     emp;   -- X 오류
select   nvl(  to_char(comm) , '입력안됨.')   from     emp;   -- O 자료형을 맞춰야함.

select  nvl2( NULL, 'A' , 'B'  )     from dual;    -- null 일때 b, 아니면 a
-----
select  nvl2( mgr,          mgr , '--'  )     from emp;   -- 오류나는이유는? 
select  nvl2( mgr, to_char(mgr) , '상위관리자 x'  )     from emp;   -- 해결방안    ( nvl, nvl2  null일때 값 반환 / 자료형맞추기)
-----
select decode( deptno, 10 , '부서10' , 20, '부서20' , 30, '부서30' )
from   emp;
-----
select case  
            when deptno=10 then  '부서10'  
            when deptno=20 then  '부서20'   
            when deptno=30 then  '부서30'  
            else                 '부서x'
       end
from   emp;
-----
select case deptno 
            when 10 then  '부서10'  
            when 20 then  '부서20'   
            when 30 then  '부서30'  
            else          '부서x'
       end
from   emp;
-------------------------------------------------------------------------------------
-- ##1. 문자열 연습문제   (45~49)   ~17:00
-- https://sally03915.github.io/stackventure_250825/004_oracle/oracle004_select_fn#61

-- Q045  EMP테이블에서 NVL 함수를 사용하여 다음과 같이 출력하시오   ( nvl 이용 comm 이 null 이면 0 )  - nvl( NULL, '반환값')
select empno, ename, sal, comm,  sal + comm  , nvl( comm , 0) , sal + nvl(comm, 0)
from   emp;

-- Q046  EMP테이블에서 NVL2 함수를 사용하여 다음과 같이 출력하시오. (nvl2 이용  comm이  null 이면 'X')- nvl2( NULL, 'NULL아님','반환값')
select empno, ename,  comm,   nvl2( comm , 'O' , 'X') , sal*12 + nvl2( comm , comm , 0)
from   emp;

-- Q047  EMP테이블에서 DECODE 함수를 사용하여 다음과 같이 출력하시오.  (decode)
--JOB이 MANAGER 는 급여의 10% 인상한 급여       SAL*1.1
--SALESMAN 는 급여의 5% 인상한 급여             SAL*0.5
--ANALYST 는 그대로                            SAL 
--나머지는 3% 인상된 급여         SAL*0.3
select  empno, ename, job, sal , 
        decode(  job 
            , 'MANAGER'  ,  SAL*1.1    -- when   then
            , 'SALESMAN' ,  SAL*1.05   -- when   then
            , 'ANALYST'  ,  SAL
            , SAL*1.03  -- else
        ) upsal
from    emp;
-- Q048
--EMP테이블에서 CASE 함수를 사용하여 다음과 같이 출력하시오.  (case when  then   else  end)
select  empno, ename, job, sal , 
        case 
            when  job='MANAGER'   then SAL*1.1 
            when  job='SALESMAN'  then SAL*1.05 
            when  job='ANALYST'   then SAL
            else  SAL*1.03  
        end   upsal
from    emp;

select  empno, ename, job, sal , 
        case  job
            when  'MANAGER'   then SAL*1.1 
            when  'SALESMAN'  then SAL*1.05 
            when  'ANALYST'   then SAL
            else  SAL*1.03  
        end   upsal
from    emp;

-- Q049
--기준데이터 없이 조건식으로만 CASE 사용가능    case when  then   else  end)
--COMM 값이 NULL 이면 해당사항 없음
--0 이면 수당없음
--0 초과시 초과한 수당을 출력
select  empno, ename, comm
        , case   
            when   comm is null  then   '해당사항 없음'
            when   comm = 0      then   '수당없음'           
            when   comm > 0      then   '수당 : ' || comm
          end   comm_text
from    emp;


-------------------------------------------------------------------------------------
-- ##1. 문자열 연습문제   (19~44)
-- https://sally03915.github.io/stackventure_250825/004_oracle/oracle004_select_fn#14

==================================================
