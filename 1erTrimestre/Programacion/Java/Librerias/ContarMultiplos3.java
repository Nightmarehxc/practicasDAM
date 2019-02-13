import java.util.Scanner;

public class ContarMultiplos3 {

    public static void main(String[] args) {

        //Declaración de variables
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un número");
        int c = 0;
        int numero = sc.nextInt();

        //Condición número tienes que ser distinto de 0
        while (numero <= 0) {
            System.out.println("Introduce otro número positivo");
            numero = sc.nextInt();
        }

        /*Bucle iterativo que realiza la división entera desde el número 1 hasta el número introducido por el usuario, entre 3.
        La variable c almacena el total de números múltiplos de 3 que se muestran.*/

        System.out.println("Los múltiplos de 3 desde el 1 hasta el " + numero + " son:");

        for (int i = 1; i <= numero; i++) {
            if (i % 3 == 0) {
                System.out.println(i); // Imprimimos resultados de números múltiplos de 3
                c++;
            }
        }

        //Imprimimos resultado de la variable c
        System.out.println("\n////////////////////////////////////////");
        System.out.println("El total de números mostrados es: " + c);
        System.out.println("///////////////////////////////////////");

    }
}
