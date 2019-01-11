Algoritmo COUNTER
	Leer a
	leer b
	
	//PARA TENER EN CUENTA LA MULTIPLICACIÓN DE DOS NÚMEROS NEGATIVOS
	//	a = abs(a)
	//	b = abs(b)
	
	
	//SI UNO DE LOS NUMEROS QUE SE INGRESA ES 0 DEVUELVE RESULTADO 0
	si a=0 | b=0
		
		Escribir  resultado = 0
		
	SiNo //SINO, EFECTUAMOS LA SUMA DEL PRIMER NUMERO, TANTAS VECES COMO INDIQUE EL SEGUNDO
		
		//COMPARAMOS LOS NÚMEROS PARA VER CUÁL ES EL MAYOR Y EFECTUAR LA SUMA TANTAS VECES COMO ESE NÚMERO INDIQUE
		SI a>b
			alto=a
		SiNo
			alto=b
		FinSi
		
		repetir
			
			resultado = resultado + a
			contador = contador +1
//			escribir contador DESCOMENTAR PARA DEBUG
//			escribir resultado DESCOMENTAR PARA DEBUG
		hasta que contador = alto
		
		
	FinSi
	
	
	escribir resultado
fin Algoritmo