import java.util.Scanner;

public class Fibonacci
{
    public static void NumerosF()
    {
        Scanner sc = new Scanner(System.in);
        int n1=0;int n2= 1; int cont=0;
        int fnumber = n2;
        System.out.println("##################################################################");
        System.out.println("##############Sucesion de Fibonacchi #############################");
        System.out.println("##################################################################");

        System.out.println("Introduce el numero de sucesiones de Fibonacci que quieres mostrar");
        System.out.println("##################################################################");

        cont = sc.nextInt();
        System.out.println("La sucesion a mostrar seria.....");
        for (int i = 0; i < cont;i++)
        {
            System.out.println(n1);
            System.out.println(fnumber);
            /// Sucesion de Fibonacci seria 0,1,2,3,5
            n1 = n1+n2;
            n2 = n1+n2;

            fnumber = n2;

        }
        Menu.MenuPrincipal();
    }
}
