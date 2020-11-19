--2020.11.11
--JOIN
--CROSS JOIN : 조건없이 테이블과 테이블을 붙여준다
SELECT *
FROM emp, dept
;

--EQUI JOIN
select *
from emp,dept
where emp.deptno = dept.deptno;

--SCOTT의 사원번호와 이름, 부서이름, 지역을 출력 - emp
-- 부서이름, 지역으 출력 -dept
SELECT empno, ename, emp.deptno, dname, loc
FROM emp, dept
WHERE emp.deptno = dept.deptno and ename='SCOTT';


SELECT e.empno, e.ename, e.deptno, d.dname, d.loc
FROM emp e, dept d
WHERE e.deptno = d.deptno and e.ename='SCOTT';

-- ANSI -> T1 INNER JOIN T2 ON 조인의 조건
SELECT *
FROM emp INNER JOIN dept
ON emp.deptno=dept.deptno;

SELECT deptno
FROM emp JOIN dept
USING(deptno); --공통 컬럼은 하나만 가지게 해준다. 공통컬럼을 구별할 필요가 없다
--ON emp.deptno=dept.deptno;

--NATURAL JOIN: 동일 컬럼 조인의 조건을 생략(USING과 동일), 같은 이름의 컬럼은 하나씩이어야함
SELECT *
FROM emp NATURAL JOIN dept;


-- Non Equi Join: 동등 비교가 아닌 비교 연산이 가능
--1. CROSS JOIN
SELECT *
FROM emp e, salgrade s
WHERE e.sal BETWEEN s.losal and s.hisal
;

-- ANSI JOIN: CROSS JOIN과 같은건데 다른 sql에서 사용가능
SELECT *
FROM emp cross join dept
;

SELECT * FROM salgrade;

-- SELF JOIN : 자신의 테이블을 조인
SELECT e.ename, e.mgr, m.ename
From emp e, emp m
WHERE e.mgr= m.empno;

-- OUTER JOIN: 정보가 부족해도 출력하도록 하는 JOIN
SELECT e.ename, e.mgr, m.ename
From emp e, emp m
WHERE e.mgr= m.empno(+);

-- ansi outer join
--TI [LEFT| RIGHT| FULL] OUTER JOIN T2
SELECT *
FROM emp e RIGHT OUTER JOIN emp m
on e.mgr=m.empno;

--회원, 구매
--customer, orders
SELECT * FROM customer;
select * from orders order by custid;

select c.name, count(o.orderid), sum(o.saleprice), avg(o.saleprice)
from customer c, orders o
where c.custid= o.custid(+)
group by c.name;


SELECT *
FROM emp
WHERE sal> (SELECT avg(sal) FROM emp);

SELECT ename
FROM emp
WHERE deptno = (SELECT deptno FROM emp WHERE ename = 'SCOTT');

select *
from emp
where deptno in(select distinct deptno
                from emp
                where sal>=3000);
                

select ename, sal
from emp
where sal> any(select sal from emp where deptno=30);

select rownum, ename, sal from emp order by sal desc;
--ROWNUM
SELECT rownum, ename, sal
from (select rownum, ename, sal from emp order by sal desc)
where rownum<6
;

select distinct custid,(select name from customer where customer.custid=orders.custid),saleprice, orderdate
from orders
;

select c.custid, c.name, sum(o.saleprice)
from customer c, orders o
where c.custid=o.custid(+)
group by c.custid, c.name
order by sum(o.saleprice);


select o.custid, (
                 select name from customer c where o.custid= c.custid), sum(o.saleprice)
from orders o
group by o.custid;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
select c.name, sum(o.saleprice), avg(o.saleprice) 
from orders o, (
        select custid, name
        from customer
        where custid<=2 
        ) c
;
                 