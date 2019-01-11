import java.util.Random;
import java.util.Scanner;

public class Elefante {
    public static int Sube() {
        int kgMax = 7500;
        int kgMin = 100;
        int peso;
        int eSubido = 1;
        int c;
        int bascula =0;
        int roto;
        Random generadorPeso = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el peso maximo en KILOS que la bascula podra soportar");
        int  maxPeso = sc.nextInt();
        System.out.println("Introduce cuantos elefantes subiran como maximo");

        int maxElefantes = sc.nextInt();

        for (c = 1; c < maxElefantes; c++)
        {
            peso = 100 + generadorPeso.nextInt(kgMax);
            System.out.println(c + " Elefantes de " + peso + " KG Se balanceaba...");
             bascula = bascula + peso;
             int x = maxPeso - bascula;

                if(bascula > maxPeso)
                {
                    System.out.println("La telaraña  se rompio y los " +c+" elefantes se cayeron");
                    roto=1;
                    return roto;
                }
                else System.out.println("la telaraña puede soportar" +x+"Kilos mas" );
        }
        return 1;
    }
}