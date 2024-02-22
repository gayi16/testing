REM   Script: Session 02
REM   class

select * from scott.emp;

select distinct deptno from scott.emp;

select distinct deptno from scott.emp 
select dname from scott.dept;

select dname from scott.dept;

select e.empno,e.ename,e.deptno,d.dname from scott.emp e, scott.dept.d where e.deptno=d.deptno;

select e.empno,e.ename,e.deptno,d.dname from scott.emp e, scott.dept d where e.deptno=d.deptno;

select e.empno,e.ename,e.deptno,d.dname join scott.emp e, scott.dept d on e.deptno=d.deptno;

select e.empno,e.ename,e.deptno,d.dname from scott.emp e inner join scott.dept d on e.deptno=d.deptno;

select e.empno,e.ename,e.deptno,d.dname from scott.emp e right join scott.dept d on e.deptno=d.deptno;

select e.empno,e.ename,e.deptno,d.dname from scott.emp e outer join scott.dept d on e.deptno=d.deptno;

