//Ángel Cuevas Soriano
/*
14) Realiza una aplicación que nos calcule una ecuación de segundo grado. Debes 
pedir las variables a, b y c por teclado y comprobar antes que el discriminante
(operación en la raíz cuadrada). Para la raíz cuadrada usa el método sqlrt de 
Math. Te recomiendo que uses mensajes de traza.
 */
package discostring14;

import java.util.Scanner;


public class DiscoString14 {

   //Scanner publico
     public static Scanner entrada = new Scanner(System.in);
     
    public static void main(String[] args) {
        
        System.out.println("Vamos a calcular una ecuación de segundo grado.");
        System.out.println("Introduce el valor de a");
        int a=entrada.nextInt();
        System.out.println("Introduce el valor de b");
        int b=entrada.nextInt();
        System.out.println("Introduce el valor de c");
        int c=entrada.nextInt();
        
        operaciones(a,b,c);
    }
    
    public static void operaciones(int a, int b, int c){
        
        //calculamos el discriminante antes de realizar la ecuacion
         double discriminante=Math.pow(b, 2)-(4*a*c);
  
        System.out.println(">>"+discriminante);
  
        if (discriminante>0){
            //operamos la ecuacion de segundo grado
            double x1=((b*(-1))+Math.sqrt(discriminante))/(2*a);
            double x2=((b*(-1))-Math.sqrt(discriminante))/(2*a);
  
            System.out.println("El valor de x1 es "+x1+" y el valor de x2 es "+x2);
        }else{
            System.out.println("El discriminante es negativo y por tanto no existe solucion real.");
        }
    }
    
}
