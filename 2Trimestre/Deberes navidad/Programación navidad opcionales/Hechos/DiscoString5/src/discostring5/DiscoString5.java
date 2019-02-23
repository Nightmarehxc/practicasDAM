//Ángel Cuevas Soriano
/*
5) Haz una aplicación que calcule el área de un círculo(pi*R2). 
El radio se pedirá por teclado (recuerda pasar de String a 
double con Double.parseDouble). Usa la constante PI y el método pow de Math.
 */
package discostring5;

import java.util.Scanner;
public class DiscoString5 {
    
      public static Scanner entrada = new Scanner(System.in);

      
      public static void calculo(double radio){
          
          double area=Math.PI*Math.pow(radio, 2);
  
        System.out.println("El area del circulo es "+area);
      }
      
      
      
    public static void main(String[] args) {

        System.out.println("Introduce el radio del circulo: ");
 
        double radio=entrada.nextDouble();
  
        calculo(radio);
        
    }
    
}
