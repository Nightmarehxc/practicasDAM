//Ángel Cuevas Soriano
/*
16) Escribe una aplicación con un String que contenga una contraseña cualquiera.
Después se te pedirá que introduzcas la contraseña, con 3 intentos. 
Cuando aciertes ya no pedirá mas la contraseña y mostrara un mensaje diciendo 
“Enhorabuena”. Piensa bien en la condición de salida (3 intentos y si acierta 
sale, aunque le queden intentos).
 */
package discostring16;

import java.util.Scanner;


public class DiscoString16 {

    //Scanner publico
     public static Scanner entrada = new Scanner(System.in);
     
    public static void main(String[] args) {
   
        String contraseña="1234";
        int intentos = 3;
  

         
        for (int i = 1; i <= intentos; i++) {
            
            System.out.println("Introduce una contraseña");
          String contraseñausu = entrada.next();
            if (contraseñausu.equals(contraseña)){
                System.out.println("Enhorabuena");
                i=3;
              } 
            if (!contraseñausu.equals(contraseña)) {
                System.out.println("La contraseña es incorrecta, intentelo de nuevo:");
            }
        }
            
  }   
}
