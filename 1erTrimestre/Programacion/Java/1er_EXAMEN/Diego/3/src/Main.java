/*Autor: Corral González, Diego*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Declaración de variables
        int primerNumero, segundoNumero, opcion;
        Scanner sc = new Scanner(System.in);

        //Datos de entrada
        System.out.println("Introduzca un número: ");
        primerNumero = sc.nextInt();

        System.out.println("\nIntroduzca otro número: ");
        segundoNumero = sc.nextInt();

        //Bucle para no salir del programa hasta que lo desee el usuario pulsando la opción 5
        do {
            System.out.println("\nSeleccione una opción: \n1.- Sumar los números.\n2.- Restar los números.\n3.- Multiplicar los números.\n4.- Dividir los números.\n5.- Salir del programa.");
            opcion = sc.nextInt();

            /*Seleccionamos opciones. También podemos escribir un método por cada CASE y llamarlas en el main a través del switch.
            **También podemos pedir números distintos cada vez que se ejecute el programa. Es necesario especificarlo en el enunciado*/

            switch (opcion) {
                case 1:
                    int suma = primerNumero + segundoNumero; //Operación suma. Una operación en cada case.
                    System.out.println("\nLa suma es: " + suma); // Imprimimos resultado
                    break; //Rompemos bucle switch
                case 2:
                    int resta = primerNumero - segundoNumero;
                    System.out.println("\nLa resta es: " + resta);
                    break;
                case 3:
                    int multiplicacion = primerNumero * segundoNumero;
                    System.out.println("\nLa multiplicación es: " + multiplicacion);
                    break;
                case 4:
                    int division = primerNumero / segundoNumero;
                    System.out.println("\nLa división es: " + division);
                    break;
                case 5:
                    System.out.println("\nGracias por utilizar mi programa, ponme una buena reseña/nota!");
                    break;
            }
        } while (opcion != 5);
    }
}
