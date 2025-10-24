-- join
-- emp(deptno), dept(deptno) 한테이블처럼 사용하는 방법

select e.empno,e.ename, d.deptno,d.dname
from  emp e, dept d
where e.deptno = d.deptno;

group by 
having
order by    ;

-- (1) join on
select empno,ename, e.deptno,dname
from  emp e join dept d
on( e.deptno = d.deptno);

-- (2) join using
select empno,ename, deptno,dname
from  emp e join dept d
using(deptno);

-- (3) natural join
select empno,ename, deptno,dname
from  emp e natural join dept d;


-- (4)
select * from dept;
select * from emp;

select e.empno,e.ename, d.deptno,d.dname
from  emp e, dept d
where e.deptno(+) = d.deptno;


-- (5) right outer join
select empno,ename, e.deptno,d.dname
from  emp e right outer join dept d
on ( e.deptno = d.deptno);

-- (6) left outer join
select empno,ename, e.deptno,dname
from  dept d left outer join emp e
on ( e.deptno = d.deptno);


-- (7) full outer join
select empno,ename, e.deptno,dname
from  dept d full outer join emp e
on ( e.deptno = d.deptno);



-- select 안에 select

-- 내 안에 ....
