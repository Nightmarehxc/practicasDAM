
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dam
 */
public class JavaEjercicioP5 {
    public static void main(String[] arg) {
        
       Scanner sn = new Scanner(System.in);
       boolean salir = false;
       int opcion, t, c, f; //Guardaremos la opcion del usuario
       Scanner sc= new Scanner(System.in);
       System.out.println("Introducir número: ");
       t= sc.nextInt();
       c= t*9/5+32;
       f= (t-32)* 5/9;
       while(!salir){
            
           System.out.println("Grados a Fahrenheit");
           System.out.println("Fahrenheit a Grados");
           System.out.println("Salir");
           System.out.println("Escribe una de las opciones:");
           opcion = sn.nextInt();
           
           switch(opcion){
                case 1:
                    System.out.println("Has seleccionado Grados a Fahrenheit");
                    System.out.println("Los "+t+"ºC son "+c+"ºF");
                    break;
                case 2:
                    System.out.println("Has seleccionado Fahrenheit a Grados");
                    System.out.println("Los "+t+"ºF son "+f+"ºC");
                    break;
                case 3:
                    salir=true;
                    break;
           }
       }      
        
    }
}
