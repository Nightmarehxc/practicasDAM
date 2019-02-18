/*
•	Desactivar el autocommit, de otro modo no tendrá sentido hacer una transacción, si cada instrucción autoexecuta un commit al finalizar.
•	Definir que las transacciones siguientes sean Serializable, de forma global.
•	Bloquea las tablas cliente y película (para lectura), y para escritura: factura, detallfactura y préstamo.
•	Iniciar la transacción.
•	Crear las sentencias SQL que sea necesario para reflejar en la base de datos que la clienta María Catasús alquila la copia 1 de la película AAAAAAA y, por tanto, generar una factura número 5 donde se refleje el alquiler de la película por 4,5 euros, en la fecha actual del sistema.
•	Hacer un commit.
•	Desbloquear las tablas.
*/
USE videoclub;
/* Desactivar el autocommit, de otro modo no tendrá sentido hacer una transacción, si cada instrucción autoexecuta un commit al finalizar.*/
SET autocommit = 0;
/*Definir que las transacciones siguientes sean Serializable, de forma global.*/
SET GLOBAL TRANSACTION ISOLATION LEVEL SERIALIZABLE;
/*Bloquea las tablas cliente y película (para lectura), y para escritura: factura, detallfactura y préstamo.*/
LOCK TABLES 
		cliente READ,
		pelicula READ,
		factura WRITE
/* Iniciar la transacción. */		
START TRANSACTION;
/*Crear las sentencias SQL que sea necesario para reflejar en la base de datos que la clienta María Catasús alquila la copia 1 de la película AAAAAAA y
por tanto, generar una factura número 5 donde se refleje el alquiler de la película por 4,5 euros, en la fecha actual del sistema.*/

INSERT	INTO 
	(
		
	)
VALUES 
(
	select(DNI from client where nom='María Catasús'),
	
)
select * from factura;