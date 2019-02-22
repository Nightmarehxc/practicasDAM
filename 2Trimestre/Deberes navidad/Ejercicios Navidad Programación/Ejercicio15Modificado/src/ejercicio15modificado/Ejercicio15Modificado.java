//Ángel Cuevas Soriano
/*
Escribe un programa para calcular el cuadrado y el cubo de un número 
introducido por teclado.
 */
package ejercicio15modificado;

import java.util.Scanner;

public class Ejercicio15Modificado {

    public static void Cuadrado(int n){
        
        int n2=n*n;
         System.out.println("El cuadrado de n es: "+n2);
    }
    
      public static void Cubo(int n){
        
        int n3=n*n*n;
      System.out.println("El cubo de n es: "+n3);
      
    }
      
      
    public static void main(String[] args) {
      System.out.println("Escribe por teclado un valor n para calcular su cuadrado y su cubo:");
     Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
     Cuadrado(n);
      Cubo(n);
    }
    
}
