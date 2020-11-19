-- 2020.11.16

-- PhoneBook DDL: 테이블 정의서를 참고해서 DDL을 작성한다
CREATE table phoneInfo_basic(
    idx number(6) constraint pi_basic_idx_PK primary key,
    fr_name VARCHAR2(20) not null,
    fr_phonenumber VARCHAR2(20) not null,
    fr_email VARCHAR2(20) ,
    fr_address VARCHAR2(20),
    fr_regdate DATE default sysdate
); 

desc phoneInfo_basic;
desc user_constraints;

select constraint_name, constraint_type
from user_constraints
where table_name='PHONEINFO_BASIC';

INSERT INTO PHONEINFO_BASIC

VALUES(1,'SCOTT', '010-0000-0000','SCOTT@','서울', SYSDATE);

SELECT * FROM phoneinfo_basic;

-- 시퀀스: 숫자 재생기
create sequence SEQ_PIBASIC_IDX
MINVALUE 0
START WITH 0
INCREMENT BY 1;

INSERT INTO PHONEINFO_BASIC
VALUES(SEQ_PIBASIC_IDX.nextval,'SCOTT', '010-0000-0000','SCOTT@','서울', SYSDATE);

INSERT INTO PHONEINFO_BASIC(IDX, fr_name, fr_phonenumber)
VALUES(SEQ_PIBASIC_IDX.nextval,'KING', '010-0000-0000');

--데이터 삭제
DELETE FROM phoneinfo_basic;

--데이터 업데이트
UPDATE phoneinfo_basic
SET fr_email='King@', fr_address='부산'
WHERE IDX=2;


-- C(REATE), R(EAD), U(UPDATE), D(DELETE)


CREATE TABLE phoneinfo_univ(
    idx NUMBER(6),
    fr_u_major VARCHAR2(20),
    fr_u_year NUMBER(1) default 1 check (fr_u_year BETWEEN 1 and 4),
    fr_ref NUMBER(7) NOT NULL,
    constraint pi_univ_idx_PK primary key (idx),
    constraint pi_uiv_ref_FK FOREIGN KEY (fr_ref) REFERENCES phoneinfo_basic (idx)
);
DROP TABLE phoneinfo_univ;
desc phoneinfo_univ;
select * from user_constraints
where table_name='PHONEINFO_UNIV';


--CRUD
insert into phoneinfo_basic (idx, fr_name, fr_phonenumber)
values(seq_pibasic_idx.nextval,'king','010');

insert into phoneinfo_univ values (3, '컴교육', 4, SEQ_PIBASIC_IDX.currval);

insert into phoneinfo_univ values (1, '한문교육', 4,2);
select * from phoneinfo_univ;

select *
from phoneinfo_basic pb, phoneinfo_univ pu
WHERE pb.idx=pu.fr_ref;


--update : phoneinfo_univ where idx=3;
update phoneinfo_univ
set fr_u_major='체육', fr_u_year=4
where idx=1;
select * from phoneinfo_univ;
--delete
delete phoneinfo_univ where fr_ref=3;
delete phoneinfo_basic where idx=3;


--phoneinfo_com
create table phoneinfo_com(
    idx number(6) constraint pi_com_idx_pk primary key, 
    fr_c_company varchar2(20) default 'N',
    fr_ref number(6) constraint pi_com_ref_FK references phoneinfo_basic (idx)
);

--회사 친구 정보 입력
--기본정보
insert into phoneinfo_basic (idx, fr_name, fr_phonenumber)
values (seq_pibasic_idx.nextval, '이정민', '010-');
--회사정보 입력
insert into phoneinfo_com values(1, 'skku', seq_pibasic_idx.curval);
--read 
select *
from phoneinfo_basic pb, phoneinfo_com pc
where pb.idx= pc.fr_ref
and pb.fr_name='이정민';

--update
update phoneinfo_com
set fr_c_company ='레알'
where idx=1;

--delete
--자식테이블부터 삭제하고 부모 테이블 행 삭제
delete from phoneinfo_com where fr_ref=11;
delete from phoneinfo_basic where idx=11;

select * from emp;
select * from dept;

select ename,emp.sal, dept.loc
from emp,dept
where emp.deptno=dept.deptno;
