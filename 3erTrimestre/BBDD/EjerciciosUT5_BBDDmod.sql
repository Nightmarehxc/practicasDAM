use jardineria;
/*Ejercicios UT5*/

/*PROCEDIMIENTOS*/

/*1.Escribe un procedimiento que reciba el nombre de un país como parámetro de entrada y realice una consulta sobre la tabla cliente para obtener todos los clientes que existen en la tabla de ese país.*/--ok

DELIMITER $$
DROP PROCEDURE IF EXISTS clientes_del_pais$$
CREATE PROCEDURE clientes_del_pais(IN pais VARCHAR(120))
BEGIN
SELECT * FROM Clientes WHERE Clientes.Pais=pais;
END $$
DELIMITER ;
/* Funciona */

/*2.Escribe un procedimiento que reciba como parámetro de entrada una forma de pago, que será una cadena de caracteres (Ejemplo: PayPal, Transferencia, etc). Y devuelva como salida el pago de máximo valor realizado para esa forma de pago. Deberá hacer uso de la tabla pago de la base de datos jardineria.*/

DELIMITER $$
DROP PROCEDURE IF EXISTS max_pago;
CREATE PROCEDURE max_pago(IN forma_pago VARCHAR(50), OUT 
maximo FLOAT)
BEGIN
SET maximo = (
SELECT MAX(cantidad)
FROM Pagos
WHERE Pagos.FormaPago  = forma_pago);
END
$$
DELIMITER ;
CALL max_pago("PayPal",@maximo);
SELECT @maximo;
/* Funciona */

/*3.Escribe un procedimiento que reciba como parámetro de entrada una forma de pago, que será una cadena de caracteres (Ejemplo: PayPal, Transferencia, etc). Y devuelva como salida los siguientes valores teniendo en cuenta la forma de pago seleccionada como parámetro de entrada: • el pago de máximo valor, • el pago de mínimo valor, • el valor medio de los pagos realizados, • la suma de todos los pagos, • el número de pagos realizados para esa forma de pago. Deberá hacer uso de la tabla pago de la base de datos jardineria.*/

 DELIMITER $$
DROP PROCEDURE IF EXISTS pago;
CREATE PROCEDURE pago(IN forma_pago VARCHAR(50), OUT 
maximo FLOAT, OUT minimo FLOAT, OUT media FLOAT, OUT suma FLOAT, OUT numero_pagos FLOAT)
BEGIN
SET maximo = (SELECT MAX(Cantidad) FROM Pagos WHERE Pagos.FormaPago = forma_pago);
SET minimo = (SELECT MIN(Cantidad) FROM Pagos WHERE Pagos.FormaPago = forma_pago);
SET media = (SELECT AVG(Cantidad) FROM Pagos WHERE Pagos.FormaPago = forma_pago);
SET suma = (SELECT SUM(Cantidad) FROM Pagos WHERE Pagos.FormaPago = forma_pago);
SET numero_pagos = (SELECT COUNT(Cantidad) FROM Pagos WHERE Pagos.FormaPago = forma_pago);
END
$$
DELIMITER ;
CALL pago('Paypal', @maximo, @minimo, @media, @suma, @numero_pagos);
SELECT @maximo, @minimo, @media, @suma, @numero_pagos; 
/* Funciona */

/*FUNCIONES*/

/*4.Escribe una función para la base de datos jardineria que devuelva el número total de productos que hay en la tabla producto.*/

DELIMITER $$
DROP FUNCTION IF EXISTS numero_productos;
CREATE FUNCTION numero_productos()
RETURNS INT
BEGIN
DECLARE total_productos INT;
SET total_productos = (SELECT COUNT(*) FROM Productos);
RETURN total_productos;
END $$
DELIMITER ;
SELECT numero_productos();
/* Funciona */

/*5.Escribe una función para la base de datos jardinería que devuelva el valor medio del precio de los productos de un determinado fabricante que se recibirá como parámetro de entrada. El parámetro de entrada será el nombre del fabricante.*/--ok

DELIMITER $$ 
DROP FUNCTION IF EXISTS calcular_precio_medio$$
CREATE FUNCTION calcular_precio_medio(nombre_fabricante VARCHAR(50))
RETURNS FLOAT 
BEGIN
DECLARE media FLOAT;
SET media = (SELECT AVG(precioProveedor)
FROM Productos
WHERE proveedor = nombre_fabricante);
RETURN media;
END
$$
DELIMITER ;
select  calcular_precio_medio("Viveros EL OASIS");
/* Funciona */

/*MANEJO DE ERRORES*/

/*6. Crea una base de datos llamada test que contenga una tabla llamada alumno. La tabla debe tener cuatro columnas:
• id: entero sin signo (clave primaria).
• nombre: cadena de 50 caracteres.
• apellido1: cadena de 50 caracteres.
• apellido2: cadena de 50 caracteres.
Una vez creada la base de datos y la tabla deberá crear un procedimiento llamado insertar_alumno
 con las siguientes características.
  El procedimiento recibe cuatro parámetros de entrada 
  (id, nombre, apellido1, apellido2) y los insertará en la tabla alumno.
 El procedimiento devolverá como salida un parámetro llamado error que tendrá un valor igual a 0
 si la operación se ha podido realizar con éxito y un valor igual a 1 en caso contrario.
Deberá manejar los errores que puedan ocurrir cuando se intenta insertar una fila que contiene una clave primaria repetida.*/


DROP DATABASE if EXISTS test;
CREATE DATABASE test;
use test;


CREATE TABLE alumno(
    id INT UNSIGNED PRIMARY KEY,
    nombre VARCHAR(50),
    apellido1 VARCHAR(50),
    apellido2 VARCHAR(50)
);
DELIMITER $$
DROP PROCEDURE IF EXISTS insertar_alumno$$
    CREATE PROCEDURE insertar_alumno(IN id INT UNSIGNED,in nombre VARCHAR(50),IN apellido1 VARCHAR(50),IN apellido2 VARCHAR(50),OUT error TINYINT UNSIGNED)
    BEGIN
        DECLARE CONTINUE HANDLER FOR 1062
            BEGIN
            set error = 1;
            END;
        set error = 0;
        INSERT INTO alumno VALUES (id,nombre,apellido1,apellido2);
    END
    $$
 DELIMITER ;
 CALL insertar_alumno(1,'pepe','torero','torero',@error);
 CALL insertar_alumno(2,'Rodion','Romanovich','Raskolnikov',@error);
SELECT @error;
select * FROM alumno;

/*TRANSACCIONES CON PROCEDIMIENTOS ALMACENADOS.*/

/*7. Crea una base de datos llamada cine que contenga dos tablas con las siguientes columnas.
Tabla cuentas:
• id_cuenta: entero sin signo (clave primaria).
• saldo: real sin signo.
Tabla entradas:
• id_butaca: entero sin signo (clave primaria).
• nif: cadena de 9 caracteres.
Una vez creada la base de datos y las tablas deberá crear un procedimiento llamado comprar_entrada con las siguientes características. El procedimiento recibe 3 parámetros de entrada (nif, id_cuenta, id_butaca) y devolverá como salida un parámetro llamado error que tendrá un valor igual a 0 si la compra de la entrada se ha podido realizar con éxito y un valor igual a 1 en caso contrario.
El procedimiento de compra realiza los siguientes pasos:
• Inicia una transacción.
• Actualiza la columna saldo de la tabla cuentas cobrando 5 euros a la cuenta con el id_cuenta adecuado.
• Inserta una una fila en la tabla entradas indicando la butaca (id_butaca) que acaba de comprar el usuario (nif).
• Comprueba si ha ocurrido algún error en las operaciones anteriores. Si no ocurre ningún error entonces aplica un COMMIT a la transacción y si ha ocurrido algún error aplica un ROLLBACK.
Deberá manejar los siguientes errores que puedan ocurrir durante el proceso.
• ERROR 1264 (Out of range value)
• ERROR 1062 (Duplicate entry for PRIMARY KEY)*/


DROP DATABASE IF EXISTS cine;
CREATE DATABASE cine;
USE cine;

CREATE TABLE cuentas(
id_cuenta INTEGER UNSIGNED PRIMARY KEY,
saldo DECIMAL(11,2) UNSIGNED CHECK (saldo >= 0)
);
CREATE TABLE entradas(
id_butaca INTEGER UNSIGNED PRIMARY KEY,
nif VARCHAR(9)
);

INSERT INTO cuentas VALUES(1,20);
INSERT INTO cuentas VALUES(2,10);


DELIMITER $$
DROP PROCEDURE IF EXISTS comprar_entrada;
CREATE PROCEDURE comprar_entrada(IN nif VARCHAR(9), IN id_cuenta INT UNSIGNED, IN id_butaca INT UNSIGNED,OUT error TINYINT UNSIGNED)
BEGIN
    DECLARE CONTINUE HANDLER FOR 1264,1062
    BEGIN 
    SET error = 1;
    END;

START TRANSACTION;
SET error = 0;
UPDATE cuentas SET saldo = saldo -5
WHERE cuentas.id_cuenta = id_cuenta;

INSERT INTO entradas VALUES (id_butaca, nif);

if error = 0 THEN
COMMIT;
ELSE
ROLLBACK;
END IF;
END$$
DELIMITER ;
CALL comprar_entrada('12345678A', 1, 10, @error);
CALL comprar_entrada('19876543B', 1, 11, @error);
CALL comprar_entrada('13456789C', 1, 12, @error);
CALL comprar_entrada('18765432D', 1, 13, @error);
CALL comprar_entrada('17654321E', 1, 14, @error);

/*CURSORES*/

/*8.Escribe las sentencias SQL necesarias para crear una base de datos llamada test, una tabla llamada alumnos y 4 sentencias de inserción para inicializar la tabla.
 La tabla alumnos está formada por las siguientes columnas:
• id (entero sin signo y clave primaria)
• nombre (cadena de caracteres)
• apellido1 (cadena de caracteres)
• apellido2 (cadena de caracteres
• fecha_nacimiento (fecha)
Una vez creada la tabla se decide añadir una nueva columna a la tabla llamada edad que será un valor calculado a partir de la columna fecha_nacimiento. Escriba la sentencia SQL necesaria para modificarla tabla y añadir la nueva columna.
na vez creada la tabla se decide añadir una nueva columna a la tabla llamada edad que será un valor calculado a partir de la columna fecha_nacimiento. Escriba la sentencia SQL necesaria para modificarla tabla y añadir la nueva columna.
Escriba una función llamada calcular_edad que reciba una fecha y devuelva el número de años que han pasado desde la fecha actual hasta la fecha pasada como parámetro:
• Función: calcular_edad
• Entrada: Fecha
• Salida: Número de años (entero)
Ahora escriba un procedimiento que permita calcular la edad de todos los alumnmos que ya existen en la tabla.
Para esto será necesario crear un procedimiento llamado actualizar_columna_edad que calcule la edad de cada alumno y actualice la tabla. Este procedimiento hará uso de la función calcular_edad que hemos creado en el paso anterior.*/

DROP DATABASE IF EXISTS test;
CREATE DATABASE test;
USE test;

CREATE TABLE alumnos(
id INT UNSIGNED PRIMARY KEY NOT NULL,
nombre VARCHAR(50) NOT NULL,
apellido1 VARCHAR(50) NOT NULL,
apellido2 VARCHAR(50)NOT NULL,
fecha_nacimiento DATE NOT NULL);

INSERT INTO alumnos VALUES(1,'Pepe','Torero','','2000-02-01');
INSERT INTO alumnos VALUES(2,'Lucrecia','Perez','Matos','1959-12-15');
INSERT INTO alumnos VALUES(3,'Karen','Silkwood','1946','1946-02-19');
ALTER TABLE alumnos ADD edad INT UNSIGNED;

DELIMITER $$
DROP FUNCTION IF EXISTS calcular_edad$$
CREATE FUNCTION calcular_edad(fecha DATE)
RETURNS INT
BEGIN
DECLARE edad INT;
SET edad = TRUNCATE(DATEDIFF(NOW(),fecha)/365, 0);
RETURN edad;
end$$

DROP PROCEDURE IF EXISTS actualizar_columna_edad$$
CREATE PROCEDURE actualizar_columna_edad()
BEGIN
DECLARE fecha_nacimiento DATE;
DECLARE edad INT;
DECLARE id INT;
DECLARE fin INT DEFAULT 0;
DECLARE cursor_alumnos CURSOR FOR
 SELECT alumnos.id,alumnos.fecha_nacimiento FROM alumnos;
DECLARE CONTINUE HANDLER FOR NOT FOUND SET fin= 1; 
OPEN cursor_alumnos;
bucle:LOOP
FETCH
cursor_alumnos
INTO id,fecha_nacimiento;
IF fin = 1 
        THEN LEAVE bucle;
    END IF;
    SET edad = calcular_edad(fecha_nacimiento);
    UPDATE alumnos SET alumnos.edad=edad WHERE alumnos.id=id;
END LOOP;
CLOSE cursor_alumnos;
END$$
DELIMITER ;
CALL actualizar_columna_edad();
SELECT * FROM alumnos;

/*9. Modifica la tabla alumnos del ejercicio anterior para añadir una nueva columna email. Una vez que hemos modificado la tabla necesitamos asignarle una dirección de correo electrónico de forma automática.
Escriba un procedimiento llamado crear_email que dados los parámetros de entrada: nombre, apellido1, apellido2 y dominio, cree una dirección de email y la devuelva como salida.
• Procedimiento: crear_email
• Entrada:
– nombre (cadena de caracteres)
– apellido1 (cadena de caracteres)
– apellido2 (cadena de caracteres)
– dominio (cadena de caracteres)
• Salida:
– email (cadena de caracteres)
devuelva una dirección de correo electrónico con el siguiente formato:
• El primer carácter del parámetro nombre.
• Los tres primeros caracteres del parámetro apellido1.
• Los tres primeros caracteres del parámetro apellido2.
• El carácter @.
• El dominio pasado como parámetro.
Ahora escriba un procedimiento que permita crear un email para todos los alumnmos que ya existen en la tabla.
Para esto será necesario crear un procedimiento llamado actualizar_columna_email que actualice la columna email de la tabla alumnos. Este procedimiento hará uso del procedimiento crear_email que hemos creado en el paso anterior.*/

DROP DATABASE IF EXISTS test;
CREATE DATABASE test;
USE test;

CREATE TABLE alumnos(
id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
nombre VARCHAR(50) NOT NULL,
apellido1 VARCHAR(50) NOT NULL,
apellido2 VARCHAR(50),
fecha_nacimiento DATE NOT NULL
);

INSERT INTO alumnos VALUES(1, 'José','López', 'Martínez','2000-02-01');
INSERT INTO alumnos VALUES(2, 'María','Sánchez', 'Pérez','1997-02-03');
INSERT INTO alumnos VALUES(3, 'Antonio','López', 'García','1998-07-15');
INSERT INTO alumnos VALUES(4, 'Alberto','Benítez', 'Sanz','1999-08-27');

ALTER TABLE alumnos ADD email VARCHAR(150);

DELIMITER $$
DROP PROCEDURE IF EXISTS crear_email;
CREATE PROCEDURE crear_email(IN nombre VARCHAR(50),
IN apellido1 VARCHAR(50),
IN apellido2 VARCHAR(50),
IN dominio VARCHAR(50),
OUT email VARCHAR(150))
BEGIN
SET email = CONCAT(SUBSTR(nombre,1,1),
SUBSTR(apellido1,1,3),
SUBSTR(apellido2,1,3),
'@', dominio);
SET email = LOWER(email);
END$$

DROP PROCEDURE IF EXISTS actualizar_columna_email;
CREATE PROCEDURE actualizar_columna_email(IN dominio VARCHAR(50))
BEGIN
DECLARE termina INT DEFAULT 0;
DECLARE id INT UNSIGNED;
DECLARE nombre, apellido1, apellido2 VARCHAR(50);
DECLARE email VARCHAR(150);
DECLARE cursor_alumnos CURSOR FOR
SELECT alumnos.id, alumnos.nombre, alumnos.apellido1, alumnos.apellido2
FROM alumnos;
DECLARE CONTINUE HANDLER FOR NOT FOUND SET termina= 1;
OPEN cursor_alumnos;
bucle: LOOP
FETCH cursor_alumnos INTO id, nombre, apellido1, apellido2;
IF termina = 1 THEN
LEAVE bucle;
END IF;
CALL crear_email(nombre, apellido1, apellido2, dominio, @email);
UPDATE alumnos SET alumnos.email = @email WHERE alumnos.id = id;
END LOOP;
CLOSE cursor_alumnos;
END$$
DELIMITER ;
CALL actualizar_columna_email('ieslago.org');
SELECT * FROM alumnos;

/*TRIGGERS*/

/*10. Crea una base de datos llamada test que contenga una tabla llamada alumnos con las siguientes columnas.
Tabla alumnos:
• id (entero sin signo)
• nombre (cadena de caracteres)
• apellido1 (cadena de caracteres)
• apellido2 (cadena de caracteres)
• nota (número real)
Una vez creada la tabla, escriba dos triggers con las siguientes características:
• Trigger 1: trigger_check_nota_before_insert
– Se ejecuta sobre la tabla alumnos.
– Se ejecuta antes de una operación de inserción.
– Si el nuevo valor de la nota que se quiere insertar es negativo, se guarda como 0.
– Si el nuevo valor de la nota que se quiere insertar es mayor que 10, se guarda como 10.
• Trigger2 : trigger_check_nota_before_update
– Se ejecuta sobre la tabla alumnos.
– Se ejecuta antes de una operación de actualización.
– Si el nuevo valor de la nota que se quiere actualizar es negativo, se guarda como 0.
– Si el nuevo valor de la nota que se quiere actualizar es mayor que 10, se guarda como 10.
Una vez creados los triggers escriba varias sentencias de inserción y actualización sobre la tabla alumnos y verifica que los triggers se están ejecutando correctamente.*/

DROP DATABASE IF EXISTS test;
CREATE DATABASE test;
USE test;

CREATE TABLE alumnos(
id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
nombre VARCHAR(50) NOT NULL,
apellido1 VARCHAR(50) NOT NULL,
apellido2 VARCHAR(50),
nota FLOAT
);
---!!!
DELIMITER $$
DROP TRIGGER IF EXISTS trigger_check_nota_before_insert;
CREATE TRIGGER trigger_check_nota_before_insert
BEFORE INSERT
ON alumnos FOR EACH ROW
BEGIN
IF NEW.nota < 0 THEN
SET NEW.nota = 0;
ELSEIF NEW.nota > 10 THEN
SET NEW.nota = 10;
END IF;
END$$ 
---!!!
DELIMITER $$
DROP TRIGGER IF EXISTS trigger_check_nota_before_update;
CREATE TRIGGER trigger_check_nota_before_update
BEFORE UPDATE
ON alumnos FOR EACH ROW
BEGIN
IF NEW.nota < 0 THEN
SET NEW.nota = 0;
ELSEIF NEW.nota > 10 THEN
SET NEW.nota = 10;
END IF;
END$$
---!!!
DELIMITER ;
INSERT INTO alumnos VALUES(1, 'José','López', 'Martínez',13);
INSERT INTO alumnos VALUES(2, 'María','Sánchez', 'Pérez',-3);
INSERT INTO alumnos VALUES(3, 'Antonio','López', 'García',9);
INSERT INTO alumnos VALUES(4, 'Alberto','Benítez', 'Sanz',6);

SELECT * FROM alumnos;

UPDATE alumnos SET nota = -6 WHERE id = 2;
UPDATE alumnos SET nota = 15 WHERE id = 3;
