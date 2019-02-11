/*
EJERCICIO CONSULTAS MULTITABLAS

Ejercicio 1:
Obtener los clientes cuya línea de crédito sea mayor que los pagos que haya realizado.
 Utliza WHERE en lugar de JOIN para la unión de tablas.
*/
USE JARDINERIA;
SELECT c.NombreCliente,c.`LimiteCredito`, c.CodigoCliente,SUM(p.`Cantidad`)
	FROM Clientes c, Pagos p
    WHERE c.`CodigoCliente` = p.`CodigoCliente`
    GROUP BY c.`CodigoCliente`
    HAVING c.`LimiteCredito` > SUM(p.`Cantidad`);
    
/*
Ejercicio 2:
Obtener el nombre de los clientes y el nombre de sus representantes junto con la ciudad de la oficina a la que pertenece el representante. Utliza WHERE en lugar de JOIN para la unión de tablas
*/
SELECT c.NombreCliente,e.`Nombre`,o.`Ciudad`
FROM clientes c, empleados e, oficinas o
	WHERE c.`CodigoEmpleadoRepVentas` = e.`CodigoEmpleado` 
	AND e.`CodigoOficina` = o.`CodigoOficina`
	GROUP BY c.`CodigoCliente`;
	
/*
	Ejercicio 3
	Obtener el nombre de los clientes y el nombre de sus representantes junto con la ciudad de la oficina
	 a la que pertenece el representante. Utliza JOIN en lugar de WHERE para la unión de tablas.
*/
SELECT	NombreCliente,nombre,oficinas.`Ciudad`,nombre
	FROM clientes INNER JOIN empleados	
		ON CodigoEmpleadoRepVentas = codigoEmpleado
			INNER JOIN oficinas
			ON Empleados.`CodigoOficina`= oficinas.`CodigoOficina`
			GROUP BY nombreCliente;
/*Ejercicio 4
	Obtener un listado de clientes indicando
	el nombre del cliente y cuantos pedidos ha realizado.
*/
SELECT c.`NombreCliente`,COUNT(p.`CodigoPedido`)
	FROM clientes c, pedidos p
		WHERE c.CodigoCliente = p.CodigoCliente
		GROUP BY c.CodigoCliente;
/*
	Obtener un listado con los nombres de los clientes
	y el total pagado por cada uno de ellos.
*/
SELECT 
	FROM clientes c, productos p, 
