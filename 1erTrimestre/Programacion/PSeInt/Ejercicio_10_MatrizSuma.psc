Algoritmo  ejercicio_2_arreglos
	
	N <- 30
	contador = 0
	Dimension arreglo(N)
	suma = 0
	
	
	Para i<-0 Hasta N-1 Con Paso 1 Hacer
		
		Leer n
		
		arreglo(i) <- n
		
		suma = suma + arreglo(i)
		
		//escribir arreglo(i)
		
		si (arreglo(i))>10 
			contador = contador+1
		FinSi
		
	Fin Para
	
	escribir "La suma es " suma ". La cantidad de números mayores que 10 es: " contador
	
FinAlgoritmo
