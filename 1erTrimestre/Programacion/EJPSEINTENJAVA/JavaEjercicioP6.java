
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
public class JavaEjercicioP6 {
     public static void main(String[] arg) {
        
        int s, h, m;
        Scanner sc= new Scanner(System.in);
        System.out.println("Introducir segundos: ");
        s= sc.nextInt();
        m=s/60;
        h=s/3600;
        System.out.println("Son "+h+" horas, "+m+" minutos y "+s+" segundos");
    }
}
