//Ángel Cuevas Soriano
/*
Escribe un programa que lea una temperatura de teclado y diga el deporte 
apropiado según los siguientes criterios:
 */
package ejercicio14modificado;

import java.util.Scanner;

public class Ejercicio14Modificado {

public static void Deporte(int t){
    
 if(t>30){
    

 System.out.println("Natación");
}
 else if (t>15 || t<30){
System.out.println("Golf");
 }
 
 else  if (t>5 || t<15){
  
System.out.println("Tenis");
}
  
 else if (t>-10 || t<5){
  
System.out.println("Esquí"); 
         }
         
    else if (t<-10){
  
System.out.println("Damas");
    }
}

 public static void main(String[] args){
        
 System.out.println("Escribe por teclado el valor de temperatura para asignar un deporte");
     Scanner entrada = new Scanner(System.in);
    int t = entrada.nextInt();
    
    Deporte(t);
}


     }
    

  
