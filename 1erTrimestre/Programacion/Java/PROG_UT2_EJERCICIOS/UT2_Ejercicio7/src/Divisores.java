import java.util.Scanner;

public class Divisores
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número");
        int numero = sc.nextInt();

        System.out.println("Sus divisores son: ");
        for (int i=1; i<=numero;i++)
            if (numero % i == 0) {
                System.out.println(i);
            }

    }

}