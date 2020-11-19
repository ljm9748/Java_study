-- 2020.11.12

--DDL

--테이블 생성
--CREATE TABLE table_name(
-- column_name domain [constraint],
-- column_name domain [constraint],
-- column_name domain [constraint]
-- ... )

create table test_tbl (
    no number(4),
    user_name varchar2(10),
    user_id varchar2(16),
    user_password varchar2(12),
    reg_date Timestamp DEFAULT sysdate
    );
    
desc test_tbl;


desc emp;
CREATE table emp01 (
    empno number(4),
    ename varchar(10),
    dal number(7,2)
    );

-- crate table ~ as ~ : 테이블 복사, 제약조건은 복사 안됨
CREATE table emp02
as
select * from emp;
desc emp02;

select * from emp02;

create table emp03
as 
select empno, ename, sal from emp;
desc emp03;
select * from emp03;

create table emp04
as 
select * from emp where empno=10
;
select * from emp;
select * from emp04;

drop table test_tbl;
truncate table emp04;
select * from tab;

--테이블 구조의 변경
--alter table table_name{add | modify|drop}
desc emp01;
alter table emp01
add (job varchar2(10), deptno number(5));
desc emp01;
alter table emp01
add ( deptno number(5));

--기존 테이블에 컬럼추가할때 초기값은 null로 초기화됨
--기존 테이블의 컬럼 변경: 새롭게 정의된 컬럼으로 교체하는 것
alter table emp01
modify (deptno number(10));

--기존 테이브르이 컬럼 삭제 : 데이터도 모두 삭제
alter table emp01
drop (deptno);

--제약조건 정의
insert into dept values(10, 'test', 'seoul');

desc emp02;
insert into emp01 values(null, null,1000,'tester');
select * from emp02;

drop table emp02;

drop table emp01;

create table emp01(
    empno number(4) not null,
    ename varchar2(10) not null,
    var char(9),
    deptno number(2));
insert into emp01 values(null,null,'tester',10);
insert into emp01 values(1,'test1','tester',10);
select * from emp01;

--데이터의 중복 금지 :unique;
create table emp02(
    empno number(4) unique,
    ename varchar2(10) not null
    );

--default: insert 시 데이터가 입력되지 않을때 자동으로 등록
drop table emp07;
create table emp07(
    empno number(4) primary key,
    ename varchar2(10) not null,
    sal number(7,2) check(sal>=500),
    comm number(7,2) default 0,
    hiredate date default sysdate
);
insert into emp07 (empno, ename, sal) values (1, 'test', 3000);
select * from emp07;

drop table dept02;
create table dept02
as
select * from dept where 1=2;
select * from dept02;
insert into dept02
select * from dept;


--데이터의 수정
--update table_name set sulumn_name= value,..., where 조건
create table emp10
as 
select * from emp;
select * from emp10;

update emp10 set deptno=30;

update emp10
set sal = sal * 1.1;

update emp10
set deptno=20, job='MANAGER'
where ename='SCOTT';


select * from emp10;
delete from emp10 where deptno=20;
