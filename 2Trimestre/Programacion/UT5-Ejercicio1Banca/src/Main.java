import java.util.Scanner;

public class Main {

static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        int x=0;
        Prueba test = new Prueba();
        //test.Instrucciones();
        System.out.println("1 para Crear cuenta. 2)Mostrar Saldo 3)Añadir Saldo 4)Salir");
        x = sc.nextInt();
        switch (x)
        {
            case 1:
                test.crearCuenta();
                break;
            case 2:
                test.mostrarSaldo();
                break;
            case 3:
                test.addMoney();
                break;
        }

    }
}
