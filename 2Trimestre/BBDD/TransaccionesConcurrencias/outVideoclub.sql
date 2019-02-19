mysql> use videoclub;
Database changed
mysql> /*1*/
mysql> 
mysql> set autocommit=0;
Query OK, 0 rows affected (0.00 sec)

mysql> 
mysql> /*2*/
mysql> set global transaction Isolation LEVEL Serializable;
Query OK, 0 rows affected (0.00 sec)

mysql> /*3*/
mysql> 
mysql> LOCK TABLES  CLIENT  read, PELICULA read, FACTURA read, DETALLFACTURA write, PRESTEC write;
Query OK, 0 rows affected (0.03 sec)

mysql> 
mysql> /*4*/
mysql> 
mysql> begin;
Query OK, 0 rows affected (0.00 sec)

mysql> 
mysql> /*5*/
mysql> 
mysql> INSERT INTO PRESTEC values ((select CodiPeli from PELICULA where Titol="AAAAAAA"), '1', Sysdate(), (select DNI from CLIENT where Nom like 'María Catasús'));
Query OK, 1 row affected, 1 warning (0.05 sec)


mysql> (select DNI from CLIENT where Nom like "Maria%");
+------------+
| DNI        |
+------------+
| 022222222R |
+------------+
1 row in set (0.00 sec)

mysql> insert into FACTURA values(5,Sysdate(),4.5,(Select DNI from CLIENT where Nom like"Maria%"));
Query OK, 1 row affected, 1 warning (0.18 sec)

mysql> 
mysql> insert into DETALLFACTURAS values(5,1,"alquiler de peli",4.5,1);
ERROR 1146 (42S02): Table 'videoclub.DETALLFACTURAS' doesn't exist
mysql> 
mysql> /*6*/
mysql> commit;
Query OK, 0 rows affected (0.00 sec)

mysql> /*7*/
mysql> unlock tables;
Query OK, 0 rows affected (0.00 sec)

