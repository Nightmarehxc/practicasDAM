import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.Scanner;

public class Main
{
    static Scanner sc =  new Scanner(System.in);
    static RegistroVentasDiaria  rv = new RegistroVentasDiaria();

    public static void main(String[] args)
    {
        menuP();

    }

    public static void menuP()
    {
        int opcion;
       do {
           System.out.println("Selecciona una opción:\n1)Para crear venta\n" +
                   "2)Imprimir registro de ventas\n3)BuscarVenta\n4)Modificar año\n4Salir");
           opcion=sc.nextInt();
           switch (opcion) {
               case 1:
                   rv.crearVenta();
                   break;
               case 2:
                   rv.imprimirRegistroVentas();
                   break;
               case 3:
                   rv.imprimirRegistroVentas();
                   rv.buscarVenta(sc.nextInt());
                   break;
               case 4:

                   System.out.println("Introduce el codigo del año a modificar");
                   rv.modAño(sc.nextInt());
                   break;
               case 5:
                   break;
           }
       }while(opcion!=5);
    }
}
