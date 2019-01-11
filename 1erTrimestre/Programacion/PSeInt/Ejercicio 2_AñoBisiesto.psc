Algoritmo AñoBisiesto
	
	Escribir "Introduzca un año"
	
	Leer año
	
	Bisiesto=0
	
	Si año%4=0
		
		Bisiesto=1
		
		si año%100 = 0
			
			Bisiesto = 0
			
			si año%400 = 0
				Bisiesto = 1
				
			FinSi
			
		FinSi
		
	FinSi
	
	Si Bisiesto=1
		Escribir "Es bisiesto"
	SiNo
		Escribir "No es bisiesto"
	FinSi
	
	
	
FinAlgoritmo
