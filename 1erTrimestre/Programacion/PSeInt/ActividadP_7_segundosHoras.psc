Algoritmo horasegundos
	Escribir  "Introduce cuantos segundos quiers calcular"
	Leer  n
	hor = trunc (n / 3600)
	minutos =  trunc ((n - hor * 3600) / 60)
	secs = n - (hor * 3600 + minutos * 60) 
	escribir "horas" hor
	Escribir "minutos" minutos
	Escribir "segundos" secs
finAlgoritmo
