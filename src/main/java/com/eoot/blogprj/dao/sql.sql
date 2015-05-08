CREATE TABLE Notes (
Code int identity(1,1) NOT NULL PRIMARY KEY,
Title VARCHAR(100) NOT NULL,
Writer VARCHAR(50) NOT NULL,
Content VARCHAR(MAX) NOT NULL,
Regdate DATETIME NOT NULL,
Hit INT NOT NULL,
LikeCnt INT NOT NULL
);

SELECT * FROM Notes;
delete from notes;

insert notes(title, writer, content, regdate, hit, likecnt) values('하이하이!!','나미','ㅇ우',getDate(),0,0);
insert notes(title, writer, content, regdate, hit, likecnt) values('This is 손방구 랩','니승이','뿡뿌붕부부부붕',getDate(),0,0);