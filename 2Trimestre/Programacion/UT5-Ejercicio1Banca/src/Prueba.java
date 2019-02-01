import java.util.Scanner;

public class Prueba
{
    static int nCuentas=1;
    static Scanner sc = new Scanner(System.in);
    static public Banca banca[]=new Banca[nCuentas];

    public Prueba()
    {

            int nCuentas=1;
        Banca banca[]=new Banca[nCuentas];

    }

    static void crearCuenta()
    {
        System.out.println("Numero de cuentas es: "+nCuentas);
        nCuentas++;
        banca[nCuentas].abonar(20);
        System.out.println("Cuenta creada el numero de cuentas es: "+nCuentas);


    }
    static void mostrarSaldo()
    {
        for(int i= 0;i < nCuentas;i++)
        {
            banca[i].obtenerSaldo();
        }
    }
    static void addMoney()
    {
        for(int i= 0;i < nCuentas;i++)
        {
            System.out.println("Introduce el dinero");
            banca[i].abonar(sc.nextDouble());
            System.out.println("El saldo añadido es "+ banca[i].obtenerSaldo());
        }
    }
    public static void  Instrucciones()
    {
        crearCuenta();
        mostrarSaldo();
        addMoney();
        mostrarSaldo();

    }
}
