import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static int n =6;
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args)
    {

        ArrayList<Integer> arl = new ArrayList<Integer>();

        int maxN=0;

    boolean activado=true;

    do {
        try {       //// EJECUCIONES
            System.out.println("Introduce un numero entre 1 a 10");
            int numM = sc.nextInt();
            maxN = numM;
            if (maxN >= 1 && maxN <= 10)
                for (int i = 0; i < maxN; i++) {
                    arl.add(i, NumeroAleaotrio());
                    System.out.println(arl.get(i));
                    activado=false;
                }

        } catch (Exception nfe) {
            System.out.println("introduce numero entre 1 y 10"); /// EXCEPCIONES A MOSTRAR
            sc.nextLine();


        }
    }while (activado);




    }
    public static int NumeroAleaotrio()
    {
        int numero;
        numero = (int) (Math.random() * n) + 1;
        return numero;
    }

}
