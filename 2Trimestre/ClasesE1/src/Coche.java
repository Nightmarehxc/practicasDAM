import java.util.Scanner;

public class Coche
{
    Scanner sc = new Scanner(System.in);

    public String color;
    public String modelo;
    public String marca;
    public  float velocidad;
    public boolean motor= false;
    public  String GetColor()
    {
        System.out.println("Introduce el color");
        sc.next();
        return GetColor();
    }
}
