//Ángel Cuevas Soriano
/*
Escribir un programa que lea 20 valores de temperatura y devuelva
el número de veces que ésta tiene un valor inferior a los cero 
grados. 
 */
package ejercicio1modificado;
import java.util.Scanner;
public class Ejercicio1Modificado {

  //scaner
public static Scanner entrada=new Scanner(System.in);

    public static void temperatura(){
       System.out.println("Escribe 20 valores de temperatura:");
       int t;
       int acumulador=0;
       for (int i = 0; i < 20; i++) {
           t = entrada.nextInt();
           if (t<0) {
              acumulador= acumulador+1; 
           }
       }
       System.out.println("El numero de veces que la temperatura es inferior a 0 es: "+acumulador);
       
   }
    
    public static void main(String[] args) {
   temperatura();
    }
    
}