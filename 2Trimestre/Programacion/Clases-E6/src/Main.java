import sun.security.krb5.internal.crypto.Des;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        Descarga d1 = new Descarga();
        System.out.println("Introduce el nombre del fichero");
        d1.getName(sc.next());
        System.out.println("Introduce el peso del fichero");
        System.out.println("Introduce la velocidad de tu conexion en MB");


    }
}
