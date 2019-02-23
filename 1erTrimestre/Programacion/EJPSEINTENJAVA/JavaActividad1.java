
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
public class JavaActividad1 {
    
        public static void main(String[]args){
        Scanner sc = new Scanner(System.in); 
        int a, b, c;
                System.out.println("Ingrese el valor de a: ");
                a = sc.nextInt();
                
                System.out.println("Ingrese el valor de b: ");
                b = sc.nextInt();
                
                System.out.println("Ingrese el valor de c: ");
                c = sc.nextInt();

        //Obtien los valores x1,x2 de la ecuacion

        double x1 = (-b + Math.sqrt((b*b)-(4*a*c)))/(2*a);
        double x2 = (-b - Math.sqrt((b*b)-(4*a*c)))/(2*a);

        //imprime los valores
           if (x1>=0){
        System.out.println("La solucion de x1: "+x1);
           }
           else{
           System.out.println("No hay solución real");
           }
           if (x2>=0){
        System.out.println("La solucion de x2: "+x2);
           }
           else{
           System.out.println("No hay solución real");
           }

    }

}
