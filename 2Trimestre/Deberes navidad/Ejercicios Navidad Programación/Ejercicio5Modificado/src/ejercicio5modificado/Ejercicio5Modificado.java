//Ángel Cuevas Soriano
/*
Escribe un programa con un menú que  calcule según  la opción 
seleccionada por el usuario:
1. Suma de dos numeros .
2. Resta de dos numeros. 
3. multiplicacion de un numero.
4.Division de dos numeros.
5.Resto de la division de dos numeros.
El programa debe repetirse mostrando de nuevo el menú hasta que el usuario 
seleccione la opción 6.
Fin
 */
package ejercicio5modificado;
import java.util.Scanner;
public class Ejercicio5Modificado {

    //Scanner publico
    public static Scanner entrada=new Scanner(System.in);
    
    public static void Suma(){
        System.out.println("Escribe dos numeros para realizar la operacion:");
         int a= entrada.nextInt();
          int b= entrada.nextInt();
          
         int resultado=a+b;
         System.out.println("La solucion es: "+resultado);
    }
    
     public static void Resta(){
         System.out.println("Escribe dos numeros para realizar la operacion:");
         int a= entrada.nextInt();
          int b= entrada.nextInt();
          
         int resultado=a-b;
         System.out.println("La solucion es: "+resultado);
    }
    
     public static void Multiplicacion(){
         System.out.println("Escribe dos numeros para realizar la operacion:");
         int a= entrada.nextInt();
          int b= entrada.nextInt();
          
         int resultado=a*b;
         System.out.println("La solucion es: "+resultado);
    }
     
      public static void Division(){
         System.out.println("Escribe dos numeros para realizar la operacion:");
         int a= entrada.nextInt();
          int b= entrada.nextInt();
          
         int resultado=a/b;
         System.out.println("La solucion es: "+resultado);
    }
      
       public static void Modulo(){
         System.out.println("Escribe dos numeros para realizar la operacion:");
         int a= entrada.nextInt();
          int b= entrada.nextInt();
          
         int resultado=a%b;
         System.out.println("La solucion es: "+resultado);
    }
       
        public static void Fin(){
            System.out.println("Fin del programa.");
    }
        
        
    public static void main(String[] args) {
          int select=0;
           System.out.println("Bienvenido al menú de este Programa, escribe por teclado para realizar la opción seleccionada ");
        do{
  
   System.out.println("Escribe 1 para calcular la suma de dos numeros: ");
   System.out.println("Escribe 2 para calcular la resta de dos numeros: ");
   System.out.println("Escribe 3 para multiplicacion de dos numeros: ");
   System.out.println("Escribe 4 para calcular la division de dos numeros: ");
   System.out.println("Escribe 5 para calcular el resto de una division: ");
   System.out.println("Escribe 6 para finalizar el programa: ");

        select = entrada.nextInt();
       
        if (select==1) {
            Suma();
        }
   
   if (select==2) {
            Resta();
        }
   
   if (select==3) {
            Multiplicacion();
        }
   
   if (select==4) {
            Division();
        }
   
   if (select==5) {
            Modulo();
        }
   
   if (select==6) {
            Fin();
        }
   
   }while(select!=6);
           
    }
    
}
