/*Programa que pide una contraseña ya establecida hasta un máximo de 3 intentos.*/

import java.util.Scanner;

public class Contraseña {

    //Declaramos la contraseña como valor final
    final static String pass = "dam";

    public static void main(String[] args) {

        //Declaracion de variables
        Scanner sc = new Scanner(System.in);
        String intentos;//Variable string donde almacenar lo que introduce el usuario
        int errores = 0;//Variable entera para contar las veces que se introduce mal la contraseña

        //Bucle que pedira la contraseña al menos una vez y hasta un máximo de tres veces
        do {
            System.out.println("\nIntroduzca contraseña:");
            intentos = sc.nextLine();

            //Si la contraseña es correcta, informamos y se sale del bucle. Sino, se informa y se aumenta la variable errores.
            if (intentos.equals(pass)) {
                System.out.println("\nContraseña correcta.");
            } else {
                System.out.println("\nContraseña errónea.");
                errores++;

                if (errores == 3) {
                    System.out.println("\nNúmero de intentos máximos alcanzado.");
                }
            }
        } while ((errores != 3) && (!intentos.equals(pass)));
    }
}