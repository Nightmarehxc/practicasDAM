Algoritmo nubes
	
	// Enunciado: en una nube de puntos calcula la distancia mas pequeña entre dos de ellos, o los dos puntos que están más próximos entre sí.
	/*
	leer x1
	leer y1
	leer z1
	
	leer x2
	leer y2
	leer z2

	
	Rx= (x2-x1)
	Ry = (y2-y1)
	Rz = (z2-z1)
	
	Rxy = (y2-x1)
	Rxz = (z2-x1)
	Ryz = (z2-y1)
	
	Si (Rx > Ry)
		
		Si (Rx>Rz)
			
			Si (Rx>Rxy)
				
				Si (Rx>Rxz)
					
					Si (Rx>Ryz)
						
						Escribir ('La distancia mas corta es entre x2 y x1: ') Rx
						
					FinSi
					
				FinSi
				
			FinSi
		FinSi
		
	FinSi*/
	
	
	PuntoSiguiente = 0
	
	Leer PuntoActual
	
	Mientras Contador <= NumeroDePuntos
		
		MasCorta = PuntoSiguiente - PuntoActual
		
		Si MasCortaAhora < MasCorta
			
			MasCorta = MarCortaAhora
			
		FinSi
		
		PuntoActual = PuntoActual + PuntoSiguiente
		
		Leer PuntoActual
		
		Contador = Contador + 1
		
	FinMientras
	
	
FinAlgoritmo
