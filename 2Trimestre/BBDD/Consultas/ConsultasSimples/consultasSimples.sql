USE jardineria;
/*/EJERCICIO 1 
Obtener la ciudad y el teléfono de las oficinas de EEUU.*/ 
select ciudad,telefono from oficinas
where pais like 'EEUU';

/*EJERCICIO 2
Obtener el cargo, nombre, apellidos e email del jefe de la empresa.
*/
select Nombre,Apellido1,Apellido2,email from empleados
where CodigoJefe is null;


/* EJERCICIO 3
Obtener el nombre, apellidos y cargo de aquellos que no sean representantes de ventas.
*/
SELECT Nombre,Apellido1,Apellido2,puesto from empleados
where puesto <> 'Representante ventas';
/* EJERCICIO 4
Obtener el número de clientes que tiene la empresa.
*/
select count(*) from clientes;

/*EJERCICIO 5
Obtener el nombre de los clientes españoles.*/
select NombreCliente from clientes
where Pais like 'Spain';


/*EJERCICIO 6
Obtener cuántos clientes tiene la empresa en cada país.*/
select count(*),pais from clientes
group by Pais;
/*EJERCICIO 7
Obtener cuántos clientes tiene la empresa en la ciudad de Madrid.
*/
select count(*) from clientes
where ciudad like 'Madrid';

/*EJERCIOCIO 8
Obtener el código de empleado y el número de clientes al que atiende cada representante de ventas.*/
select codigoEmpleadoRepVentas as "CodigoEmpleado", count(*) as "Nº clientes" 
from clientes
group by 1;

/*EJERCIOCIO 9
Obtener cuál fue el primer y último pago que hizo el cliente cuyo código es el 3.*/
select min(fechapago) as "Primer pago",max(fechapago) as "Último pago" from pagos
where codigocliente like '3';

/*EJERCIOCIO 10
Obtener el código de cliente de aquellos clientes que hicieron pagos en 2008.*/
SELECT codigoCliente from pagos
where fechapago like ('%2008%');
/*
	Ejercicio 11
    Obtener los distintos estados por los que puede pasar un pedido.
*/
select estado from pedidos
group by 1;
/*
	Ejercicio 12
	Obtener el número de pedido, código de cliente, fecha requerida y fecha de entrega de los pedidos que no han sido entregados a tiempo.
*/
Select codigopedido,codigoCliente,fechaEsperada,fechaEntrega 
from pedidos
	where estado like 'Pendiente';
/*
Ejercicio 13
 Obtener cuántos productos existen en cada línea de pedido.*/
SELECT count(CodigoProducto) from detallepedidos;
/*
	Ejercicio 14
    Obtener un listado de los 20 códigos de productos más pedidos ordenado por cantidad pedida.
*/
select codigoProducto from detallepedidos
limit 20;
/*
	Ejercicio 15
Obtener el número de pedido, código de cliente, fecha requerida y fecha de entrega de los pedidos cuya fecha de entrega ha sido al menos dos días antes de la fecha requerida. (Usar la función addDate)

select 
	CodigoPedido,CodigoCliente date_add (FechaEsperada),interval -2 day)
	from pedidos
    where FechaEsperada > FechaEntrega; 
    ; ERROR ERROR ERROR ERROR
*/    
/*
	EJERCICO 16
    Obtener el nombre, apellidos, oficina y cargo de aquellos que no sean representantes de ventas.
    
*/
select Nombre,Apellido1,Apellido2,CodigoOficina from empleados
where puesto not like '%Ventas%';
/*
Ejercicio 17:
Obtener el número de clientes que tiene asignado cada representante de ventas.
*/
select  count(*),CodigoEmpleadoRepVentas from clientes
group by CodigoEmpleadoRepVentas ;

/*
Ejercicio 18:
Obtener un listado con el precio total de cada pedido.
*/
select precioVenta,CodigoProducto from productos;
/*
Ejercicio 19:
Obtener cuántos pedidos tiene cada cliente en cada estado.

*/
select estado,CodigoCliente,count(Codigopedido) from pedidos
group by codigoCliente;
/*
Ejercicio 20:
Obtener una lista con el código de oficina, ciudad, región y país de aquellas oficinas que estén en países que cuyo nombre empiece por “E”.
*/
select CodigoOficina,Ciudad,Region,pais from oficinas
where pais like 'E%';
/*
Ejercicio 21:
Obtener el nombre, gama, dimensiones, cantidad en stock y el precio de venta de los cinco productos más caros.
*/
select nombre,Gama,Dimensiones,CantidadEnStock,PrecioVenta from productos
group by precioVenta desc limit 5;

/*
Ejercicio 22:
Obtener el código y la facturación de aquellos pedidos mayores de 2000 euros
*/
SELECT  CodigoCliente,Cantidad from pagos
where Cantidad > 2000;
/*
Ejercicio 23:
Obtener una lista de los productos mostrando el stock total, la gama y el proveedor.
*/
select CodigoProducto,Gama,CantidadEnStock,Proveedor
from productos;
/*
Ejercicio 24:
Obtener el número de pedidos y código de cliente de aquellos pedidos cuya fecha de pedido sea igual a la de la fecha de entrega.
*/
select count(CodigoPedido),codigoCliente,FechaEntrega,FechaPedido from pedidos
where fechaPedido like fechaEntrega;
/*
Consultas simples de la Base de Datos “NBA” (I)*/
use nba;
/*
Ejercicio 1:
Jugadores cuya tercera letra de su nombre sea la “v”.
*/
select nombre 
	from jugadores
		where substring(nombre,3,1) like '%v%';
/*
Ejercicio 2:
Mostrar un listado de jugadores con el formato nombre(equipo) en una sola columna.
*/
select concat(Nombre," ( ",Nombre_Equipo," ) " )
	from jugadores
;
/*
Ejercicio 3:
Primeros 10 jugadores por orden alfabético.
*/
select Nombre 
	from jugadores
		group by nombre asc limit 10;
        
/*
Ejercicio 4:
	Nombre de las divisiones de la conferencia Este.
*/
select division from equipos 
	where conferencia like 'East';
    
/*Ejercicio 5:
Sacar cuántas letras tiene el nombre de cada jugador de los ‘grizzlies’. (Usar la función LENGTH).
*/
select nombre,length(nombre) from jugadores
	where nombre_equipo like 'grizzlies';
/*
Ejercicio 6:
Número de jugadores argentinos en la NBA.
*/
select count(nombre) from jugadores
	where Procedencia like '%arg%';
/*
Número de jugadores italianos y franceses en la NBA.
*/
select count(codigo) from jugadores
	where Procedencia in ('France' and 'Italy')
    ;
/*
	Ejercicio 8:
	Número de pivots (los pivots son representados en la BBDD con la letra C) que tiene cada equipo.
*/
select count(posicion) from jugadores
	where posicion like ('c');
/*Ejercicio 9:
¿Cuánto mide el pívot (los pivots son representados en la BBDD con la letra C) más alto
 (la altura en la BBDD viene representada en pies) de la NBA?
 
*/
select max(altura),nombre from jugadores
where posicion like ('c');
    
/*
Ejercicio 10:
Número de jugadores cuyo nombre empieza por “r”.
*/    
select count(nombre) as numeroJugadores from jugadores 
	where nombre like '%R%';
