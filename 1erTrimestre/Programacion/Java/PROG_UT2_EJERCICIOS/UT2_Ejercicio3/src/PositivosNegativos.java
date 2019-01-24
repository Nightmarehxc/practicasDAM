//Programa que cuenta los números positivos, negativos y ceros de una lista de números que se introducen por teclado.

import java.util.Scanner;

public class PositivosNegativos
{
    public static void main(String[] args)
    {
        //Declaración de variables
        Scanner sc = new Scanner(System.in);
        int a;//Variable donde almacenar los datos de entrada.
        int cPos = 0;//Contador de números positivos.
        int cNeg =0;//Contador de números negativos.
        int cNull =0;//Contador de ceros.

        //Bucle para pedir números por teclado
        System.out.println("Introduzca cinco números");

        for(int contador = 0; contador < 5; contador++)
        {
            a= sc.nextInt();
            //Si el número es mayor que 1, aumentamos el valor de la variable donde almacenamos los números positivos.
            if (a >= 1)
            {
                cPos = cPos +1;
            }
            else
            {
                //Si el número es igual a 0, aumentamos el valor de la variable donde almacenamos los Ceros.
                if (a == 0)
                {
                    cNull= cNull+ 1;
                }
                //Sino, aumentamos el valor de la variable donde almacenamos los números negativos.
                else
                {
                    cNeg = cNeg +1;
                }
            }
        }
        //Imprimimos resultados
        System.out.println("Positivos: "+ cPos);
        System.out.println("Negativos: "+ cNeg);
        System.out.println("Ceros: "+ cNull);
    }
}
