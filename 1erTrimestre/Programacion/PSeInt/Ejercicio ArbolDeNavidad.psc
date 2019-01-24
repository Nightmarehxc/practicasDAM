Algoritmo Arbol_Navidad

Escribir "Ingrese cantidad de lineas"
Leer lineas

i <- 1;
j <- 1;

// calcular tamaño de línea final
lineafinal <- 2 * lineas - 1;


Para i <- 1 Hasta lineas Con Paso 1
	linea <- "" // linea a agregar
	// calcular espacios a los lados
	// La mitad de la resta entre el tamaño de línea final y el tamaño de línea actual
	espacios <- trunc((lineafinal - j) / 2) 
	
	// agregar espacio de la izquierda
	Para k <- 1 Hasta espacios Con Paso 1 Hacer
		linea <- linea + " "
	FinPara
	// agregar símbolos (tamaño de línea actual
	Para k <- 1 Hasta j Con Paso 1 Hacer
		linea <- linea + "*"
	FinPara
	// agregar espacio de la derecha
	Para k <- 1 Hasta espacios Con Paso 1 Hacer
		linea <- linea + " "
	FinPara
	
	// mostrar la linea resultante
	Escribir linea
	
	j <- j + 2
FinPara
FinAlgoritmo
