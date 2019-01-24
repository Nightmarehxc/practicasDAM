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
        //Apartado b. Pedimos que se introduzca el último número (100) y se lo añadimos al resultado
        System.out.println("Introduzca el último número (100 en este caso): ");
        numeroIntroducido = sc.nextInt();

        if ((numeroIntroducido % 2) == 0) {

            resultadoPar = resultadoPar + numeroIntroducido;

        } else {

            resultadoImpar = resultadoImpar + numeroIntroducido;

        }

        //Imprimimos resultado
        System.out.println("La suma de los 100 primeros números pares es: " + resultadoPar + "\nLa suma de los 100 primeros números impares es: " + resultadoImpar);
    }
}