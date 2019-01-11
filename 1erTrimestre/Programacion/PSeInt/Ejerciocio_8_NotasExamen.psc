Algoritmo NotasExamen
	
	suma =  0 
	c = 0
	resultado = 0
	
	escribir ('Introduzca notas positivas. Nota negativa para mostrar resultados')
	leer nota
	
	notaAnterior = nota
	alta = nota
	baja = nota
	
	Mientras nota >=0 
		suma = suma + nota
		c = c+1
		
		si nota > notaAnterior
			alta = nota
		FinSi
		
		si nota<notaAnterior
			baja = nota
		FinSi
		
		notaAnterior = nota
		leer nota
	Fin Mientras
	
	media = suma / c
	
	Escribir " La media es: " media ". La nota mas alta es: " alta ". La nota mas baja es: " baja ". El número total de notas es: " c
	
FinAlgoritmo
