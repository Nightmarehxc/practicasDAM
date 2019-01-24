/*
EJERCICIO CONSULTAS MULTITABLAS

Ejercicio 1:
Obtener los clientes cuya línea de crédito sea mayor que los pagos que haya realizado.
 Utliza WHERE en lugar de JOIN para la unión de tablas.
*/
SELECT c.NombreCliente, c.CodigoCliente
	from Clientes c, Pagos p
    where c.LimiteCredito > p.Cantidad
    group by c.NombreCliente, c.CodigoCliente;
/*
Ejercicio 2:
Obtener el nombre de los clientes y el nombre de sus representantes junto con la ciudad de la oficina a la que pertenece el representante. Utliza WHERE en lugar de JOIN para la unión de tablas
*/
select n.NombreCliente,n.CodigoEmpleadoRepVentas,o.CodigoOficina
from 