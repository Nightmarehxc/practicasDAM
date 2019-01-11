/*Autor: Corral González, Diego*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Declaración e inicialización de variables
        int i, resultadoPar = 0, resultadoImpar = 0, numeroIntroducido;
        Scanner sc = new Scanner(System.in);

        //Bucle iterativo para recorrer todos los números de los que queremos comprobar su paridad
        for (i = 1; i < 100; i++) {

            //Comprobamos si es par o impar y lo sumamos, almacenando el resultado en su respectiva variables
            if ((i % 2) == 0) {

                resultadoPar = resultadoPar + i;
            } else {

                resultadoImpar = resultadoImpar + i;

            }
        }

        /*Apartado c: que el número sea mayor que 100. Bucle que al menos realizamos una vez, y hasta que el número sea
        * mayor que 100*/
        do {
            System.out.println("Introduzca un número mayor que 100 ");
            numeroIntroducido = sc.nextInt();
        } while (numeroIntroducido <= 100);

        if ((numeroIntroducido % 2) == 0) {

            resultadoPar = resultadoPar + numeroIntroducido;

        } else {

            resultadoImpar = resultadoImpar + numeroIntroducido;

        }

        //Imprimimos resultado
        System.out.println("La suma de los 100 primeros números pares es: " + resultadoPar + "\nLa suma de los 100 primeros números impares es: " + resultadoImpar);

    }
}