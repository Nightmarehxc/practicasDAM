//Ángel Cuevas Soriano
/*
17) Crea una aplicación que nos pida un día de la semana y que nos diga si es un
dia laboral o no. Usa un switch para ello.
 */
package discostring17;

import java.util.Scanner;

public class DiscoString17 {

  //Scanner publico
     public static Scanner entrada = new Scanner(System.in);
     
     
    public static void main(String[] args) {
      System.out.println("Introduce un dia de la semana");
        String dia = entrada.next();
         
       Condicion(dia);
    }
    

    public static void Condicion(String dia){
         switch(dia){  
            case "lunes":
            case "martes":
            case "miercoles":
            case "jueves":
            case "viernes":
                System.out.println("Es un dia laboral");
                break;
            case "sabado":
            case "domingo":
                System.out.println("Es un dia festivo");
            default:
                System.out.println("Introduce un dia de la semana");
       }
}
}