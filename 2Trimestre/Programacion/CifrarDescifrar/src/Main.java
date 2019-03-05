import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int opcion,opcion2;

        do {
            System.out.println("\nIntroduce un mensaje");
            Scanner sc = new Scanner(System.in);
            String mensaje = sc.nextLine();
            Mensaje r13 = new Mensaje(mensaje);

            System.out.println("\nSelecciona una opción:\n1.Cifrar\n2.Descifrar\n3.Salir");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\nEl mensaje encriptado es: "+r13.cifrar());
                    break;
                case 2:
                    System.out.println("\nEl mensaje desencriptado es: "+r13.descifrar());
                    break;
                case 3:
                    break;
            }
            System.out.println("\nDesea introducir otro mensaje para cifrar/descirar?\n1.Si\n2.No");
            opcion2=sc.nextInt();
        } while ((opcion != 3)&&(opcion2!=2));
        System.out.println("\nGracias por utilizar el programa");
    }
}
