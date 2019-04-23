import java.util.Scanner;

public class Main {
    private static float mediaAnual;
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        Calendario  cal = new Calendario();
        System.out.println("Programa para calcular media de temperaturas");
        for(int i=0; i < 12;)
        {
            System.out.println("Introduce la temperatura para el dia 1 del mes: "+i);
           cal.mes[i]= new Mes();
            cal.mes[i].setDia1(sc.nextFloat());
            cal.mes[i].setDia30(sc.nextFloat());
            i++;
        }
        for(int i = 0; i<12;i++)
        {

            float mediaMensual = cal.mes[i].getDia1() + cal.mes[i].getDia30()/2;
            mediaAnual = mediaAnual + mediaMensual;
        }
        mediaAnual= mediaAnual /12;
        System.out.println(mediaAnual);


    }


}
