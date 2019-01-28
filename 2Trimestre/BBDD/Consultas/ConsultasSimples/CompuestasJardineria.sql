/*
Obtener los clientes cuya línea de crédito sea mayor que los pagos que haya realizado.
 Utliza WHERE en lugar de JOIN para la unión de tablas.
*/
SELECT CodigoCliente,NombreCliente,LimiteCredito FROM `clientes`
WHERE LimiteCredito > (SELECT Cantidad FROM pagos)
GROUP BY CodigoCliente;
