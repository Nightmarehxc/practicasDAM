USE nba;
/*
Ejercicio 1:
Obtener los jugadores que pesan más que la media de peso de todos los jugadores españoles.
*/
SELECT nombre FROM jugadores WHERE peso >(SELECT AVG(peso) FROM jugadores WHERE procedencia LIKE 'spain'); 

/*
Ejercicio 2:
Obtener los puntos por partido de Pau Gasol en toda su carrera.
*/
SELECT SUM(puntos_por_partido) AS "puntos totales en toda su carrera" FROM estadisticas WHERE jugador IN (SELECT DISTINCT codigo FROM jugadores WHERE nombre = 'Pau Gasol');

/*
Ejercicio 3:
Obtener los puntos por partido de los jugadores de los Cavaliers en la temporada 2007/2008.
*/
SELECT puntos_por_partido FROM estadisticas WHERE (jugador IN (SELECT codigo FROM jugadores WHERE Nombre_equipo LIKE 'Cavaliers'))
							      AND temporada LIKE '07/08';
							      
/*
Ejercicio 4:
Obtener el número de jugadores que tiene cada equipo de la Conferencia Oeste.
*/
SELECT COUNT(codigo) FROM jugadores WHERE Nombre_equipo IN (SELECT DISTINCT Nombre FROM equipos WHERE Conferencia='west');

/*
Ejercicio 5:
Obtener la máxima media de puntos de Lebron James en su carrera.
*/
SELECT temporada, puntos_por_partido
FROM
  estadisticas 
WHERE jugador IN 
  (SELECT 
    codigo 
  FROM
    jugadores 
  WHERE Nombre = 'Lebron James') ORDER BY puntos_por_partido DESC LIMIT 1;

/*
Ejercicio 6:
Obtener la media de asistencias por partido de José Calderón en la temporada 2007/2008.
*/
SELECT AVG(Asistencias_por_partido) FROM estadisticas WHERE (jugador IN (SELECT codigo FROM jugadores WHERE Nombre='Jose Calderon'))AND temporada='07/08';

/*
Ejercicio 7:
Obtener la media de puntos por partido de Lebron James en las temporadas del 2003/2004 al 2005/2006.
*/
SELECT 
  puntos_por_partido AS "Lebron James de 2003 a 2006"
FROM
  estadisticas 
WHERE (
    jugador IN 
    (SELECT 
      codigo 
    FROM
      jugadores 
    WHERE Nombre = 'Lebron James')
  ) 
  AND temporada
   BETWEEN '03/04' 
    AND '05/06' ;
/*
Ejercicio 8:
Obtener la media de rebotes de los jugadores de la Conferencia Este.
*/
SELECT 
  Rebotes_por_partido 
FROM
  estadisticas 
WHERE jugador IN 
  (SELECT 
    codigo 
  FROM
    jugadores 
  WHERE Nombre_equipo IN 
    (SELECT 
      Nombre 
    FROM
      equipos 
    WHERE Conferencia = 'East'
    ));
 /*
 Ejercicio 9:
 Obtener los rebotes por partido de los jugadores de los equipos
 de la ciudad de Los Ángeles en la temporada 2007/2008.
 */
 SELECT 
 jugador,
  Rebotes_por_partido 
FROM
  estadisticas 
WHERE jugador IN 
  (SELECT 
    codigo 
  FROM
    jugadores 
  WHERE Nombre_equipo IN 
    (SELECT 
      Nombre 
    FROM
      equipos 
    WHERE ciudad = 'Los Angeles'
    ));

/*
Ejercicio 10:
Obtener el máximo reboteador de los Suns en la temporada 2007/2008.
*/
SELECT Nombre FROM jugadores WHERE (codigo IN (SELECT jugador FROM estadisticas WHERE temporada='07/08' ORDER BY Rebotes_por_partido DESC))AND (Nombre_equipo='Suns') LIMIT 1;

/*
Ejercicio 11:
Obtener el número de jugadores que tiene cada equipo de la división NorthWest.
*/
SELECT 
  COUNT(codigo)
FROM
  jugadores 
WHERE Nombre_equipo IN 
  (SELECT
    Nombre 
  FROM
    equipos 
  WHERE division = 'NorthWest');
  /*
  
  */

