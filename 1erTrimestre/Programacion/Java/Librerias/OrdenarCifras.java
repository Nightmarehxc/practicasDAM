import java.util.Scanner;

public class OrdenarCifras
{
    public static void main(String[] args)
    {
        //Declaración de variables. En el primer momento, todas valen lo mismo.
        int actual=0; //Variable entera donde almacenamos el número actual introducido.
        int mayor = actual; //Variable entera donde almacenamos el número mayor.
        int menor = actual; //Variable entera donde almacenamos el número menor.

        //Datos por teclado
        System.out.println(("Introduzca 10 números: "));
        Scanner sc = new Scanner(System.in);

        //Bucle para pedir los 10 números
        for ( int i = 0 ; i < 10; i++)
        {
            actual = sc.nextInt();

            //Si el número actual es mayor que el anterior, entonces éste será el nuevo mayor.
            if (actual > mayor)
            {
                mayor=actual;
            }
            //Sino, será el menor
            else if(actual< menor)
            {
                menor=actual;
            }
        }
        //Imprimimos resultados
        System.out.println("El número mayor es: "+mayor+" \nEl número menor es: "+menor);
    }