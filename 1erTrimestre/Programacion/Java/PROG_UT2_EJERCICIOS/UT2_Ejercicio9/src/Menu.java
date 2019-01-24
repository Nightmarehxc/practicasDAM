import java.util.Scanner;

public class Menu {

    public static int factorial = 1;
    public static Scanner sc = new Scanner(System.in);

    //Función principal donde almacenamos el menú con sus distintas opciones. Se repetirá hasta que se pulse la opción de salir.
    public static void main(String[] args) {

        int menuS;
        do {
            System.out.println("\nPulse su opción deseada: \n1) Factorial de un número\n2) Tabla de multiplicar de un número\n3) Suma de los divisores de un número\n4) Salir");
            menuS = sc.nextInt();


            switch (menuS) {
                case 1:
                    Factorial();
                    break;
                case 2:
                    Calculadora();
                    break;
                case 3:
                    Divisores();
                    break;
                case 4:
                    System.out.println("Gracias por utilizar nuestro programa");
                    break;
            }

        } while (menuS != 4);
    }

    //Método que devuelve un entero, el factorial del número introducido
    public static int Factorial() {
        System.out.println("Introduzca un número");
        int numero = sc.nextInt();
        while (numero != 0) {
            factorial = factorial * numero;
            numero--;
        }
        System.out.println(factorial);
        return (factorial);
    }

    //Método vacío que muestra la tabla de multiplicar de un número introducido
    public static void Calculadora() {

        int a, b;
        System.out.println("Introduzca un número");
        a = sc.nextInt();
        System.out.println("La tabla del " + a + " es");
        for (int i = 0; i < 10; i++) {
            b = a * i;
            System.out.println(i + "X" + a + "=" + b);
        }
    }

    //Método vacío que muestra los divisores de un número introducido y la suma de ellos
    public static void Divisores() {
        int numero, suma = 0;
        System.out.println("Introduzca un número");

        numero = sc.nextInt();

        System.out.println("Sus divisores son: ");
        for (int i = 1; i <= numero; i++)
            if (numero % i == 0) {
                System.out.println(i);
                suma = suma + i;
            }

        System.out.println("La suma de los divisores es: " + suma);
    }
}
