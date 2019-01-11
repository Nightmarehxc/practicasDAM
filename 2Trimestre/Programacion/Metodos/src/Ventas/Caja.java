package Ventas;

import java.util.Scanner;

public class Caja
{


    public static float Ingresar()
    {
        Scanner sc = new Scanner(System.in);
        Ventas conteo = new Ventas();
        float importe;
        int dia;
        int week = 1;
        System.out.println("Week"+week);
        System.out.println("En la "+week +"se registraron " + conteo.getTotal());
            for(int c=0; c<6; c++)
            {

                dia = conteo.getDia();///recoge el dia
                System.out.println("Ingresa el importe del dia " + conteo.getDia());
                System.out.println("Ventas.Caja del dia anterior"+conteo.GetCaja(dia));
                importe = sc.nextFloat();
                conteo.AddCaja(importe);
            }

        System.out.println(conteo.getTotal()+week);
        week++;
        return week;
    }

}
