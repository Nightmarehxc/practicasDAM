/*Corral González, Diego
 */
package Test;

import Clases.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {

    //VARIABLES ESTÁTICAS PARA UTILIZAR EN TODA LA CLASE
    static Scanner sc = new Scanner(System.in);
    static boolean correcto = false;
    static double hdd = 0;
    static double precio = 0;
    static String procesador = "";
    static String[] procesadores = {"i3", "i5", "i7"};
    static double tMonitor;

    //MÉTODO PRINCIPAL
    public static void main(String[] args) {

        //DECLARACIÓN DE VARIABLES
        int ram = 2048;
        String grafica = "Geforce 1080";
        int opcion=0, i = 0;
        ArrayList<Ordenador> ordenadores = new ArrayList();

        //CREACIÓN DE OBJETOS CON SUS CONSTRUCTORES
        do {
            do {
                try {
                    opcion=pedirDatos();
                } catch (miException ee) {
                    System.err.println("La capacidad del disco duro debe ser múltiplo de 5 y el precio debe ser mayor que 0. En caso de servidor, el monitor no puede ser menor de 14 pulgadas");
                } catch (InputMismatchException e) {
                    System.err.println("Valores no válidos");
                } catch (ArrayIndexOutOfBoundsException eee) {
                    System.err.println("Opción de procesador no válida");
                }
            } while (!correcto);

            //CREAMOS DOS OBJETOS DISTINTOS CON LOS DATOS OBTENIDOS, DEPENDIENDO DE LA OPCION INTRODUCIDA POR EL USUARIO
            if (i % 2 == 0) {
                if (opcion == 1) {
                    ordenadores.add(i, new Portatil(ram, hdd, procesador, grafica, precio, "ASUS", 15.6, 1700));
                    i++;
                } else {
                    ordenadores.add(i, new Servidor(ram, hdd, procesador, grafica, precio, 23, "Mecánico", "Gaming"));
                    i++;
                }
            } else if (i % 2 != 0) {
                if (opcion == 1) {
                    ordenadores.add(i, new Portatil(ram, hdd, procesador, grafica, precio, "ACER", 17.8, 1500));
                    i++;
                } else {
                    ordenadores.add(i, new Servidor(ram, hdd, procesador, grafica, precio, 19, "Normal", "Normal"));
                    i++;
                }
            }
           
        } while (i < 4);

        //CREACIÓN DE OTROS DOS OBJETOS CON CONSTRUCTOR POR DEFECTO
        ordenadores.add(new Portatil());
        ordenadores.add(new Servidor());

        //BUCLE FOR EACH PARA RECORRER EL ARRAYLIST DE TIPO ORDENADOR
        for (Ordenador o : ordenadores) {
            o.mostrarDatos();
        }
        
        /* 
        pedirDatos();
        Portatil miPortatil2 = new Portatil(ram, hdd, procesador, grafica, precio, "ACER", 17, 800);
        pedirDatos();
        Servidor miServidor1 = new Servidor(ram, hdd, procesador, grafica, precio, 23, "Mecánico", "Gaming");
        pedirDatos();
        Servidor miServidor2 = new Servidor(ram, hdd, procesador, grafica, precio, 19, "Normal", "Normal");
        ordenadores.add(miPortatil2);
        ordenadores.add(miServidor1);
        ordenadores.add(miServidor2);
        ordenadores.add(miPortatil_sin_conocer_caracteristicas);
        ordenadores.add(miServidor_sin_conocer_caracteristicas);
        iterator<Ordenador> i = new iterator();
         */
        
    }
    
    //MÉTODO QUE DEVUELVE ENTERO EN FUNCIÓN DE LA OPCIÓN ELEGIDA POR EL USUARIO
    static int pedirDatos() throws InputMismatchException, miException, ArrayIndexOutOfBoundsException {
        int opcion = 0;

        do {
            System.out.println("\nPulse 1 para crear un PORTÁTIL.\nPulse 2 para crear un SERVIDOR");
            opcion = sc.nextInt();
            if ((opcion != 1) && (opcion != 2)) {
                System.out.println("\nOpción no válida. Intente de nuevo");
            }
        } while ((opcion != 1) && (opcion != 2));

        if (opcion == 2) {
            System.out.println("Indique el tamaño del monitor");
            tMonitor = sc.nextDouble();
            if (tMonitor < 14) {
                throw new miException();
            }
        }

        System.out.println("Elija un procesador (seleccione un número): \n1. i3\n2. i5\n3. i7");
        procesador = procesadores[sc.nextInt() - 1];

        System.out.println("Introduzca la capacidad del disco duro que desea asignar");
        hdd = sc.nextDouble();
        compruebaHDD(hdd);

        System.out.println("Introduzca el precio a asignar");
        precio = sc.nextDouble();
        compruebaPrecio(precio);

        return opcion;
    }

    static void compruebaHDD(double hdd) throws miException {

        if (hdd % 5 != 0) {
            throw new miException();
        } else {
            correcto = true;
        }
    }

    static void compruebaPrecio(double precio) throws miException {

        if (precio < 0) {
            throw new miException();
        } else {
            correcto = true;
        }
    }
}

class miException extends Exception {

    public miException() {
    }

    public miException(String mensaje) {
        super(mensaje);
    }

}
