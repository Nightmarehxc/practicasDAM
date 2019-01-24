import java.util.Scanner;

public class Division
{

    public static int Division()

    {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int resultado=0;

        try {
             resultado = a/b;
        }
        catch (ArithmeticException e)
        {
            System.out.println("Error: " +e.getMessage());
        }

        return resultado;
    }

}
