USE empresa;
/*
1.	Muestre los productos (código y descripción) que comercializa la empresa.
*/
SELECT `PROD_NUM`,`DESCRIPCIO` FROM producte;
/*
2.	Muestre los productos (código y descripción) que contienen la palabra tenis en la descripción.
*/
SELECT PROD_NUM,DESCRIPCIO FROM producte
WHERE DESCRIPCIO LIKE '%Tennis%'
LIMIT 1;
/*
3.	Muestre el código, nombre, área y teléfono de los clientes de la empresa.
*/
SELECT `CLIENT_COD`,`NOM`,`AREA`,`TELEFON` FROM `client`;
/*
4.	Muestre los clientes (código, nombre, ciudad) que no son del área telefónica 636.
*/
SELECT `CLIENT_COD`,`NOM`,`CIUTAT` FROM `client`
	WHERE `AREA` NOT LIKE '%635%'
	LIMIT 1;
SELECT `COM_NUM`,`COM_DATA`,`DATA_TRAMESA` FROM `comanda`;
