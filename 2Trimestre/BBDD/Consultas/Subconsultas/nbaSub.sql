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
SELECT COUNT(codigo) FROM jugadores WHERE Nombre_equipo IN (SELECT nombre FROM equipos WHERE Division='NorthWest');

/*
Ejercicio 12:
Obtener la temporada con más puntos por partido de Kobe Bryant.
*/
SELECT temporada FROM estadisticas WHERE jugador IN (SELECT codigo FROM jugadores WHERE Nombre='Kobe Bryant') ORDER BY puntos_por_partido DESC LIMIT 1;

/*
Ejercicio 13:
Obtener el número de bases que tiene cada equipo de la Conferencia Este. (Los bases vienen representados por la letra ‘G’ en la BBDD).
*/
SELECT COUNT(codigo) FROM jugadores WHERE posicion='G' AND nombre_equipo IN (SELECT nombre FROM equipos WHERE conferencia='East');

/*
Ejercicio 14:
¿Cuántas letras tiene el equipo con el nombre más largo de la NBA?. Obtener también el nombre del equipo y la ciudad de donde procede. 
(Usar la función LENGTH, aunque en realidad esta función lo que nos dice es el nº de caracteres que ocupa el nombre del equipo en la BBDD 
incluido los espacios en blanco, no su número de letras, pero haremos una excepción).
*/
SELECT nombre AS "Nombre más largo", ciudad AS "Ciudad de procedencia" FROM equipos ORDER BY LENGTH(nombre) DESC LIMIT 1;

/*
Ejercicio 15:
Obtener la ciudad con el equipo cuya media de altura de los jugadores sea la más baja.
*/
SELECT ciudad FROM equipos WHERE Nombre IN (SELECT Nombre_equipo FROM jugadores ORDER BY AVG(altura) ASC);

/*
Ejercicio 16:
Obtener los jugadores y los puntos por partido de los Timberwolves en la temporada 2003/2004.
*/
SELECT jugador, puntos_por_partido FROM estadisticas WHERE (jugador IN (SELECT codigo FROM jugadores WHERE Nombre_equipo='Timberwolves')) AND temporada='03/04';

/*
Ejercicio 17:
Obtener el nombre y peso de los jugadores de la NBA que hayan hecho una media de más de 25 puntos por partido en alguna temporada.
*/
SELECT nombre, peso FROM jugadores WHERE codigo IN (SELECT jugador FROM estadisticas WHERE puntos_por_partido>25);

/*
Ejercicio 18:
Obtener las asistencias por partido y los tapones por partido de los jugadores de los Miami Heat en la temporada 2005/2006
*/
SELECT jugador, asistencias_por_partido, tapones_por_partido FROM estadisticas WHERE (jugador IN (SELECT codigo FROM jugadores WHERE Nombre_equipo='Heat')) AND temporada='05/06';

/*
Ejercicio 19:
Obtener la media de puntos por partido y la media de asistencias por partido de los Timberwolves en todas las temporadas.
*/
SELECT temporada, puntos_por_partido, asistencias_por_partido FROM estadisticas  WHERE  jugador IN (SELECT codigo FROM jugadores WHERE Nombre_equipo='Timberwolves');

/*
Ejercicio 20:
Obtener la media de puntos por temporada de los jugadores que se llamen Steve y pesen más de 200 libras.
*/
SELECT 
  jugador,
  puntos_por_partido 
FROM
  estadisticas 
WHERE jugador IN 
  (SELECT 
    codigo 
  FROM
    jugadores 
  WHERE (nombre LIKE 'Steve%') 
    AND (peso > '200')) ;

/*
Ejercicio 21:
Obtener el nombre, la altura y el peso de los jugadores que juegan en la ciudad de Los Ángeles y que sean españoles.
*/
SELECT nombre, altura, peso FROM jugadores WHERE Procedencia='Spain' AND (Nombre_equipo IN(SELECT Nombre FROM equipos WHERE Ciudad='Los Angeles'));

/*
Ejercicio 22:
Obtener los puntos por partido de los jugadores de los Lakers en la temporada 2007/2008.
*/
SELECT jugador, puntos_por_partido FROM estadisticas WHERE temporada='07/08' AND jugador IN(SELECT codigo FROM jugadores WHERE Nombre_equipo='Lakers');


