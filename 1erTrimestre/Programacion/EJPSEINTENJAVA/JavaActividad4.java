
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
public class JavaActividad4 {
           public static void main(String[] arg) {
       
            Scanner sc= new Scanner(System.in);
               int contador=1, negativo=0;
              
            do{
            System.out.println("Introducir temperatura: ");
            int a= sc.nextInt();
            if (a<=0){
            negativo++;
            }
            contador++;
            }
            while(contador<=20);{
               
           }
          System.out.println("Se han introducido "+negativo+" veces una temperatura por debajo de cero");
           }
           
}
