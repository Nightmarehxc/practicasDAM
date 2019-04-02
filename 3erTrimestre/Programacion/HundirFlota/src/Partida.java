import java.util.Scanner;

public class Partida
{
    Scanner sc = new Scanner(System.in);
    Jugador p1;
    Jugador p2;

    public Partida()
    {
        System.out.println("Introduce el nombre del P1");
        p1 = new Jugador(sc.next());
        Tablero tableroP1 = new Tablero();
        System.out.println("Introduce el nombre del P2");
        p2 = new Jugador(sc.next());
        Tablero tableroP2 = new Tablero();

    }

}
