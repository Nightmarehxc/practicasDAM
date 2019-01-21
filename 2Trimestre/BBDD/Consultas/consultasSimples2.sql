use nba;
/*
	Ejercicio 11
	Peso medio (el peso de los jugadores viene especificado en libras en la BBDD) de los jugadores de los Raptors.
*/
select avg(peso) as peso_medio from jugadores
		where nombre_equipo like 'Raptors';
/*
	Ejercicio 12
    Número de equipos que tiene cada conferencia.
*/
select conferencia, count(*) from equipos
	group by conferencia; 

/*Ejercicio 13:
Nombre de las divisiones de la conferencia Este.
*/
select Division from equipos
	where conferencia = 'East'; 
/*
Ejercicio 14:
Obtener cuántos caracteres ocupa el nombre de cada jugador de los Bulls. Usar la función LENGTH.
*/

select nombre,length(Nombre) as longitud from jugadores
	where Nombre_equipo like '%Bulls%';
/*
Ejercicio 15
	Obtener la media de peso (el peso de los jugadores viene especificado en libras en la BBDD) de los jugadores de cada equipo.
*/
select avg(peso) as mediapeso,Nombre_equipo from jugadores
	group by Nombre_equipo;
/*
Ejercicio 16
Obtener los equipos cuya media de peso de sus jugadores sea superior a 228 libras.
*/
select Nombre_equipo,avg(peso) from jugadores
    group by 1
    having avg(peso) > 228; /* SI EL WHERE DA POR CULO SE METE HAVING*/
    
/*
Ejercicio 17:
Obtener el número de jugadores españoles de cada equipo.
*/
select Nombre_equipo,count(nombre) from jugadores
where procedencia = 'Spain'
group by 1;
/*
Ejercicio 18:
Obtener el nombre de los equipos con más de un jugador español.
*/
select Nombre_equipo,count(nombre) from jugadores
	where procedencia like 'Spain'
    group by 1;
/*
Ejercicio 19:
Obtener la media de peso de aquellos jugadores (el peso de los jugadores viene especificado en libras en la BBDD) cuya procedencia sea de España, Francia e Italia. Muestra el resultado agrupado por país.
*/
select Nombre_equipo,avg(peso) from jugadores
	where Procedencia like 'Spain' or 'France' or ' Italy'
    group by 1;
    
    
    
    
    
    
    