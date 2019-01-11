/* programa en Java que lee 6 enteros y que calcule la media.*/

import java.util.Scanner;

public class CalculaMedia
{
    public static void main(String[] args)
    {

        //Declaración de variables
        int medidor;//Variable entera que indica la cantidad de numeros que se van a obtener por teclado.
        int suma =0; //Variable entera donde almacenamos la suma de los números introducidos.
        int a=0; //Variable contenedor para guardar los numeros que se van introduciento.
        int media=0;//Variable para almacenar el resultado de la media.

        //Datos de teclado
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce la cantidad de números a introducir ");
        medidor= in.nextInt();

        //Bucle para obtener los números por teclado y hallar su suma.
        for(int i = 0; i < medidor;i++)
        {
            System.out.println("Introduce un número");
            a = in.nextInt();
            suma = suma + a;
        }
        //Calculamos la media
        media = suma/medidor;
        //Imprimimos resultados
        System.out.println("La media es: " +media);

    }

}
