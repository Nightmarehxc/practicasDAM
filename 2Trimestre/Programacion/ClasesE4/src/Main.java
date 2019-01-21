import java.util.Scanner;

public class Main
{
    static Pajaro bird = new Pajaro();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("Introduce el color del pajaro");
        bird.setColor(sc.next());
        System.out.println("Introduce la edad del pajaro");
        bird.setEdad(sc.nextInt());
        bird.crearPajaro();

        bird.MostrarPajaros();
    }
}
