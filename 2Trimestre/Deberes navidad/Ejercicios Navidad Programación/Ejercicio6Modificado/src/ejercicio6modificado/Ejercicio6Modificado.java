//Ángel Cuevas Soriano
/*
Realiza un programa por metodos que te calcule:
-La raiz cuadrada de 64
-El cubo de 8
-El exponencial de 2
-El logaritmo de 2.71828
-El menor de 2 y 3
-El valor absoluto de -4.5
-Redondear -4.5
-El seno de 45
 */
package ejercicio6modificado;

import java.util.Scanner;


public class Ejercicio6Modificado {
public static Scanner entrada= new Scanner(System.in);
 
 
 public static void RaizCuadrada(){
     int a=64;
     double RaizCuadrada = Math.sqrt(a);
     System.out.println("El resultado de la raiz cuadrada de 64 es: "+Math.sqrt(a));
     System.out.println("");
     
 }
 
 public static void ochoalcubo(){

     int a=8;

     System.out.println("El resultado de 8 elevado al cubo es: "+Math.pow(a,3));
     System.out.println("");
     
 }
 
 public static void expde2(){

     int a=2;

     System.out.println("El resultado del exponencial de 2 es: "+Math.exp(a));
     System.out.println("");
     
 }
 
 public static void logdeunnumero(){

     double a= 2.71828;

     System.out.println("El resultado del logaritmo de 2,71828 es: "+Math.log(a));
     System.out.println("");
     
 }
 
  public static void menorvalorentre2y3(){

           int a=2;
           int b=3;

     System.out.println("El menor valor entre 2 y 3 es: "+Math.min(a,b));
     System.out.println("");
     
 }
 
  public static void valor_absoluto(){

           double a=-4.5;
         

     System.out.println("El valor absoluto de -4,5 es: "+Math.abs(a));
     System.out.println("");
     
 }

  public static void redondeo(){

           double a=-4.5;
         

     System.out.println("El valor redondeado de -4,5 con ROUND es : "+Math.round(a));
     System.out.println("");
     
 }
  
   public static void seno(){

           int a=45;
         

     System.out.println("El seno de 45 es : "+Math.sin(a));
     System.out.println("");
     
 }
  
    public static void main(String[] args) {
        System.out.println("Vamos a calcular las siguientes operaciones divididas en subprogramas y mostrar su resultado por pantalla");
       RaizCuadrada();
       ochoalcubo();
       expde2();
       logdeunnumero();
       menorvalorentre2y3();
       valor_absoluto();
       redondeo();
       seno();
    }
    
}
 
    

