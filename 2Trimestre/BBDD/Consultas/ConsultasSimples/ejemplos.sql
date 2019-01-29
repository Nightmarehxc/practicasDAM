/*
Obtener los clientes cuya línea de crédito sea mayor que los pagos que haya realizado.
 Utliza WHERE en lugar de JOIN para la unión de tablas.
*/
SELECT nombre FROM productos
ORDER BY PrecioVenta DESC LIMIT 1;

/*
	
*/
SELECT NOMBRE FROM PRODUCTOS 
WHERE `PrecioVenta` = (SELECT MAX(`PrecioVenta`) FROM productos);
/*
	
*/
EXPLAIN SELECT email FROM empleados
WHERE nombre = "Juan Carlos" \G

CREATE INDEX nombre ON empleados(nombre);

SELECT nombre FROM empleados;
