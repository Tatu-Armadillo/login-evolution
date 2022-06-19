drop database if exists login_evolution;
create database login_evolution;
use login_evolution;

drop table if exists user;
create table user (
    id_usuario bigint primary key auto_increment,
    username varchar(50) not null unique,
    password varchar(50) not null unique
);

INSERT INTO `login_evolution`.`user` (`username`, `password`) VALUES ('teste', '123456');