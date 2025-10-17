--Q045.
select empno,ename,sal,comm,sal+comm,nvl(comm,0),sal+nvl(comm,0)
from emp;

--Q046.
select empno,ename,comm,nvl2(comm,'O','X'),SAL*12 +nvl2(comm,comm,0) as ANNSAL
from emp;

--Q047.
select decode (job,'MANAGER',SAL*1.1)
,(JOB,'SALESMAN',SAL*1.05)
,(job,'ANALYST',SAL*1)
,(job,,sal*1.03)
from emp;
-----------------------------------------------------------

select decode(job,'MANAGER', SAL*1.1, 'SALESMAN',SAL*1.05, 'ANALYST',SAL*1,'',SAL*1.03)
from emp;

select empno,ename,job,sal,decode(job,'MANAGER', SAL*1.1, 'SALESMAN',SAL*1.05, 'ANALYST',SAL*1,SAL*1.03) as UPSAL
from emp;

--Q048.
select empno,ename,job,sal,
       (case job
           when 'MANAGER' then sal*1.1
           when 'SALESMAN' then SAL*1.05
           when 'ANALYST' then sal*1.0
           else          sal*1.03 
       end ) as UPSAL
       
from emp;

--Q049.
select empno,ename,comm,
        case 
             when comm is null then '해당사항 없음'
             when comm = 0    then '수당 없음'
             when comm >0 then '수당:' || COMM
        end comm_text
from emp;



--Q019.
select round(1234.5678),round(1234.5678,0),round(1234.5678,2)
from dual;
