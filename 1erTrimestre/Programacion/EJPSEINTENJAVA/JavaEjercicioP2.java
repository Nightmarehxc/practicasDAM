
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
public class JavaEjercicioP2 {
      public static void main(String[] arg) {
        
        double r;
        Scanner sc= new Scanner(System.in);
        System.out.println("Introducir número: ");
        r= sc.nextInt();
        
        System.out.println("La longitud de la circunferencia es " +2*Math.PI*r+" y el área es " +Math.PI*Math.pow(r,2));
    }
}
