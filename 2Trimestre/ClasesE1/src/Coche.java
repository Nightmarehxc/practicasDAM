import java.util.Scanner;

public class Coche {
    static Scanner sc = new Scanner(System.in);

    private static String color = "rojo";
    private static String modelo = "diablo";
    private static String marca= "lamborgini";
    public static float velocidad = 0;
    public static boolean motor = false;
    //Motor mot = new Motor();


    public Coche (
                    String color,
                    float velocidad,
                    String modelo,
                    String marca
                    //Motor mot
                  )
    {
        Coche.color = color;
        Coche.velocidad = velocidad;
        Coche.modelo = modelo;
        Coche.marca = marca;
      //  this.mot = mot;
    }
    public static String setModelo()
    {
        System.out.println("Introduce el modelo del coche");
        Coche.modelo = sc.next();

        return modelo;
    }

    public String getModelo()
    {
        return modelo;
    }
    public String getColor()
    {
        return color;
    }
    public static String setColor()
    {
        System.out.println("Introduce el color");
        color = sc.next();
        return color;
    }
    public static String setMarca()
    {
        System.out.println("Introduce la marca del coche");
        Coche.marca= sc.next();

        return modelo;
    }
    public float getVelocidad()
    {
        velocidad = Motor.velocidad;
        return velocidad;
    }



    public static int imprimir()
    {
        System.out.println("Color "+ color);
        System.out.println("Marca "+ marca);
        System.out.println("Modelo "+modelo);
        System.out.println("Velocidad actual " + velocidad);
        return 0;
    }



}