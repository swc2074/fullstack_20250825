--EX001.
select empno,rpad(substr(empno,1,2),4,'*') as Masking_empno,
       ename,rpad(substr(ename,1,1),length,'*') as Masking_ename
from emp
where length(ename) = 5;
      
  --답    =======================================
select   empno   ,   rpad( substr( empno , 1,2  ) ,   4                ,'*'     )    MASKING_EMPNO 
       , ename   ,   rpad( substr( ename , 1,1  ) ,   length(ename)    , '*'    )  MASKING_ENAME 
from     emp  
where    length(ename) >=5   and  length(ename)<6;          
      =======================================
      
--EX002.
select empno,ename,sal,trunc(sal/21.5,2)as DAY_PAY,round((sal/21.5)/8,1) as TIME_PAY

from emp;


--답    =======================================
select  empno, ename, sal,  trunc(  sal/21.5  ,2)   day_pay     , round( sal/21.5/8 , 1)  time_pay
from    emp;

================================================================================

--EX003.
select empno,ename,hiredate
,to_char(add_months(hiredate,3),'yyyy-mm-dd') as R_JOB
,nvl(to_char(COMM),'N/A')
from emp;

--답    =======================================
select    empno, ename, hiredate 
    , TO_CHAR(NEXT_DAY(ADD_MONTHS(HIREDATE,3) , '월요일') ,'YYYY-MM-DD')     R_JOB    
    -- 3개월이(ADD_MONTHS) / 첫 월요일 NEXT_DAY( 날짜 , '월요일'  ) /  TO_CHAR  YYYY-MM-DD
    , NVL(  TO_CHAR( COMM ) , 'N/A'   ) COMM 
from      emp;
================================================================================


--EX004.
select empno,ename,mgr
, (case 
      when mgr is null then '00000'
      when substr(mgr,1,2) = '78' then '8888'
      when substr(mgr,1,2) = '77' then '7777'
      when substr(mgr,1,2) = '76' then '6666'
      when substr(mgr,1,2) = '75' then '5555'
      else to_char(mgr)
  end) as CHG_MGR
from emp;

--답    =======================================
select   empno, ename, mgr, 
        case
            when  mgr is null  then  '0000'
            when  substr(  mgr  , 1, 2 )  = '78' then  '8888'
            when  substr(  mgr  , 1, 2 )  = '77' then  '7777'
            when  substr(  mgr  , 1, 2 )  = '76' then  '6666'
            when  substr(  mgr  , 1, 2 )  = '75' then  '5555'
            else  to_char(mgr)
        end chg_mgr    
from    emp;
================================================================================
