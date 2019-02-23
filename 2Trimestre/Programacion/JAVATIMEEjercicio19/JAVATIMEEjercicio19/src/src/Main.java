package src;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

	    DNI dni1 = new DNI();
        System.out.println("Introduzca su edad: ");
        dni1.setEdad(sc.nextInt());
        System.out.println("Introduzca el mes y el año, respectivamente, de expedición de su DNI: ");
        dni1.setFechaExp(sc.nextInt(),sc.nextInt());
        System.out.print("\n");
        System.out.println("---------------------------------");
        dni1.getFechaExp();
    }
}
