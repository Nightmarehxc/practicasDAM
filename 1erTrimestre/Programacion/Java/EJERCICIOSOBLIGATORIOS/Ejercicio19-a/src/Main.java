/*Programa que genera 10 números a través de un bucle for.
* Rompemos el bucle cuando llega a 5*/

public class Main {

    public static void main(String[] args)
    {
        //Bucle que muestra los números mientras se cumpla la condición while (menor que 10)
        for (int i = 1; i < 10; i++)
        {
            System.out.println(i);

            //Apartado A; rompemos el bucle si se cumple la condición

            if(i == 5)
            {
                break;
            }

        }

    }
}
