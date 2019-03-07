import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {

        System.out.println("--Bienvenido a mi tienda de deportes --");

        System.out.println("Introduce el numero de articulos que quieres añadir");
        int x = sc.nextInt();
        Producto[] productos = new Producto[x];
///crear metodo para volver a usar este bucle
///Crear metodo para ventas....

        for ( int i = 0 ; i < x;i++)
        {

            System.out.println("Codigo producto: "+i);
            productos[i]= new Producto();
            productos[i].setCod(i);
            System.out.println("Introduce un nombre");
            productos[i].setName(sc.next());
            System.out.println("Introduce el precio");
            productos[i].setPrice(sc.nextDouble());
            System.out.println("Introduce la cantidad en stock");
            productos[i].setStock(sc.nextInt());
        }

        ///Crear metodo para recogerDatos

        for (int i = 0; i < productos.length;i++)
        {
            System.out.println("Producto numero" + i);
            System.out.println(productos[i].name);
            System.out.println(productos[i].price);
            System.out.println(productos[i].stock);

        }


    }
}
