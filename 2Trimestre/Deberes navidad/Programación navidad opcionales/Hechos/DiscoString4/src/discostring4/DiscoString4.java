//Ángel Cuevas Soriano
/*
4)Modifica la aplicación anterior, para que nos pida el nombre que queremos
introducir (recuerda usar JOptionPane).
 */
package discostring4;

import java.util.Scanner;


public class DiscoString4 {
    
   //Scanner publico
public static Scanner entrada= new Scanner(System.in);
 
    public static void main(String[] args) {
        System.out.println("Introduzca el nombre del usuario: ");
         String nombre= entrada.nextLine();
 
        System.out.println("Bienvenido "+nombre);
    }
    
}
