//Ángel Cuevas Soriano
/*
1) Declara dos variables numéricas (con el valor que desees), muestra por consola
la suma, resta, multiplicación, división y módulo (resto de la división).
 */
package discostring1;

import java.util.Scanner;
public class DiscoString1 {

public static Scanner entrada= new Scanner(System.in);
    
     public static void Suma(int a, int b){

         int resultado=a+b;
         System.out.println("La suma es: "+resultado);
    }
    
     public static void Resta(int a, int b){

         int resultado=a-b;
         System.out.println("La resta es: "+resultado);
    }
    
     public static void Multiplicacion(int a, int b){

         int resultado=a*b;
         System.out.println("La multiplicación es: "+resultado);
    }
     
      public static void Division(int a, int b){
  
         int resultado=a/b;
         System.out.println("La división es: "+resultado);
    }
      
       public static void Modulo(int a, int b){
   
         int resultado=a%b;
         System.out.println("El módulo es: "+resultado);
    }
    
    public static void main(String[] args) {
    int a= entrada.nextInt();
    int b= entrada.nextInt();
    
    Suma(a,b);
    Resta(a,b);
    Multiplicacion(a,b);
    Division(a,b);
    Modulo(a,b);    
    }
    
}
