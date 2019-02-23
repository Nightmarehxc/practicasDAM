//Ángel Cuevas Soriano
/*
6) Lee un número por teclado e indica si es divisible entre 2 (resto = 0).
Si no lo es, también debemos indicarlo.
 */
package discostring6;

import java.util.Scanner;

public class DiscoString6 {

   public static Scanner entrada = new Scanner(System.in);
    
   
   public static void Comprobacion(int a){
       
       if (a%2==0) {
           System.out.println(a+" si es divisible entre 2");
       }
       if (a%2!=0) {
            System.out.println(a+" no es divisible entre 2");
       }
       
   }

    public static void main(String[] args) {
        System.out.println("Introduce un número por teclado para comprobar si es divisible entre 2: ");
         int a= entrada.nextInt();
         
         Comprobacion(a);
        
    }
    
}
