//Ángel Cuevas Soriano
/*
Escribe un programa que solicite un número en segundos y muestre por pantalla
dicha cantidad de tiempo en horas, minutos y segundos.
 */
package ejercicio13modificado;

import java.util.Scanner;

public class Ejercicio13Modificado {

    
    public static void operacion(int n){
        
        int h,m,s;
        
         h=n/3600;
        m=(n-(3600*h))/60;
        s=n-((h*3600)+(m*60));
        System.out.println(h+"h "+m+"m "+s+"s");
    }

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int n;
        
        System.out.println("ingrese el tiempo en segundos ");
        n=sc.nextInt();
        
        operacion(n);
    }
    
}
