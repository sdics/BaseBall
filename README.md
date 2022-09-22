## 야구 프로젝트
```
DROP table stardium;
DROP table team;
DROP table player;
DROP table playerout;

drop sequence stardium_seq;
drop sequence team_seq;
drop sequence player_seq;

 CREATE SEQUENCE stardium_seq
        INCREMENT BY 1
        START WITH 1;
CREATE SEQUENCE team_seq
        INCREMENT BY 1
        START WITH 1;
CREATE SEQUENCE player_seq
        INCREMENT BY 1
        START WITH 1;
```
-- 야구장
### 테이블 생성
```
CREATE TABLE stardium(
    id int auto_increment primary key,
    stardiumname VARCHAR (20),
    since VARCHAR (20),
    teamname VARCHAR (20)
);

CREATE TABLE team(
	id int auto_increment primary key,
    teamname varchar(20),
    since varchar(10),
    stardiumname varchar(10),
    hometown varchar(5)
);

CREATE TABLE player(
    id int auto_increment primary key,
    playername varchar(5),
    age varchar(10),
    position varchar(10),
    teamname varchar(20)
);

CREATE TABLE playerout(
    id int auto_increment primary key,
    NAME VARCHAR(10),
    reason varchar(100),
    POSITION VARCHAR(20),
    createdate timestamp
);
SELECT * FROM playerout;
```

###더미데이터
```
Insert into stardium(stardiumname, since, teamname)
VALUES("사직야구장", "1986" , "롯데자이언츠");
Insert into stardium(stardiumname, since, teamname)
VALUES("창원NC파크", "2019" , "엔씨다이노스");
Insert into stardium(stardiumname, since, teamname)
VALUES("고척스카이돔", "2015" , "키움히어로즈");

INSERT INTO team(teamname, since, stardiumname, hometown)
VALUES ("롯데자이언츠" , "1982" , "사직야구장" , "부산");
INSERT INTO team(teamname, since, stardiumname, hometown)
VALUES ("엔씨다이노스" , "2011" , "창원NC파크" , "창원");
INSERT INTO team(teamname, since, stardiumname, hometown)
VALUES ("키움히어로즈" , "2008" , "고척스카이돔" , "서울");

INSERT INTO player(playername,age, position, teamname)
VALUES ("이대호", "43세" , "내야수" , "롯데자이언츠");
INSERT INTO player(playername,age, position, teamname)
VALUES ("황성빈", "25세" , "외야수" , "롯데자이언츠");
INSERT INTO player(playername,age, position, teamname)
VALUES ("박세웅", "27세" , "투수" , "롯데자이언츠");

INSERT INTO player(playername,age, position, teamname)
VALUES ("박민우", "29세" , "내야수" , "엔씨다이노스");
INSERT INTO player(playername,age, position, teamname)
VALUES ("손아섭", "34세" , "외야수" , "엔씨다이노스");
INSERT INTO player(playername,age, position, teamname)
VALUES ("신민혁", "23세" , "투수" , "엔씨다이노스");

INSERT INTO player(playername,age, position, teamname)
VALUES ("김웅빈", "26세" , "내야수" , "키움히어로즈");
INSERT INTO player(playername,age, position, teamname)
VALUES ("이정후", "24세" , "외야수" , "키움히어로즈");
INSERT INTO player(playername,age, position, teamname)
VALUES ("안우진", "23세" , "투수" , "키움히어로즈");

INSERT INTO playerout(NAME, reason, POSITION, createdate)
VALUES ("이승엽","은퇴","내야수","");
```


