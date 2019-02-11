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
		
		SELECT NombreCliente,COUNT(CodigoPedido)
	FROM clientes INNER JOIN pedidos ON clientes.`CodigoCliente` = pedidos.`CodigoCliente`
		GROUP BY CLIENTES.`CodigoCliente`;
/*
EJERCICIO 5
	Obtener un listado con los nombres de los clientes
	y el total pagado por cada uno de ellos.
*/
SELECT `NombreCliente`, SUM(cantidad) AS "Total pagado" 
	FROM clientes LEFT JOIN pagos ON clientes.`CodigoCliente` = pagos.`CodigoCliente`
		GROUP BY nombreCliente;

/*
eJERCICIO 6
Obtener el nombre y apellidos de los empleados así como el nombre de cliente de aquellos empleados que representen a clientes que hayan efectuado algún pago mediante Paypal.
*/
SELECT  DISTINCT c.`NombreCliente`, e.`Nombre`,e.`Apellido1`,e.`Apellido2`, p.`FormaPago`
	FROM empleados e, clientes c, pagos p, detallepedidos dp
			WHERE p.`FormaPago` = "PayPal";	
/*Ejercicio 7:
Obtener cuántos empleados tiene cada oficina, mostrando el nombre de la ciudad donde está la oficina.
*/
SELECT 	o.`Ciudad`,COUNT(e.`CodigoEmpleado`)
	FROM empleados e, oficinas o
		WHERE e.`CodigoOficina` = o.`CodigoOficina`
		GROUP BY o.ciudad;
		
		
SELECT ciudad, COUNT(CodigoEmpleado)
	FROM empleados INNER JOIN oficinas ON oficinas.`CodigoOficina` = empleados.`CodigoOficina`
	GROUP BY ciudad;
/*
Ejercicio 8:
	Obtener el nombre, apellido, oficina (ciudad) y cargo del empleado que no represente a ningún cliente.
*/
SELECT e.`Nombre`,e.`Apellido1`,e.`Apellido2`,e.`Puesto`,o.ciudad
	FROM empleados e,oficinas o, clientes c
		WHERE e.`CodigoEmpleado` != c.`CodigoEmpleadoRepVentas`;
		
/*
Ejercicio 9: 
Obtener un listado con los clientes y el identificador de transacción
 de aquellos clientes que efectuaron algún pago en el año 2007.
*/
SELECT c.`NombreCliente`,p.`IDTransaccion`,p.`FechaPago`
	FROM clientes c, pagos p
		WHERE p.`FechaPago` LIKE "2007%";
/*
Ejercicio 10:
Obtener los nombres de los clientes así como los nombres y apellidos de sus representantes de aquellos clientes que no han realizado pagos.
*/
/*select c.`NombreCliente`, c.`CodigoEmpleadoRepVentas`
	from clientes c, pagos p
		where c.*/
		
SELECT NombreCliente, Nombre, Apellido1, Apellido2
	FROM clientes LEFT JOIN empleados ON empleados.`CodigoEmpleado`=clientes.`CodigoCliente`
		GROUP BY nombre;