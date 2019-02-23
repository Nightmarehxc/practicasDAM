//Ángel Cuevas Soriano
/*
EJERCICIO 2 Escribe un programa en Java que lea dos enteros y determine si el
primero es múltiplo del segundo. 
 */
package ejercicio2modificado;
import java.util.Scanner;
public class Ejercicio2Modificado {
    
 //scaner
public static Scanner entrada=new Scanner(System.in);


public static int leerentero1(){

        System.out.println("Escriba el valor de n1:");
         int n1= entrada.nextInt(); 
        
       return n1;
       
}

public static int leerentero2(){
    
     System.out.println("Escriba el valor n2:");
        int n2= entrada.nextInt();
        return n2;
}

public static void comprobarmultiplos(int n1, int n2){
     
  
    int resto = n2%n1;
 
if (resto==0){
  System.out.println(n1 + " es múltiplo de " + n2);
}
else if (resto!=0) {
        System.out.println(n1 + " NO es múltiplo de " + n2); 
    }
 
}

    public static void main(String[] args) {

       leerentero1();
       leerentero2();
       comprobarmultiplos(n1,n2);
    }
    
}
