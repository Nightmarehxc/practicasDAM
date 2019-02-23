
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
public class JavaActividad3 {
           public static void main(String[] arg) {

           Scanner sc= new Scanner(System.in);
           System.out.println("Introducir primer nota: ");
           double a= sc.nextInt();
           System.out.println("Introducir segunda nota: ");
           double b= sc.nextInt();
           System.out.println("Introducir tercera nota: ");
           double c= sc.nextInt();
           double media= (a*0.5)+(b*0.2)+(c*0.3);
           
           if ((a>=0)&&(a<=10)){
                      if((b>=0)&&(b<=10)){
                                 if((c>=0)&&(c<=10)){
                                 System.out.println("La media es: "+media);
                                 }
                                 else{
                                     System.out.println("Las notas ingresadas no son válidas");
                                 }
                      }
                      else{
                      System.out.println("Las notas ingresadas no son válidas");
                      }
           }
           else{
               System.out.println("Las notas ingresadas no son válidas");
           }
           }
}
