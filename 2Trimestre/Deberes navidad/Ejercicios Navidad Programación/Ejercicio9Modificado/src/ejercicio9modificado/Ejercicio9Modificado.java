//Ángel Cuevas Soriano
/*
 Escribe un programa  que lea del teclado tres números, si el primero es
negativo debe imprimir el producto de los tres y si no lo es, imprimirá la
suma.
 */
package ejercicio9modificado;

import java.util.Scanner;

public class Ejercicio9Modificado {

 public static void Producto(int a,int b, int c){
     
     int p;
      p=a*b*c;
    System.out.println("El producto de los tres es: "+p);
 }
    
 
 public static void Suma(int a,int b, int c){
     
     int s = 0;
      s =a+b+c;
     System.out.println("La suma de los tres es: "+s);
 }
 
 
    public static void main(String[] args) {

System.out.println("Escribe por teclado los valores a, b y c ");
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();
int c = sc.nextInt();

    if(a<0){
    Producto(a,b,c);
    }
    else if(a>0){
     Suma(a,b,c);
    
    }
            
  }
    
}
