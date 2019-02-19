
insert into prestamo values
(select codpeli from pelicula where titulo='';

use videoclub;
/*1*/

set autocommit=0;

/*2*/
set global transaction Isolation LEVEL Serializable;
/*3*/

LOCK TABLES  CLIENT  read, PELICULA read, FACTURA read, DETALLFACTURA write, PRESTEC write;

/*4*/

begin;

/*5*/

INSERT INTO PRESTEC values ( select CodPeli from PELICULA where Titol="AAAAAAA")
Sysdate();
(select dni from cliente where nombre like "Maria Catasús");

insert into factura values(5,Sysdate(),4.5,Select dni from cliente where nombre like"Maria Catasús");

insert into detallefactura values(5,1,"alquiler de peli",4.5,1);

