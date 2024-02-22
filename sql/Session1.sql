REM   Script: Session 01
REM   class

select * from scott.emp;

select * from scott.emp where deptno=30;

select empno,ename,job from scott.emp where deptno=30;

select empno,ename,job from scott.emp where deptno<30;

select empno,ename,job,deptno from scott.emp where deptno<30;

select empno,ename,job,deptno from scott.emp where deptno>20;

select empno,ename,job,deptno from scott.emp where deptno>20 and deptno<30;

select empno,ename,job,deptno from scott.emp where deptno>10 and deptno<30;

select empno,ename,job,deptno from scott.emp where deptno between 10 and 30;

select empno,ename,job,deptno from scott.emp where deptno in (10,30);

select empno,ename,job,deptno from scott.emp where deptno in (10,30);

select * from scott.emp where sal>2000;

select * from scott.emp where sal>2000;

select * from scott.emp where sal>2000 and deptno=20;

select * from scott.emp where sal>2000 and deptno=20 order by empno;

select * from scott.emp order by deptno,sal;

select * from scott.emp order by deptno,sal desc;

select * from scott.emp where sal=max(sal);

select max(sal),deptno from scott.emp;

select max(sal) from scott.emp;

select * from scott.emp where sal=max;

select min(sal) from scott.emp;

select avg(sal) from scott.emp;

select round(avg(sal)) from scott.emp;

select * from scott.emp where sal=(select max(sal) from scott.emp);

select * from scott.dept;

select * from scott.emp;

select dname from scott.dept;

select * from scott.emp;

select dname from scott.dept;

select dname from scott.dept;

select * from scott.dept;

select empno,ename,mgr from scott.emp;

select empno,ename,mgr,mgrname from scott.emp;

select * from scott.dept;

select empno,ename,mgr,mgrname from scott.emp;

select empno,ename,mgr,mgrname from scott.emp;

select mgrname from scott.dept;

select empno,ename,mgr,mgrname from scott.emp;

select mgrname from scott.dept;

select empno,ename,mgr from scott.emp ;

select * from scott.emp;

select * from scott.emp;

SELECT e.empno, e.ename, e.mgr, m.ename AS mgrname 
FROM scott.emp e, scott.emp m 
WHERE e.mgr = m.empno;

select ename from scott.emp where sal>avg(sal);

select ename from scott.emp where sal> select (avg(sal) from scott.emp);

select ename from scott.emp where sal> (select avg(sal) from scott.emp);

select * from scott.emp;

select ename from scott.emp where sal> (select avg(sal) from scott.emp) and dept =10;

select ename from scott.emp where sal> (select avg(sal) from scott.emp) and dept=10;

select * from scott.emp;

select ename from scott.emp where sal> (select avg(sal) from scott.emp) and deptno=10;

select ename from scott.emp where sal> (select avg(sal) from scott.emp) and deptno=10  
    select ename from scott.emp where sal> (select avg(sal) from scott.emp) and deptno=20 
    select ename from scott.emp where sal> (select avg(sal) from scott.emp) and deptno=30;

select ename from scott.emp where sal> (select avg(sal) from scott.emp) and deptno=10,deptno=20,deptno=30;

SELECT empno, ename, sal, deptno 
FROM scott.emp e 
WHERE sal > ( 
    SELECT AVG(sal) 
    FROM scott.emp 
    WHERE deptno = e.deptno 
);

select ename from scott.emp where sal> (select avg(sal) from scott.emp) and deptno=10;

SELECT empno, ename, sal, deptno 
FROM scott.emp e 
WHERE sal > ( 
    SELECT AVG(sal) 
    FROM scott.emp 
    WHERE deptno = e.deptno 
);

select ename from scott.emp where sal> (select avg(sal) from scott.emp) and deptno=10;

select ename from scott.emp where sal> (select avg(sal) from scott.emp) and deptno=20;

select ename from scott.emp where sal> (select avg(sal) from scott.emp) and deptno=10;

select ename from scott.emp where sal> (select avg(sal) from scott.emp) and deptno=20;

select ename from scott.emp where sal> (select avg(sal) from scott.emp) and deptno=30;

select ename from scott.emp where sal> (select avg(sal) from scott.emp) and deptno=10;

select ename from scott.emp where sal> (select avg(sal) from scott.emp) and deptno=20;

select ename from scott.emp where sal> (select avg(sal) from scott.emp) and deptno=10;

select ename from scott.emp where sal> (select avg(sal) from scott.emp) and deptno=20;

select ename,deptno from scott.emp where sal> (select avg(sal) from scott.emp) and deptno=10;

select ename,deptno from scott.emp where sal> (select avg(sal) from scott.emp) and deptno=20;

select * from scott.emp where sal> (select avg(sal) from scott.emp) and deptno=10;

select * from scott.emp where sal> (select avg(sal) from scott.emp) and deptno=20;

select * from scott.emp where sal> (select avg(sal) from scott.emp where deptno=10);

select * from scott.emp where sal> (select avg(sal) from scott.emp where deptno=10);

select * from scott.emp where sal> (select avg(sal) from scott.emp where deptno=20);

select * from scott.emp where sal> (select avg(sal) from scott.emp where deptno=10);

select * from scott.emp where sal> (select avg(sal) from scott.emp where deptno=20);

select ename from scott.emp where sal> (select avg(sal) from scott.emp where deptno=30);

select * from scott.emp where sal> (select avg(sal) from scott.emp where deptno=10);

select * from scott.emp where sal> (select avg(sal) from scott.emp where deptno=20);

select * from scott.emp where sal> (select avg(sal) from scott.emp where deptno=30);

select * from scott.emp where sal> (select avg(sal) from scott.emp where deptno=30);

select * from scott.emp;

select * from scott.emp;

select sum(sal),deptno from scott.emp groupby deptno;

select sum(sal),deptno from scott.emp groupby deptno;

select sum(sal),deptno from scott.emp group by deptno;

