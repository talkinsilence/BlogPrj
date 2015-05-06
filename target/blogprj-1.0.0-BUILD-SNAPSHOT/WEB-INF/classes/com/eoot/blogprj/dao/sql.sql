CREATE TABLE Notes (
Code int identity(1,1) NOT NULL PRIMARY KEY,
Title VARCHAR(100) NOT NULL,
Writer VARCHAR(50) NOT NULL,
Content VARCHAR(MAX) NOT NULL,
Regdate DATE NOT NULL,
Hit INT NOT NULL,
LikeCnt INT NOT NULL
);

drop table dbo.Notes;

SELECT * FROM Notes;

insert notes(title, writer, content, regdate, hit, likecnt) values('하이','나미','ㅇ우',getDate(),0,0);