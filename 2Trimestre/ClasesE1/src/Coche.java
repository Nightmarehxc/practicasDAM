import java.util.Scanner;

public class Coche {
    Scanner sc = new Scanner(System.in);

    private static String color;
    private String modelo;
    private String marca;
    public float velocidad;
    public boolean motor = false;
    Motor mot = new Motor();


    public Coche (
                    String color,
                    float velocidad,
                    String modelo,
                    String marca,
                    Motor mot
                  )
    {
        this.color = color;
        this.velocidad = velocidad;
        this.modelo = modelo;
        this.marca = marca;
        this.mot = mot;
    }




}