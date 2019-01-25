SELECT nombre FROM productos
ORDER BY PrecioVenta DESC LIMIT 1;


SELECT NOMBRE FROM PRODUCTOS 
WHERE `PrecioVenta` = (SELECT MAX(`PrecioVenta`) FROM productos);

EXPLAIN SELECT email FROM empleados
WHERE nombre = "Juan Carlos" \G

CREATE INDEX nombre ON empleados(nombre);

SELECT nombre FROM empleados;
