/*1*/
USE jardineria;
CREATE TABLE tempClientes LIKE clientes;

/*2*/
INSERT INTO tempClientes 
(SELECT * FROM clientes);
SET autocommit = 0;
/*3*/
SELECT COUNT(tc.`CodigoCliente`) FROM tempClientes tc;


/*5*/
BEGIN; /*4*/
INSERT INTO `tempClientes`(`CodigoCliente`,`NombreCliente`,`NombreContacto`,`ApellidoContacto`,`Telefono`,`Fax`,`LineaDireccion1`,`Ciudad`,`Region`,`Pais`,`CodigoPostal`,`CodigoEmpleadoRepVentas`,`LimiteCredito`)
	VALUES (39,'Mi Empresa S.A.','Isabel','Moreno','34912345678','34123456789','C/Puerta del Angel, 7','Madrid','Madrid','Spain',28013,8,153240);
/*COMMIT;*/
/*6*/
SELECT * FROM tempClientes
	WHERE CodigoCliente = 39;
	

/*7*/
ROLLBACK;
/*8*/
SELECT * FROM tempClientes
	WHERE CodigoCliente = 39;
BEGIN; /*4*/
/*9*/
INSERT INTO `tempClientes`(`CodigoCliente`,`NombreCliente`,`NombreContacto`,`ApellidoContacto`,`Telefono`,`Fax`,`LineaDireccion1`,`Ciudad`,`Region`,`Pais`,`CodigoPostal`,`CodigoEmpleadoRepVentas`,`LimiteCredito`)
	VALUES (39,'Mi Empresa S.A.','Isabel','Moreno','34912345678','34123456789','C/Puerta del Angel, 7','Madrid','Madrid','Spain',28013,8,153240);
/*10*/
SELECT * FROM tempClientes
	WHERE CodigoCliente = 39;
/*11*/
COMMIT;
/*12*/
SELECT * FROM tempClientes
	WHERE CodigoCliente = 39;
/*13*/
BEGIN;
/*14 ISABEL HELP*/ 
UPDATE tempClientes
SET 'Fax' = 3491543256785
WHERE 
CodigoCliente = 39; 
/* 15*/
SELECT Fax FROM tempClientes
	WHERE codigoCliente = 39;
/*16*/
ROLLBACK;
/*17*/
SELECT Fax FROM tempClientes
	WHERE codigoCliente = 39;
/*18*/
UPDATE tempClientes
SET 'Fax' = 3491543256785
WHERE 
CodigoCliente = 39; 
/*19*/
SELECT Fax FROM tempClientes
	WHERE codigoCliente = 39;
/*20*/
COMMIT;
/*21*/
SELECT Fax FROM tempClientes
	WHERE codigoCliente = 39;
/*22*/
BEGIN;
/*23*/
DELETE FROM tempClientes
	WHERE codigoCliente = 39;
/*24*/
SELECT Fax FROM tempClientes
	WHERE codigoCliente = 39;
/*25*/
ROLLBACK;
/*26*/
DELETE * FROM tempClientes
	WHERE codigoCliente = 39;
/*27*/
SELECT Fax FROM tempClientes
	WHERE codigoCliente = 39;
/*28*/
COMMIT;
/*29*/
SELECT * FROM tempClientes
	WHERE codigoCliente = 39;
	
SELECT COUNT(codigoCliente) FROM tempClientes;
/*30*/
DROP TABLE tempClientes;
