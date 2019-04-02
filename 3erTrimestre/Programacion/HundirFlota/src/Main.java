import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        int x = sc.nextInt();

        System.out.println("Menu del juego Hundir la flota /n" +
                "1) Nueva partida\n" +
                "2) Salir");
        switch (x)
        {
            case 1:
                Partida game  = new Partida();
                break;
        }
    }
}
