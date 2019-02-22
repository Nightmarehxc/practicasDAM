//Ángel Cuevas Soriano
/*
Escribe un programa el cual cuando le inroduzcas un día de la semana te 
devuelva su posicion.
 */
package ejercicio11modificado;

import java.util.Scanner;

public class Ejercicio11Modificado {

    //Scanner publico
   public static Scanner entrada= new Scanner(System.in);
    
   public static void Lunes(){
      System.out.println("El lunes es el primer dia de la semana: ");  
   }
    
   public static void Martes(){
      System.out.println("El martes es el segundo dia de la semana: "); 
   }
   
   public static void Miercoles(){
       System.out.println("El miercoles es el tercer dia de la semana: ");
   }
   
   public static void Jueves(){
        System.out.println("El jueves es el cuarto dia de la semana: ");
   }
   
   public static void Viernes(){
        System.out.println("El viernes es el quinto dia de la semana: ");
   }
   
   public static void Sabado(){
        System.out.println("El sabado es el sexto dia de la semana: ");
   }
   
   public static void Domingo(){
         System.out.println("El dominigo es el septimo dia de la semana: ");
   }
   
   
    public static void main(String[] args) {
        
      System.out.println("Por favor introduzca un dia de la semana: ");
    String dia=entrada.nextLine();
    
      if ("lunes".equals(dia)){
       Lunes();
       } 
      
    if ("martes".equals(dia)){
        Martes();
    } 
    
     if ("miercoles".equals(dia)){
       Miercoles(); 
    }    
     
    if ("jueves".equals(dia)){
       Jueves();
         }     
    
    if ("viernes".equals(dia)){
       Viernes();
        
    }     
   if ("sabado".equals(dia)){
       Sabado();
        
    } 
   if ("domingo".equals(dia)){  
       Domingo();
    } 
   
    }
    
}
