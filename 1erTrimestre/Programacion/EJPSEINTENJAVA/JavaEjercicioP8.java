
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dam
 */
public class JavaEjercicioP8 {
    public static void main(String[] arg) {
        
        int t;
        Scanner sc= new Scanner(System.in);
        System.out.println("Introducir temperatura: ");
        t= sc.nextInt();
        if((t>30)&&(t<50)){
             System.out.println("La temperatura seleccionada es ideal para la NATACIÓN");
        }
        if((t>15)&&(t<=30)){
             System.out.println("La temperatura seleccionada es ideal para el GOLF");   
        }
        if((t>5)&&(t<=15)){
             System.out.println("La temperatura seleccionada es ideal para el TENIS");
        }
        if((t>-10)&&(t<=5)){
             System.out.println("La temperatura seleccionada es ideal para el ESQUÍ");
        }
        if(t<=-10){
             System.out.println("La temperatura seleccionada es ideal para las DAMAS");
        }
        if (t>=50){
                
            System.out.println("La temperatura es inhumana, mejor no salgas de casa");
        }
    }
}
