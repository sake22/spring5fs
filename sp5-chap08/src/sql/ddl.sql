create user 'spring5'@'localhost' identified by 'spring5';

create database spring5 character set = utf8;

grant all privileges on spring5.* to 'spring5'@'localhost';

create table MEMBER(
	ID int auto_increment primary key,
	EMAIL varchar(255),
	PASSWORD varchar(100),
	NAME varchar(100),
	REGDATE datetime,
	unique key (EMAIL)
) engine=innoDB character set = utf8;