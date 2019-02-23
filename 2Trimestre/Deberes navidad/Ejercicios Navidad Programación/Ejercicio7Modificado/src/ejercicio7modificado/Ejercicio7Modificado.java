//Ángel Cuevas Soriano
/*
Escribe un programa para calcular la longitud de la circunferencia y el 
área de un círculo cuyo radio se lea de teclado y muestre el resultado en
la pantalla.
 */
package ejercicio7modificado;

import java.util.Scanner;

public class Ejercicio7Modificado {

    public static void longitud(double r){
        
        double longitud;
        double PI =3.14159;
        longitud = 2*PI*r; 
        System.out.println("La longitud es:"+longitud);
        
    }
    
    
    
    public static void area(double r){

       double area;
       double PI =3.14159;
         area= PI*r*r;
      System.out.println("El área es:"+area);  
      
    }
    
    
    public static void main(String[] args) {
System.out.println("Escribe por teclado un valor para r que es el radio de la circunferencia:");

    Scanner sc = new Scanner(System.in);
    double r = sc.nextInt();
    
    longitud(r);
    area(r);
    
    }
    
}
