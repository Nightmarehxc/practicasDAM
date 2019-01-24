import java.util.Scanner;

public class Factorial
{
    public static void main(String[] args) {

        //Declaración de variables
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        int factorial = 1;

        System.out.println("Introduzca un número");

        while ( numero!=1) {
            factorial=factorial*numero;
            numero--;

        }
        System.out.println(factorial);
    }


}