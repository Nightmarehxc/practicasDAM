Algoritmo Ejercicio_9_MatrizPor2
	
	N <- 30	
	Dimension arreglo(N)
//	Dimension multip(N)
	
	media <- 0
	
	Para i<-0 Hasta N-1 Con Paso 1 Hacer
		
		leer n
		
		arreglo(i) <- n * 2
		
//		multip(i) <- 2 * arreglo(i)
		
	Fin Para
	
	Para i<-0 Hasta N-0 Con Paso 1 Hacer
		
		Escribir "La multiplicacion de los números introducidos por 2 es: " arreglo(i)
	FinPara
	
FinAlgoritmo
