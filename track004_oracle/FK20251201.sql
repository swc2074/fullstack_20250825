select table_name from user_tables;

select * from emp;

DESC disease;

CREATE TABLE disease_ox (
    oxno        NUMBER           PRIMARY KEY,
    disno       NUMBER           NOT NULL,
    oxquestion  VARCHAR2(300)    NOT NULL,
    oxanswer    CHAR(1)          NOT NULL CHECK (oxanswer IN ('O','X')),
    oxcomment   VARCHAR2(400),
    oxbhit      NUMBER           NOT NULL,
    createdat   DATE             NOT NULL,
    CONSTRAINT fk_disease_ox FOREIGN KEY(disno)
        REFERENCES disease(disno)
);

CREATE SEQUENCE disease_ox_seq;

desc disease_ox;