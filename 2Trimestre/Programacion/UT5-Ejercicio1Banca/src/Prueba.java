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
        System.out.println("\nNumero de cuentas es: "+nCuentas);
        int i=0;

        for (i=0;i<banca.length;i++) {
        banca[i]=new Banca();
            System.out.println("\nLa cuenta " +(i)+" ha sido creada");

        }
        nCuentas++;

    }
    static void mostrarSaldo()
    {
        for(int i= 0;i < nCuentas;i++)
        {
        }
        for(int c=0; c<banca.length;c++)
        {
            System.out.println("\nSelecciona la cuenta: "+c);
        }
        int x = sc.nextInt();
        System.out.println("\nEl saldo de la cuenta  "+x+ " es :"+banca[x].obtenerSaldo());



    }
    public static int addMoney()
    {
/*
        for(int i= 0;i < nCuentas;i++)
        {
            System.out.println("\nIntroduce el dinero que deseas ingresar en la cuenta: "+i);
            banca[i].abonar(sc.nextDouble());
        }   */

        System.out.println("\nHay "+banca.length+" Cuentas");
        for(int c=0; c<banca.length;c++)
        {
            System.out.println("\nSelecciona la cuenta: "+c);
        }
        int x = sc.nextInt();
        System.out.println("\nIntroduce el dinero que deseas ingresar en la cuenta: "+x);
        banca[x].abonar(sc.nextDouble());
        return 0;
    }

    public static void  Instrucciones()
    {
        crearCuenta();
        mostrarSaldo();
        ///addMoney();
        mostrarSaldo();

    }
}
