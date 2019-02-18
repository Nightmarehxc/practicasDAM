use jardineria;


/*Consultas multitablas de la Base de Datos “Jardineria” (I)*/


/*Ejercicio1:
Obtener los clientes cuya línea de crédito sea mayor que los pagos que haya realizado. Utliza WHERE en lugar de JOIN para la unión de tablas.
*/

SELECT c.NombreCliente, c.CodigoCliente, SUM(Cantidad)
FROM Clientes c, Pagos p
WHERE c.CodigoCliente = p.CodigoCliente
GROUP BY NombreCliente
HAVING LimiteCredito> SUM(Cantidad);

/*Ejercicio 2:
Obtener el Nombre de los clientes y el Nombre de sus representantes junto con la ciudad de la oficina a la que pertenece el representante. Utliza WHERE en lugar de JOIN para la unión de tablas
*/
SELECT c.NombreCliente, e.Nombre, o.Ciudad
FROM Clientes c, Empleados e, Oficinas o
WHERE c.CodigoEmpleadoRepVentas = e.CodigoEmpleado
AND e.CodigoOficina = o.CodigoOficina;


/*Ejercicio 3:
Obtener el Nombre de los clientes y el Nombre de sus representantes junto con la ciudad de la oficina a la que pertenece el representante. Utliza JOIN en lugar de WHERE para la unión de tablas.
*/
SELECT NombreCliente, Nombre, Oficinas.Ciudad
FROM Clientes
INNER JOIN Empleados ON Clientes.CodigoEmpleadoRepVentas = Empleados.CodigoEmpleado
INNER JOIN Oficinas ON Empleados.CodigoOficina = Oficinas.CodigoOficina;


/*Ejercicio 4:
Obtener un listado de clientes indicando el Nombre del cliente y cuantos pedidos ha realizado.
*/
SELECT NombreCliente, COUNT(CodigoPedido)
FROM Clientes c, Pedidos pe
WHERE c.CodigoCliente = pe.CodigoCliente
GROUP BY NombreCliente;


/*Ejercicio 5:
Obtener un listado con los Nombres de los clientes y el total pagado por cada uno de ellos.
*/
SELECT NombreCliente, SUM(Cantidad)
FROM Clientes c, Pagos pa
/* INNER JOIN Pagos ON Clientes.CodigoCliente = Pagos.CodigoCliente 
GROUP BY NombreCliente; */
WHERE c.CodigoCliente = pa.CodigoCliente
GROUP BY 1;


/*Ejercicio 6:
Obtener el Nombre y apellidos de los empleados así como el Nombre de cliente de aquellos empleados que representen a clientes que hayan efectuado algún pago mediante Paypal.
*/
SELECT Nombre, Apellido1, Apellido2, NombreCliente
FROM Clientes c, Empleados e, Pagos pa
WHERE c.CodigoCliente = pa.CodigoCliente
AND c.CodigoEmpleadoRepVentas = e.CodigoEmpleado
AND FormaPago LIKE 'PayPal'
GROUP BY 1,2,3,4;


/*Ejercicio 7:
Obtener cuántos empleados tiene cada oficina, mostrando el Nombre de la ciudad donde está la oficina.
*/
SELECT COUNT(CodigoEmpleado), Ciudad
FROM Empleados e, Oficinas o
WHERE e.CodigoOficina = o.CodigoOficina
GROUP BY 2;


/*Ejercicio 8:
Obtener el Nombre, apellido, oficina (ciudad) y cargo del empleado que no represente a ningún cliente.
*/
SELECT Nombre, Apellido1, o.Ciudad, Puesto
FROM Clientes c, Empleados e, Oficinas o
WHERE c.CodigoEmpleadoRepVentas NOT IN(e.CodigoEmpleado)
AND c.CodigoEmpleadoRepVentas NOT IN(e.CodigoJefe)
AND e.CodigoOficina = o.CodigoOficina
GROUP BY 1,2,3,4;


/*Ejercicio 9:
Obtener un listado con los clientes y el identificador de transacción de aquellos clientes que efectuaron algún pago en el año 2007.
*/
SELECT NombreCliente,IDTransaccion
FROM Clientes c, Pagos pa
WHERE c.CodigoCliente = pa.CodigoCliente
AND YEAR(FechaPago) = 2007;


/*Ejercicio  10:
Obtener los Nombres de los clientes así como los Nombres y apellidos de sus representantes de aquellos clientes que no han realizado pagos.
*/
SELECT NombreCliente,IDTransaccion
FROM Clientes c, Pagos pa
WHERE c.CodigoCliente = pa.CodigoCliente
AND YEAR(FechaPago) = 2007;


use jardineria;

/*Consultas multitablas de la Base de Datos “Jardineria” (II)*/



/*Ejercicio 11:
Obtener el Nombre, gama y descripción de texto de los productos que nunca se han pedido.
*/
SELECT Nombre, pro.Gama, DescripcionTexto
FROM DetallePedidos d, Productos pro, GamasProductos g
WHERE pro.Gama = g.Gama
AND pro.CodigoProducto = d.CodigoProducto
AND d.CodigoProducto NOT IN (SELECT CodigoPedido From DetallePedidos)
GROUP BY 1,2,3;


/*Ejercicio 12:
Obtener el Nombre, apellidos y el código postal de todos los empleados que trabajan en Barcelona.
*/
SELECT Nombre,Apellido1, Apellido2,CodigoPostal
FROM Empleados e, Oficinas o
WHERE e.CodigoOficina = o.CodigoOficina
AND Ciudad LIKE 'Barcelona';


/*Ejercicio 13:
Obtener el código de producto, descripción del texto y la cantidad de veces que se ha pedido dicho producto.
*/
SELECT CodigoProducto, DescripcionTexto
FROM Productos
INNER JOIN GamasProductos ON Productos.Gama = GamasProductos.Gama
GROUP BY 1,2;


/*Ejercicio 14:
Obtener el Nombre de los clientes de la ciudad de Madrid que han realizado algún pedido y el estado en que esté dicho pedido.
*/
SELECT NombreCliente, Estado
FROM Clientes c, Pedidos pe
WHERE c.CodigoCliente = pe.CodigoCliente
AND Ciudad LIKE 'Madrid'
GROUP BY 1,2;

use nba;

/*Consultas multitablas de la Base de Datos “NBA” (I)*/

/*Ejercicio 1:
Obtener el Número total de jugadores de cada división.
*/
SELECT COUNT(Codigo), Division
FROM jugadores j, equipos e
WHERE j.Nombre_equipo = e.Nombre
GROUP BY Division;

/*Ejercicio 2:
Obtener el Nombre, equipo y la media de puntos de todas las temporadas de los jugadores españoles de la NBA.
*/
SELECT Nombre, Nombre_equipo, AVG(Puntos_por_partido)
FROM jugadores j, estadisticas es
WHERE j.codigo = es.jugador
AND Procedencia LIKE 'Spain'
GROUP BY Nombre, Nombre_equipo;


/*Ejercicio 3:
Obtener el Nombre, Nombre de equipo y división de los jugadores de nacionalidad brasileña. Utiliza WHERE en lugar de JOIN para la unión de tablas.
*/
SELECT j.Nombre, Nombre_equipo, Division
FROM jugadores j, equipos e
WHERE j.Nombre_equipo = e.Nombre
AND Procedencia LIKE 'Brazil';


/*Ejercicio4:
Obtener el Nombre de los jugadores, el Nombre del equipo al que pertenecen y la ciudad de aquellos que han realizado algún tapón en la temporada 2003/2004.
*/
SELECT j.Nombre, Nombre_equipo, Ciudad
FROM jugadores j, equipos e, estadisticas es
WHERE j.codigo = es.jugador
AND j.Nombre_equipo = e.Nombre
AND Tapones_por_partido >= 1
AND Temporada = '03/04';