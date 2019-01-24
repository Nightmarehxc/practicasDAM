//Corral González, Diego


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Declaración de variables
        int opcion;
        double a=0, b=0;
        Scanner sc = new Scanner(System.in);

        //Datos de entrada y menú que se ejecutará hasta que el usuario pulse el 6
        do {
            System.out.println("\nElija opción:\n1.- Sumar los números\n2.- Restar los números\n3.- Multiplicar los números\n4.- Potencia de un número\n5.- Dividir los números\n6.- Salir");
            opcion = sc.nextInt();

            if(opcion!=6) {
                System.out.println("Introduzca un número:");
                a = sc.nextDouble();
                System.out.println("Introduzca otro:");
                b = sc.nextDouble();
            }

            switch (opcion) {
                case 1:suma(a, b);
                    break;
                case 2:resta(a, b);
                    break;
                case 3:producto(a, b);
                    break;
                case 4:potencia(a, b);
                    break;
                case 5:division(a, b);
                    break;
                case 6:
                    System.out.println("\nGracias por utilizar el programa!");//Opción 6 para salir
                    break;
            }

        } while (opcion != 6);
    }

    //Método que muestra la suma
    public static void suma(double a, double b) {
        System.out.println("****SUMA****\nEl resultado de la suma es: " + (a + b));
    }

    //Método que muestra la resta
    public static void resta(double a, double b) {
        System.out.println("****RESTA****\nEl resultado de la resta es: " + (a - b));
    }

    //Método que muestra el producto
    public static void producto(double a, double b) {
        System.out.println("****PRODUCTO****\nEl resultado del producto es: " + (a * b));
    }

    //Método que muestra la potencia
    public static void potencia(double a, double b) {
        System.out.println("****POTENCIA****\nEl resultado de "+a+" elevado a " +b+ "es: " + (Math.pow(a, b)));
    }

    //Método que muestra la división
    public static void division(double a, double b) {
        System.out.println("****DIVISION****\nEl resultado de la potencia es: " + (a/b));
    }

}
