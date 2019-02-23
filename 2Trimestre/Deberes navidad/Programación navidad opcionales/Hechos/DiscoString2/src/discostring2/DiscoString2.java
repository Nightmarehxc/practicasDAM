//Ángel Cuevas Soriano
/*
Declara 2 variables numéricas (con el valor que desees),e indica cual es mayor
de los dos. Si son iguales indicarlo también. Ves cambiando los valores para 
comprobar que funciona.
 */
package discostring2;

import java.util.Scanner;

public class DiscoString2 {
    
public static Scanner entrada= new Scanner(System.in);
    

public static void Comparacion(int a, int b){
    
    if (a>b) {
        System.out.println("El valor "+a+" es mayor que "+b);
    }
    if (a<b) {
        System.out.println("El valor "+b+" es mayor que "+a);
    }
    if (a==b) {
        System.out.println("El valor "+a+" es igual que "+b);
    }
}


    public static void main(String[] args) {
      int a= entrada.nextInt();
      int b= entrada.nextInt();
      Comparacion(a,b);
      
    }
    
}
