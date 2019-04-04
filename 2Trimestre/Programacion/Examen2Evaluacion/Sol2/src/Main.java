///Camarero Abella Daniel

import rectan.Rectangulo;

import java.util.Scanner;

public class Main {
    Package rectan;
    static double x;
    static double y;
    static Scanner sc = new Scanner(System.in);
    static boolean tX = false;
    static boolean tY = false;
    static boolean t= false;

    public static void main(String[] args)

    {
        do


            {
                getInput();
                System.out.println("¿Quiere cerrar el programa?");
                String close = sc.next();
                switch (close)
                {
                    case "si":
                        t = true;
                        break;

                }
            }while (t == false);



    }
    public static void getArea()
    {
        double area = x * y ;
        System.out.println(area);

    }
    public static void getInput()
    {
        do
        {
            System.out.println("Introduce Ancho");
            x = sc.nextDouble();
            if ( x > 10 && x<20)
            {
                tX = true;
            }
            else
            {
                System.out.println("tiene que ser mayor de 10 y menor de 20");

            }
            System.out.println("Introduce Alto");
            y = sc.nextDouble();
            if ( y > 10 && y <20)
            {
                tY = true;
            }
            else
            {
                System.out.println("tiene que ser mayor de 10 y menor de 20");
            }
            Rectangulo rectangulo = new Rectangulo(y,x);
        }
        while (tX == false&&tY == false);
        if( tX && tY == true)
        {
            getArea();
        }

    }
}
