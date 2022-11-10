DROP TABLE IF EXISTS peliculas;

create table peliculas(
	id int auto_increment,
    nombre varchar(100),
    edad int,
    primary key (id)
);

insert into peliculas (nombre, edad)
values ('Pelicula1', 7);
insert into peliculas (nombre, edad )
values ('Pelicula2', 13);
insert into peliculas (nombre, edad )
values ('Pelicula3', 16);

drop table if exists salas;

create table salas(
	id int auto_increment,
    nombre varchar(100),
    pelicula int,
    primary key (id),
    FOREIGN KEY (pelicula) REFERENCES peliculas (id) 
	ON DELETE CASCADE ON UPDATE CASCADE
);

insert into salas (nombre, pelicula)
values ('Sala1', 1);
insert into salas (nombre, pelicula)
values ('Sala2', 2);
insert into salas (nombre, pelicula)
values ('Sala3', 3);