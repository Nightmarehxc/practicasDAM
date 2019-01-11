/*Programa que valida los datos del ejercicio 1. La altura no puede ser
mayor que 250 cm y el edad no puede ser superior a 120 años.*/

import java.util.Scanner;

public class PesoIdeal {

    public static void main(String[] args) {

        //Declaración de variables
        double altura = 0;//Variable double para almacenar la altura en metros
        int edad = 0;//Variable entera para almacenar la edad
        double pesoIdeal = 0;//Variable double para almacenar el peso ideal
        double peso = 0;//Variable double para almacenar el peso en kgs

        Scanner sc = new Scanner(System.in);
        //Datos de teclado
        System.out.println("Indroduzca su altura en metros");
        altura = sc.nextDouble();
        altura = altura * 100;//Convertimos la altura en centímetros para usar en la fórmula
        System.out.println("Indroduzca su edad");
        edad = sc.nextInt();
        System.out.println("Indroduzca su peso en kgs");
        peso = sc.nextDouble();

        //Restricción de 250cm de altura y 120 años
        if (altura > 250 || edad > 120) {
            System.out.println("No puede medir mas de 2m 50cm o ser mayor de 120 años");
        } else
            //Calculamos datos e imprimimos resultados
            {
            pesoIdeal = ((altura - 100) + edad * 0.10) * 0.9;
            System.out.println("tu peso ideal es " + pesoIdeal);
            peso = pesoIdeal - peso;
            System.out.println("Deberias de ganar" + peso);
            }
    }
}
