select trunc(sysdate-to_date('1995/11/19', 'yyyy/mm/dd')) 
from dual;

--switch case 문과 비슷한 DECODE함수
SELECT ename,deptno, DECODE(deptno, 10, 'ACCOUNTING',
                                    20, 'RESEARCH',
                                    30, 'SALES',
                                    40, 'OPERATIONS') AS DNAME
FROM emp;

SELECT empno, ename, job, sal, DECODE(job, 'ANALYST', sal*1.05,
                                            'SALESMAN', sal*1.1,
                                            'MANAGER', sal*1.15,
                                            'CLERK', sal*1.2) as UPSAL
from emp;

-- 그룹함수 : 하나의 행의 컬럼을 대상이 아닌 행의 그룹의 컬럼들을 묶어 그룹화 하고 연산하는 함수
-- 그룹함수 : sum, avg, count, max, min
select sum(sal) as "월 급여 총액" 
from emp;


select deptno, avg(sal)
from emp
group by deptno
having avg(sal)>=2000
order by deptno;

-- 부서별 급여의 최대값과 최소값을 구하되 최대급여가 2900이상인 부서만 출력
select deptno, max(sal), min(sal)
from emp
group by deptno
having max(sal)>2900;

select *
from emp;

select job, 
    count(*) ||' 명' as "사원 수", 
    to_char(sum(sal)*1100, 'L999,999,999') as "급여의 총합", avg(sal) as "평균급여", max(sal) as "최대급여", min(sal) as "최소급여"
from emp
where job !='PRESIDENT'
group by job
order by job;