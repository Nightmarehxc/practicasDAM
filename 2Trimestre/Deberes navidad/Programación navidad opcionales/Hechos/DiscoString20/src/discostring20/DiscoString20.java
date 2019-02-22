//Ángel Cuevas Soriano
/*
20) Pide un número por teclado e indica si es un número primo o no. 
Un número primo es aquel solo puede dividirse entre 1 y si mismo. Por ejemplo: 
25 no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.
Un buen truco para calcular la raíz cuadrada del numero e ir comprobando que si 
es divisible desde ese numero hasta 1.
NOTA: Si se introduce un numero menor o igual que 1, directamente es no primo.
 */
package discostring20;

import java.util.Scanner;


public class DiscoString20 {

    //Scanner publico
     public static Scanner entrada = new Scanner(System.in);
     
    public static void main(String[] args) {
        System.out.println("Introduce un numero");
        int n = entrada.nextInt();
 
    
        if (n <= 1) {
            System.out.println("El numero " + n + " no es primo");
        } else {
 
           
            int raiz = (int) Math.sqrt(n);
            int contador = 0;
 
           
            for (int i = raiz; i > 1; i--) {
                if (n % i == 0) {
                    contador++;
                }
            }
 
      
            System.out.println(">>" + contador);
 
            if (contador < 1) {
                System.out.println("El numero " + n + " es primo");
            } else {
                System.out.println("El numero " + n + " no es primo");
            }
    }
    
}
}
