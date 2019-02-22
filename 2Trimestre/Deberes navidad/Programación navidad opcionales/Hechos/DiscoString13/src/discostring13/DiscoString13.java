//Ángel Cuevas Soriano
/*
13) Realiza una aplicación que nos pida un número de ventas a introducir, 
después nos pedirá tantas ventas por teclado como número de ventas se hayan
indicado. Al final mostrara la suma de todas las ventas. Piensa que es lo que se
repite y lo que no.
 */
package discostring13;

import java.util.Scanner;

public class DiscoString13 {

    //Scanner publico
     public static Scanner entrada = new Scanner(System.in);
     
    public static void main(String[] args) {
        
        int sumaventas= 0;
         System.out.println("Escribe el numero de ventas por teclado");
         int nv= entrada.nextInt();
         
         System.out.println("Escribe el valor de cada una de las ventas introducidas");
        
         for (int i = 1; i <= nv; i++) {
             int v= entrada.nextInt();
             
             sumaventas= sumaventas +v;
        }
         
         System.out.println("La suma del valor de cada una de las ventas es: "+sumaventas);
         
         
    }
    
    
    
}
