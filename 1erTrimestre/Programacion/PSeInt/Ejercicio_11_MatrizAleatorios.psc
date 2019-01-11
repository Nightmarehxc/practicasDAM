Algoritmo  Ejercicio_11_MatrizAleatorios	
	N <- 5
	contador = 0
	Dimension arreglo(N)
	Escribir "Introduzca un número que desee buscar en la matriz aleatoria"
	Leer a 
	
	Para i<-0 Hasta N-1 Con Paso 1 Hacer
		
		n = Aleatorio(1,100)
		arreglo(i) <- n
		
		si arreglo(i)=a
			contador = contador +1
		FinSi
		
		Escribir arreglo(i)
		
	Fin Para
	
	Escribir "El número " a " se encuentra " contador " veces."
	
FinAlgoritmo
