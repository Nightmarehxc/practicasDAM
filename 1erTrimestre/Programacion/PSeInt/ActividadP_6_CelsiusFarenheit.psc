Algoritmo CelsiusFarenheit
	
	Escribir "Introduzca temperatura y elija la escala a convertir (1) Celsius o (2) Farenheit"
	
	Leer temperatura
	Leer option 
	
	
	Segun option Hacer
		1:
			temperatura = (temperatura * 9/5)+32
			
			Escribir temperatura " Grados Farenheit"
			
		2:
			temperatura = 5/9 * (temperatura -32)
			
			Escribir temperatura " Grados Celsius"
	Fin Segun
	
FinAlgoritmo
