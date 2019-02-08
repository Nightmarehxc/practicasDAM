import java.util.Scanner;

public class Main {

static Scanner sc = new Scanner(System.in);
    static int x=0;
    public static void main(String[] args)
    {


        //test.Instrucciones();

//        x = sc.nextInt();
        Menu();
    }
    public static void Menu()
    {
        Prueba test = new Prueba();
        System.out.println("1 para Crear cuenta. 2)Mostrar Saldo 3)Añadir Saldo 4)Salir");
        x = sc.nextInt();
        switch (x)
        {
            case 1:
                test.crearCuenta();
                Menu();
                x= 0;
                break;
            case 2:
                test.mostrarSaldo();
                Menu();
                break;
            case 3:
                test.addMoney();
                Menu();
                break;
        }
    }
}
