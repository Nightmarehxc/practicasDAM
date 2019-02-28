import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static int[][] x = new int[4][2];
    static int var1, var2;
    static int max;
    static int min;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 2; j++) {
                System.out.println("Introduce el numero");
                x[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("El numero " + x[i][j] + " está en la posición [" + i + "," + j + "]");
            }
        }
        Max();
        min();
        Suma();

    }

    static void Suma() {
        System.out.println("\nEntramos en la suma");
        //// Suma
        for (int i = 0; i < 4; i++) {


            for (int j = 0; j < 2; j++) {

                var1 = x[i][j];
                var2 = Calculadora.getSuma();
                Calculadora.Sumar(var1, var2);
            }
        }
        System.out.println("El resultado de la suma es " + var2);


    }
    static void Max()
    {

        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 2; j++)
            {
                if ( max < x[i][j])
                {
                    max = x[i][j];
                }


            }
        }
        System.out.println("El numero mas alto es " + max);



    }
    static void min()
    {

        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 2; j++)
            {
                if ( min > x[i][j])
                {
                    min = x[i][j];   /// Bucle para recoger el valor mas bajo haciendo una comparacion
                }


            }
        }
        System.out.println("El numero mas bajo es " + min);



    }

}