import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();
        switch (opcion)
        {
            case 1:
                    Division.Division();
                    break;
            case 2:
                FueraRango.comprobar();
                break;
            case 3:
                FueraRangoChar.comprobarChar();
        }

    }
}
