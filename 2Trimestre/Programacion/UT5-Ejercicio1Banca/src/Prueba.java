import java.util.Scanner;

public class Prueba
{
    static int nCuentas=2;
    static Scanner sc = new Scanner(System.in);
    static public Banca banca[]=new Banca[nCuentas];

    public Prueba()
    {
            int nCuentas=2;

    }

    static void crearCuenta()
    {
        System.out.println("Numero de cuentas es: "+nCuentas);
        int i=0;

        for (i=0;i<banca.length;i++) {
            banca[i]=new Banca();
            System.out.println("La cuenta " +(i+1)+" ha sido creada");
        }

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
            System.out.println("\nIntroduce el dinero que deseas ingresar en la cuenta: "+i);
            banca[i].abonar(sc.nextDouble());
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
