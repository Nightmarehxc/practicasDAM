/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "COUNTER.java."

import java.io.*;

public class counter {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double a;
		double alto;
		double b;
		double contador;
		double resultado;
		a = bufEntrada.readLine();
		b = bufEntrada.readLine();
		// PARA TENER EN CUENTA LA MULTIPLICACIÓN DE DOS NÚMEROS NEGATIVOS
		// a = abs(a)
		// b = abs(b)
		// SI UNO DE LOS NUMEROS QUE SE INGRESA ES 0 DEVUELVE RESULTADO 0
		if (a==0 || b==0) {
			System.out.println(resultado==0);
			// SINO, EFECTUAMOS LA SUMA DEL PRIMER NUMERO, TANTAS VECES COMO INDIQUE EL SEGUNDO
		} else {
			// COMPARAMOS LOS NÚMEROS PARA VER CUÁL ES EL MAYOR Y EFECTUAR LA SUMA TANTAS VECES COMO ESE NÚMERO INDIQUE
			if (a>b) {
				alto = a;
			} else {
				alto = b;
			}
			do {
				resultado = resultado+a;
				contador = contador+1;
				// escribir contador DESCOMENTAR PARA DEBUG
				// escribir resultado DESCOMENTAR PARA DEBUG
			} while (contador!=alto);
		}
		System.out.println(resultado);
	}


}

