package src;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca su fecha de nacimiento en el formato AA-MM-DD: ");
        Signo signo1 = new Signo();
        signo1.setAño(sc.nextInt());
        System.out.println("El año introducido es: "+signo1.getAño());
        signo1.setMes(sc.nextInt());
        System.out.println("El mes introducido es: "+signo1.getMes());
        signo1.setDia(sc.nextInt());
        System.out.println("El día introducido es: "+signo1.getDia());
        System.out.print(" ");
        System.out.println("SU SIGNO DEL ZODIACO ES... ");
        System.out.println("***************************************");
        System.out.print(" ");
        System.out.println("..."+signo1.getsigno());
    }
}
