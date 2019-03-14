import java.util.Arrays;
import java.util.Scanner;

/*CORRAL GONZALEZ, DIEGO*/

//CLASE PRINCIPAL
public class Main {

    //ARRAY DONDE ALMACENAR LAS VENTAS DE LOS MESES
    static int[] ventas = new int[12];

    //MÉTODO PRINCIPAL
    public static void main(String[] args) {

        boolean salir = false;
        int opcion;
        String salirStr;
        Scanner sc = new Scanner(System.in);

        //BUCLE PARA EJECUTAR EL MENÚ HASTA QUE SE PULSE LA OPCIÓN DE SALIR
        do {
            System.out.println("\nSeleccione una opción\n1. Rellenar array de ventas\n2. Mostrar ventas\n3. Mostrar ventas al revés\n4. Mostrar suma total de ventas del año\n5. Mostrar ventas totales de meses pares\n6. Mostrar mes con más ventas\n7. Salir del programa ");
            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    rellenar();
                    break;

                case 2:
                    mostrarVentas();
                    break;

                case 3:
                    mostrarVentasReves();
                    break;

                case 4:
                    suma();
                    break;

                case 5:
                    ventasPares();
                    break;

                case 6:
                    mesMasVentas();
                    break;

                case 7://OPCIÓN SALIR
                    System.out.println("\nDesea salir del programa? (SI/NO)");
                    salirStr = sc.next();
                    if (salirStr.equalsIgnoreCase("SI")) {
                        System.out.println("\nGracias por utilizar el programa");
                        salir = true;
                    }
                    break;

                default://SI SE SELECCIONA OTRA OPCIÓN FUERA DEL MENÚ, INFORMAMOS
                    System.err.println("Opción no válida");
            }


        } while (!salir);
    }

    //MÉTODO PARA RELLENAR EL ARRAY
    public static void rellenar() {
        int i;
        for (i = 0; i < ventas.length; i++) {
            ventas[i] = (int) (Math.floor(Math.random() * (90 + 1) + 10));
        }
        System.out.println("\nArray rellenado con éxito");
    }

    //MÉTODO DONDE UTILIZAMOS EL MÉTODO DE LA CLASE ARRAYS PARA MOSTRAR EL ARRAY EN FORMA DE STRING
    public static void mostrarVentas() {
        System.out.println("El array de ventas es: ");
        System.out.println("\n" + Arrays.toString(ventas));
    }

    //MÉTODO DONDE RECORREMOS EL ARRAY Y VAMOS SUMANDO TODOS SUS VALORES
    public static void suma() {
        int i, suma = 0;
        for (i = 0; i < ventas.length; i++) {
            suma = ventas[i] + suma;
        }
        System.out.println("La suma de ventas es: " + suma);
    }

    //MÉTODO DONDE RECORREMOS EL ARRAY DE VENTAS AL REVÉS
    public static void mostrarVentasReves() {
        System.out.println("\nEl listado de ventas al revés es: ");
        for (int i = ventas.length - 1; i > 0; i--) {
            System.out.print(ventas[i] + " ");
        }
    }

    //MÉTODO DONDE RECORREMOS EL ARRAY Y SUMAMOS LOS VALORES DE CADA MES PAR (PARA NO CONTAR EL CERO, EMPEZAMOS POR ENERO Y ASIGNANDOLE EL VALOR 1, POR LO QUE ES IMPAR)
    public static void ventasPares() {
        int ventasPares = 0, i;

        for (i = 0; i < ventas.length; i++) {
            if ((i + 1) % 2 == 0) {
                ventasPares = ventasPares + ventas[i];
            }
        }
        System.out.println("La suma de las ventas de los meses pares es: " + ventasPares);
    }

    //MÉTODO DONDE RECORREMOS EL ARRAY Y SELECCIONAMOS EL VALOR MAYOR. LA POSICIÓN DE ESE VALOR, LA CRUZAMOS CON OTRO ARRAY DONDE TENEMOS DEFINIDOS LOS MESES
    public static void mesMasVentas() {

        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        int i, j = 0, mesMasVentas = 0;

        for (i = 0; i < ventas.length; i++) {
            if (j < ventas[i]) {
                j = ventas[i];
                mesMasVentas = i;
            }
        }
        System.out.println("El mes con más ventas es: " + meses[mesMasVentas]);
    }
}
