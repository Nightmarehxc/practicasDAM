import java.util.Scanner;

public class MostrarNumeroAlReves {

    public static void main(String[] args) {

        //Declaración de variables
        int numero;
        String numeroString;
        StringBuffer numeroStringBuffer, numeroAlReves;


        Scanner sc= new Scanner(System.in);
        System.out.println("Introduzca un número:");
        numero=sc.nextInt();

        numeroString=String.valueOf(numero); //Convertimos el numero a String
        numeroStringBuffer = new StringBuffer(numeroString); //Convertimos el número a StringBuffer

        numeroAlReves = numeroStringBuffer.reverse(); //Efectuamos el método reverse de StringBuffer

        System.out.println("El número invertido es: "+numeroAlReves); //Imprimimos resultados


        if ((numeroString).equals(numeroAlReves.toString())){ //Comprobamos si es capicúa

            System.out.println("\nEl número "+numero+ " es capicúa");
        }

    }
}