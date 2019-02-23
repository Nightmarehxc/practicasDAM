//Ángel Cuevas Soriano
/*

 */
package ejercicio12modificado;

import java.util.Scanner;


public class Ejercicio12Modificado {
    
    
    public static void repeticion(int n){
           for (int i = 0; i < n; i++) {
            System.out.println("Hola Mundo");
        }
    }
 //scaner
    public static Scanner sc= new Scanner (System.in);
    
    
    public static void main(String[] args) {
      System.out.println("Escribe por teclado un numero entre 1 y 5 que te devuelva el texto hola mundo tantas veces como se indique");
       int n= sc.nextInt();
       
       repeticion(n);
    }
    
}
