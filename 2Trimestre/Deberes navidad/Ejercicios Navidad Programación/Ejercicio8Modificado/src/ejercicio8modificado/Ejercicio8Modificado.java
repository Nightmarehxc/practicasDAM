//Ángel Cuevas Soriano
/*
Elabora un programa que te pida introducir dos numeros por teclado y despues te 
los devuelva de menor a mayor.
 */
package ejercicio8modificado;

import java.util.Scanner;


public class Ejercicio8Modificado {

public static void mayoromenor(int a, int b){

if(a>b){
  System.out.println(b+"<"+a);
 
}
else{
     
   if(a<b){
    System.out.println(a+"<"+b);
  
   }
    }

}


    public static void main(String[] args) {
     System.out.println("Escribe por teclado los valores a y b ");
     Scanner sc = new Scanner(System.in);
   int  a = sc.nextInt();
   int  b = sc.nextInt();
   
   mayoromenor(a,b);
   
    }
    
}
