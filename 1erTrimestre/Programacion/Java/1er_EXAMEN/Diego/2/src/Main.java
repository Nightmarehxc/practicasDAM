/*Autor: Corral González, Diego*/

import java.util.Scanner;

public class Main {

    //Variable donde alamacenaremos el valor que nos devuelva el método getAleatorio
    static int aleatorio;

    //Creamos un método para generar los números aleatorios
    public static int getAleatorio(){
        aleatorio = (int) Math.floor(Math.random() * 100 + 1);
        return aleatorio;
    }

    public static void main(String[] args) {

        //Declaramos variables
        int numeroIntroducido, c = 1;
        Scanner sc = new Scanner(System.in);

        //Creamos el número aleatorio
        aleatorio = getAleatorio();

        //Datos de entrada
        System.out.println("Introduzca un número: ");
        numeroIntroducido = sc.nextInt();

        //Bucle que al menos se realiza una vez, y hasta que se acierte el número.
        do {
            //Informamos si es menor o mayor al número que hay que adivinar e incrementamos el contador de intentos
            if (numeroIntroducido < aleatorio) {
                System.out.println("El número introducido es menor que el que quiere adivinar. Inserte de nuevo: ");
                numeroIntroducido = sc.nextInt();
                c++;
            } else {
                System.out.println("El número introducido es mayor que el que quiere adivinar. Inserte de nuevo: ");
                numeroIntroducido = sc.nextInt();
                c++;
            }
        }while (numeroIntroducido!=aleatorio);

        //Imprimimos resultado
        System.out.println("Enhorabuena, acertaste!\nEl número de intentos fue: " +c+ "\nEl número era: " +aleatorio);
    }
}
