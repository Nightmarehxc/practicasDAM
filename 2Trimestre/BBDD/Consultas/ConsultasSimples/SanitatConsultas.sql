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
. Muestre los trabajadores (código hospital, código sala, número empleado y apellido) existentes.
*/