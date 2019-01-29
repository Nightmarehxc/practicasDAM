/*ejemplos
EXPLAIN SELECT email FROM empleados
WHERE nombre = "Carlos" \G

CREATE INDEX nombre ON empleados(nombre);

SELECT nombre FROM empleados;
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
WHERE CodigoCliente IN (SELECT DISTINCT CodigoCliente FROM pedidos
			WHERE )



