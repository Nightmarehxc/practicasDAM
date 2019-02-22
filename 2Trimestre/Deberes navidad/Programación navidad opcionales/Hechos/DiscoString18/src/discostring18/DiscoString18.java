//Ángel Cuevas Soriano
/*
18) Pide por teclado dos número y genera 10 números aleatorios entre esos
números. Usa el método Math.random para generar un número entero aleatorio 
(recuerda el casting de double a int).
 */
package discostring18;

import java.util.Scanner;


public class DiscoString18 {

//Scanner publico
     public static Scanner entrada = new Scanner(System.in);
     
    public static void main(String[] args) {
 
        System.out.println("Introduce el primero numero");
        int n1=entrada.nextInt();
  
        System.out.println("Introduce el segundo numero");
        int n2=entrada.nextInt();
  
        System.out.println("A continuacion se generarán 10 numeros aleatorios en torno a esos dos numeros introducidos");
        naleatorios(n1,n2);
        
    }
     public static void naleatorios(int n1, int n2){
        for (int i=0;i<10;i++){
            //Generamos un numero aleatorio
            int numAleatorio=(int)Math.floor(Math.random()*(n1-n2)+n2);
            System.out.println(numAleatorio);
    }
  }
   
}
