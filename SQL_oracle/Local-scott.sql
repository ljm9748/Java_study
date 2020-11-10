-- 2020.11.09
-- select 기본

-- scott 계정으로 로그인
-- scott 계정이 소유한 테이블 객체를 확인: tab-> 사용자가 가지는 테이블의 정보를 가지는 데이터 사전의 개념
select * from tab;

--테이블의 구조 확인: desc
--테이블의 데이터를 검색하기 전 구조를 확인할 때
DESC emp;
desc dept;

select hiredate from emp;

-- 데이터의 조회 명령: select;
-- SELECT 컬럼명, ... FROM 테이블 이름(조회의 대상) --> 기본문법

SELECT --조회하는 명령어 
* -- 컬럼 이름을 기술해 준다. 기술하는 순서에 따라 결과도 순서에 맞게 출력
FROM emp -- 조회하고자 하는 테이블 이름을 출력
; --SQL의 종료

--부서 테이블의 모든 데이터를 조회하자
--select의 결과는 table이다
SELECT * 
FROM dept;

select ename, empno, job
from emp;

--select 절의 사칙연산 가능
--dual: 임시테이블이며 컬럼은 x를 가지는 테이블
select 100*10, 200-100
from dual;

select ename, sal, sal*12 as "연봉"
from emp;

select ename, sal, sal*12, nvl(comm,0) as comm,  sal*12+nvl(comm,0)  as "12개월 연봉"
from emp;

-- null: 값은 존재하는데 정해지지 않은 값. 사칙, 비교연산 불가
-- nvl함수: null 값을 치환해주는 함수
-- nul(컬럼, 대체값): 컬럼의 값이 null일때 대체값으로 치환, 이때 대체값은 컬럼타입에 맞아야함


--데이터베이스의 sql내부 문자열처리는 작은 따옴표
select ename || ' is a ' || job
from emp;


--distinct 데이터의 중복값을 제거하고 출력
SELECT DISTINCT deptno
from emp;

select empno, ename, job, mgr, hiredate, sal, comm, deptno
from emp
order by sal; --생략하면 오름차순

--1. 덧셈연산자를 이용하여 모든 사원에 대해서 $300의 급여 인상을 계산한 후 사원의 이름, 급여, 인상된 급여를 출력하시오.
select ename, sal, sal+300
from emp;

--2. 사원의 이름, 급여, 연간 총 수입을 총 수입이 많은 것부터 작은 순으로 출력하시오, 연간 총수입은 월급에 12를 곱한 후 $100의 상여금을 더해서 계산하시오.
select ename, sal, sal*12+100 as "총수입"
from emp
order by 총수입 desc;

--3. 급여가 2000을 넘는 사원의 이름과 급여를 표현, 급여가 많은 것부터 작은 순으로 출력하시오.
select ename
from emp
where sal>2000
order by sal desc;
--4. 사원번호가 7788인 사원의 이름과 부서번호를 출력하시오.
select ename,deptno
from emp
where empno=7788;
--5. 급여가 2000에서 3000 사이에 포함되지 않는 사원의 이름과 급여를 출력하시오.
select ename, sal
from emp
where not sal between 2000 and 3000;

--6. 1981년 2월 20일 부터 1981년 5월 1일 사이에 입사한 사원의 이름, 담당업무, 입사일을 출력하시오.
--
--7. 부서번호가 20 및 30에 속한 사원의 이름과 부서번호를 출력, 이름을 기준(내림차순)으로 영문자순으로 출력하시오.
--
--8. 사원의 급여가 2000에서 3000사이에 포함되고 부서번호가 20 또는 30인 사원의 이름, 급여와 부서번호를 출력, 이름순(오름차순)으로 출력하시오.
--
--9. 1981년도에 입사한 사원의 이름과 입사일을 출력하시오. (like 연산자와 와일드카드 사용)
--
--10. 관리자가 없는 사원의 이름과 담당 업무를 출력하시오.
--
--11. 커미션을 받을 수 있는 자격이 되는 사원의 이름, 급여, 커미션을 출력하되 급여 및 커미션을 기준으로 내림차순 정렬하여 표시하시오.
--
--12. 이름의 세번째 문자가 R인 사원의 이름을 표시하시오.
--
--13. 이름에 A와 E를 모두 포함하고 있는 사원의 이름을 표시하시오.
--
--14. 담당업무가 CLERK, 또는 SALESMAN이면서 급여가 $1600, $950 또는 $1300이 아닌 사원의 이름, 담당업무, 급여를 출력하시오.
--
--15. 커미션이 $500 이상인 사원의 이름과 급여 및 커미션을 출력하시오.

