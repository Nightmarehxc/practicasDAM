create database nba;
use nba;
CREATE TABLE equipos (
Nombre VARCHAR (20),
Ciudad VARCHAR (20),
Conferencia VARCHAR(4),
Division VARCHAR (9),
PRIMARY KEY (Nombre));

CREATE TABLE Jugadores (
codigo INT (11),
Nombre VARCHAR(30),
Procedencia VARCHAR(20),
Altura VARCHAR(4),
Peso INT(11),
Posicion VARCHAR(5),
Nombre_equipo VARCHAR(20),
Primary key (codigo),
Foreign key (Nombre_equipo) references equipos(Nombre));
CREATE TABLE partidos (
codigo INT (11),
equipo_local VARCHAR(20),
equipo_visitante VARCHAR(20),
puntos_local INT(11),
temporada VARCHAR(5),
Primary key (codigo),
Foreign key (equipo_local)
	references equipos (Nombre),
Foreign key (equipo_visitante) 
	references equipos (Nombre));
CREATE TABLE estadisticas (
temporada VARCHAR(5),
jugador INT(11),
Puntos_por_partido float,
Asistencias_por_partido FLOAT,
Tapones_por_partido FLOAT,
Rebotes_por_partido FLOAT,
Primary key (temporada,jugador),
Foreign key (jugador) references jugadores (codigo));
/*
fin parte 1
Inicio parte 2
*/
CREATE user 'admind' IDENTIFIED BY 'ad234t4';
GRANT ALL PRIVILEGES ON nba.* to 'admind';
CREATE user'usu_nba' IDENTIFIED BY 'app57193';
GRANT select,insert, update, delete on nba.* to 'usu_nba';
/*
fin parte 2
Inicio parte 3 
*/
ALTER table Jugadores
	add Edad TINYINT after Procedencia,
	ADD CONSTRAINT edad_jugadores CHECK (Edad between 19 and 40),
	change Nombre Nom_completo VARCHAR (40);
alter table equipos
	add constraint div_eq CHECK
    (Division in 
		('Atlantic','Southeast','Central','Pacific','Southwest','Northwest')
        ),
MODIFY Division VArchar(15) ; 
Desc Jugadores;
/*
	Fin parte 3
	Inicio parte 4
*/
CREATE index nomb_jug on Jugadores(Nom_completo);
show index from Jugadores;
/*
Fin parte 4
Inicio parte 5
*/
CREATE VIEW vista_jug AS
    SELECT 
        Nom_completo, Nombre_equipo, Procedencia
    FROM
        Jugadores
    ORDER BY Nombre_equipo , Nom_completo ASC;



