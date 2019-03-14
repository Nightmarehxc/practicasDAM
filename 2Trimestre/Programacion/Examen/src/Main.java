/// Autor Camarero Abella Daniel

import java.util.ArrayList;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        int lista[];
        int total=0;
        int sumaImpar=0;
        lista = new int[7];

        Scanner sc = new Scanner(System.in);
        boolean trigger = false;
        do{

        System.out.println("Menu de ventas de coches");
            System.out.println("1) Generar Array 1 +\n2)Mostrar Ventas \n 3) Mostrar ventas al reves\n4)Suma total de las ventas \n 5)Muestre las ventas totales de los dias impares\n6) Muestra el dia con menos ventas");
            int x= sc.nextInt();

            switch (x)
        {
            case 1:
                rellenar(lista);
                break;
            case 2:
                mostrar(lista);
                break;
            case 3:
                alReves(lista);
                break;
            case 4:
                suma(lista,total);
                break;
            case 5:
                sumaImpares(lista,sumaImpar);
                break;
            case 6:
                menosVentas(lista);
                break;
            case 9:
                trigger = true;
                System.out.println("Cerrando programa...");
                break;

        }

        }
        while (trigger == false );



    }
    static void rellenar(int lista[])
    {
        for (int i= 0; i < 7;i++)
        {
            lista[i]= (int) (Math.random()*10+1);
            System.out.println(lista[i]);
        }
    }
    static void mostrar(int lista[])
    {
        for (int i= 0 ; i < 7;i++)
        {

            System.out.println(lista[i]);
        }
    }
    static void alReves(int lista[])
    {
        for (int i= 7 ; i > 0;i++)
        {

            System.out.println(lista[i]);
        }
    }
    static void suma(int lista[],int total)
    {
        for(int i = 0; i < 7; i++)
        {
             total = total + lista[i];
        }
        System.out.println(total);
    }
    static void sumaImpares(int lista[],int sumaImpar)
    {
        for(int i = 0; i < 7;i++)
        {
            if((i%2)==0)
            {

            }
            else
                {
                    sumaImpar = lista[i] + sumaImpar;
                }
        }
        System.out.println(sumaImpar);
    }
    static void menosVentas(int lista[])
    {
        int menor = 10;
        for(int i = 0; i< 7;i++)
        {
            if(lista[i] < menor)
            {
                menor = lista[i];
                //System.out.println(i);


            }
        }
        System.out.println(menor);
        }
    ///End SumaImpares

}
