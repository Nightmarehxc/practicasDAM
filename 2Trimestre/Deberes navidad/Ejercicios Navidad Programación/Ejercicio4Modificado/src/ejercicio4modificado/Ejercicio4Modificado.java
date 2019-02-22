//Ángel Cuevas Soriano
/*
EJERCICIO 5 Escribe un programa en Java que lea 6 enteros y que calcule la media.
 */
package ejercicio4modificado;

import java.util.Scanner;

public class Ejercicio4Modificado {

    public static int leer6numeros(){
        
        int contador; 
 int media;
 
       //Leemos 6 numeros por teclado
      Scanner sc= new Scanner(System.in);
        
        int n1= sc.nextInt();
        System.out.println("Primer numero: "+n1);
        
         int n2= sc.nextInt();
        System.out.println("Segundo numero: "+n2);
        
         int n3= sc.nextInt();
        System.out.println("Tercer numero: "+n3);
        
         int n4= sc.nextInt();
        System.out.println("Cuarto numero: "+n4);
        
         int n5= sc.nextInt();
        System.out.println("Quinto numero: "+n5);
        
         int n6= sc.nextInt();
        System.out.println("Sexto numero: "+n6);
        
       
        contador = n1+n2+n3+n4+n5+n6;
        
        
       return contador;
    }
    
    
    public static void media(int contador){
         //calculamos la media
      double media =contador/6; 
       //Escribimos el resultado
        System.out.println("La media de estos 6 numeros es: "+media);
    }
    
    
    
    public static void main(String[] args) {
   System.out.println("Escribe con el teclado 6 números enteros ");
   
   int n;
   n= leer6numeros();
   media(n);
   
    }
    
}
