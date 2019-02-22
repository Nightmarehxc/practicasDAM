//Ángel Cuevas Soriano
/*
15) Lee un número por teclado y comprueba que este numero es mayor o igual que 
cero, si no lo es lo volverá a pedir (do while), después muestra ese número por 
consola.
 */
package discostring15;

import java.util.Scanner;


public class DiscoString15 {

  //Scanner publico
     public static Scanner entrada = new Scanner(System.in);
     
    public static void main(String[] args) {
        
       System.out.println("Introduce un valor numérico para la variable n");
        int n=entrada.nextInt();
        
        condicion(n);
        
        if (n<0) {
       do{
            System.out.println("El valor introducido debe ser mayor o igual a cero, vuelve a inroducir un valor con estas condiciones.");  
            n=entrada.nextInt();
            
              condicion(n);
              
        }while(n<0);
         }
    }
    
    public static void condicion(int n){
  
        if (n==0) {
            System.out.println("El valor "+n+" introducido es mayor o igual a cero");
        }
        if (n>0) {
           System.out.println("El valor "+n+" introducido es mayor o igual a cero");
           
           
        }
    }
}
