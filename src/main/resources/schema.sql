create table t_club
(
id integer auto_increment,
name varchar(50),
players integer,
league integer,
primary key(id)
);


create table t_player
(
id integer auto_increment,
namep varchar(50),
salary integer,
pozition varchar(50),
id_club integer,
primary key(id),
foreign key(id_club) references t_club(id)
);

