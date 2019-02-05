USE jardineria;
/*ejemplos
EXPLAIN SELECT email FROM empleados
WHERE nombre = "Carlos" \G

CREATE INDEX nombre ON empleados(nombre);

SELECT nombre FROM empleados;


EJEMPLO
/*
Obtener los clientes cuya línea de crédito sea mayor que los pagos que haya realizado.
 Utliza WHERE en lugar de JOIN para la unión de tablas.
SELECT CodigoCliente,NombreCliente,LimiteCredito FROM `clientes`
WHERE LimiteCredito > (SELECT Cantidad FROM pagos)
GROUP BY CodigoCliente;
*/

/*
Ejercicio 1:
Obtener el nombre del producto más caro. Realizar el ejercicio como una subconsulta y luego como una consulta simple para que dicha consulta sea más eficiente.
*/
SELECT NOMBRE FROM PRODUCTOS 
WHERE `PrecioVenta` = (SELECT MAX(PrecioVenta) FROM productos);

SELECT nombre FROM productos
ORDER BY PrecioVenta DESC LIMIT 1;

/*Ejercicio 2:
Obtener el nombre del producto del que más unidades se hayan vendido en un mismo pedido.
*/
SELECT nombre FROM productos 
WHERE CodigoProducto = (SELECT CodigoProducto FROM DetallePedidos ORDER BY Cantidad DESC LIMIT 1);

/*Ejercicio 3:
Obtener el nombre de los clientes que hayan hecho pedidos en 2008.
*/
SELECT NombreCliente FROM clientes 
WHERE CodigoCliente IN (SELECT CodigoCliente
			FROM Pedidos WHERE YEAR(FechaPedido) = 2008);

/*Ejercicio 4:
Obtener los clientes que han pedido más de 200 unidades de cualquier producto.
*/
SELECT NombreCliente FROM clientes 
WHERE CodigoCliente IN (SELECT DISTINCT CodigoCliente FROM detallepedidos WHERE cantidad > 200)GROUP BY 1;

/*Ejercicio 5:
Obtener los clientes que residen en ciudades donde no hay oficinas.*/
SELECT DISTINCT (ciudad )FROM Clientes WHERE ciudad NOT IN (SELECT DISTINCT (ciudad) FROM Oficinas);

/*Ejercicio 6:
Obtener el nombre, los apellidos y el email de los empleados a cargo de Alberto Soria.
*/
SELECT Nombre,Apellido1,Apellido2,Email FROM Empleados WHERE CodigoJefe IN (SELECT CodigoEmpleado FROM Empleados 
									    WHERE Nombre LIKE 'Alberto' AND Apellido1 LIKE 'Soria');

/*Ejercicio 7:
Obtener el nombre de los clientes a los que no se les ha entregado a tiempo algún pedido.
*/
SELECT nombreCliente FROM clientes WHERE CodigoCliente IN (SELECT CodigoCliente FROM pedidos WHERE fechaEntrega>fechaEsperada);
	
/*Ejercicio 8:
Obtener el nombre y teléfono de los clientes que hicieron algún pago en 2007, ordenados alfabéticamente por nombre.
*/
SELECT nombreCliente,telefono FROM clientes WHERE CodigoCliente IN (SELECT CodigoCliente FROM pagos WHERE FechaPago LIKE '2007%' ORDER BY NombreCliente) ;				

/*Ejercicio 9:
Obtener la gama, el proveedor y la cantidad de aquellos productos cuyo estado sea pendiente.
*/
SELECT DISTINCT nombre,gama,proveedor,cantidadEnStock FROM productos WHERE CodigoProducto IN (SELECT CodigoProducto FROM detallePedidos WHERE CodigoPedido
								IN (SELECT CodigoPedido FROM Pedidos WHERE Estado LIKE 'Pendiente'));