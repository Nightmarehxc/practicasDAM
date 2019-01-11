import java.util.Scanner;


public class LibroT1P10 {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce edad");
        int edad = sc.nextInt();
        System.out.println("Introduce nivel de estudios");
        int nivel_de_estudios = sc.nextInt();
        System.out.println("Introduce nivel de ingresos");
        int ingresos = sc.nextInt();



        if ((edad<=28) && (nivel_de_estudios>3) && (ingresos>28000)){

            boolean jasp = true;
            System.out.println("El booleano vale: " + jasp);

        }
        else{

            boolean jasp = false;
            System.out.println("El booleano vale: " + jasp);
        }
    }

}
