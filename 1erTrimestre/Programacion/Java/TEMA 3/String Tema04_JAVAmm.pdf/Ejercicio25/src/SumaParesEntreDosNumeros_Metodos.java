/*Programa que a través de tres métodos, devuelve la suma de los números pares que haya entre dos números
**introducidos por teclado.*/

import java.util.Scanner;

public class SumaParesEntreDosNumeros_Metodos {

    public static Scanner sc = new Scanner(System.in);

    //Método que devuelve el valor del primer número introducido por teclado
    public static int getPrimerNumero() {
        int numero;
        System.out.println("Introduzca el primer número");
        numero = sc.nextInt();
        return numero;
    }

    //Método que devuelve el valor del segundo número introducido por teclado, siempre y cuando sea mayor que el primero
    public static int getSegundoNumero(int primerNumero) {
        int numero;

        //El segundo número tiene que ser mayor que el primero
        do {
            System.out.println("Introduzca el segundo número");
            numero = sc.nextInt();
            if (numero < primerNumero) {
                System.out.println("El segundo número tiene que ser mayor que el primero. Introduzca de nuevo:");
                numero = sc.nextInt();
            }
        } while (numero < primerNumero);

        return numero;
    }

    //Método que devuelve la suma de los números pares comprendidos entre los dos dos números
    public static int getSumaPares(int primerNumero, int segundoNumero) {

        int i, suma = 0;

        for (i = primerNumero; i <= segundoNumero; i++) {

            if (i % 2 == 0) {
                suma = suma + i;
            }
        }
        return suma;
    }

    //Método principal
    public static void main(String[] args) {

        int primerNumero = getPrimerNumero();
        int segundoNumero = getSegundoNumero(primerNumero);
        int suma = getSumaPares(primerNumero, segundoNumero);

        System.out.println("La suma de los números pares comprendidos entre el "+primerNumero+" y el " +segundoNumero+ " (ambos incluidos) es: " + suma);

    }
}
