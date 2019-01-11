Algoritmo MayorDeTres
	Leer a
	Leer b
	Leer c
	alto = 0
	
	Si (a>b)&(a>c)
		alto = a
	SiNo
		si (b>a)&(b>c)
			alto = b
		SiNo
			alto = c
		FinSi
		
	FinSi
	
	Si((a+b)=c)|(a+c=b)|(b+c=a)
		
		Escribir 'Si'
		
	SiNo 
		Escribir 'No'
		
	FinSi
	
	
	Escribir 'El número más alto es ' alto
	
	
	
FinAlgoritmo
