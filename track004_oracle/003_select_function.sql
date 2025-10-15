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


