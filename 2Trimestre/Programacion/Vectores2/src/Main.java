import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static int[][] x = new int[4][2];
    static int var1, var2;

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

}