USE sanitat;

/*
	1. Muestre los hospitales existentes (número, nombre y teléfono).
*/
SELECT ` HOSPITAL_COD `,` NOM `,` TELEFON ` FROM ` hospital `; 
/*
2. Muestre los hospitales existentes (número, nombre y teléfono) que tengan una letra A en la segunda posición del nombre.
*/
SELECT HOSPITAL_COD,TELEFON,nom AS str FROM hospital
WHERE SUBSTR(NOM, 2,1) = 'a';
/*
3
. Muestre los trabajadores (código hospital, código sala, número empleado y apellido) existentes.
*/
SELECT `HOSPITAL_COD`,`SALA_COD`,`EMPLEAT_NO`,`COGNOM` FROM PLANTILLA;
/*
4. Muestre los trabajadores (código hospital, código sala,
 número empleado y apellido) que no sean del turno de noche.
*/
SELECT `HOSPITAL_COD`,`SALA_COD`,`EMPLEAT_NO`,`COGNOM`,TORN FROM `plantilla`
WHERE torn = "N";
	