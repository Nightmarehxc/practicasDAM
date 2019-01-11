Algoritmo FacturaAgua
	
	Escribir "Introduzca la cantidad de agua gastada en litros"
	leer cantidad
	precio = 0
	precioMinimo = 30
	
	Si cantidad<=50
		
		Escribir " Su factura es: " precioMinimo " euros"
		
	FinSi
	
	Si cantidad >50 & cantidad < 200
		
		precio = (cantidad - 50) * 2
		
		Si precio <= 30
			
			Escribir " Su factura es: " precioMinimo " euros"
			
		SiNo
			
			Escribir " Su factura es: " precio " euros"
			
		FinSi
		
		
	FinSi
	
	Si cantidad >200
		
		precio = (cantidad - 50) * 3
		
		Escribir " Su factura es: " precio " euros"
		
	FinSi
	
FinAlgoritmo
