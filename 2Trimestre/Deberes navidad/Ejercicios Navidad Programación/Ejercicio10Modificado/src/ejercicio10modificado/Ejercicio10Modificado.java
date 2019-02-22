//Ángel Cuevas Soriano
/*
 Escribe un programa que lea tres números y determine el mayor de los tres.
 */
package ejercicio10modificado;

import java.util.Scanner;

public class Ejercicio10Modificado {

    public static void Elmayor(int a, int b, int c){
        
        if(a>b && a>c){
        
      System.out.println("El mayor de los tres es: "+a);  
    }
    if(b>a && b>c){
        
      System.out.println("El mayor de los tres es: "+b);  
    }
    else{
       if(c>a && c>b){
        System.out.println("El mayor de los tres es: "+c);     
           
       }
    }
  }
    
    public static void main(String[] args) {
        
    System.out.println("Escribe tres numeros con teclado para determinar el mayor de los tres");
    Scanner sc= new Scanner(System.in);
    int a= sc.nextInt();
    int b= sc.nextInt();
    int c= sc.nextInt();
    
    Elmayor(a,b,c);
    
    
    }
    
}
