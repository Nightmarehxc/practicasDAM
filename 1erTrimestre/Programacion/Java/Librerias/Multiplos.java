import java.util.Scanner;

public class Multiplos
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        //Declaración de variables
        int a,b;

        //Pedimos datos y los almacenamos en las variables a y b
        System.out.println("Introduce el primer número");
        a= sc.nextInt();
        System.out.println("Introduce el segundo número");
        b = sc.nextInt();

        /*Si el resto entero de la división entre ambos números es 0, es que a es múltiplo de b.
        Imprimimos resultados*/

        if (a%b == 0)
        {
            System.out.println(a + " SI es múltiplo de " + b);
        }
        else
        {
            System.out.println(a + " NO es múltiplo de " + b);
        }
    }
}