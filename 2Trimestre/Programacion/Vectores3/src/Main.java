import java.util.ArrayList;
import java.util.Scanner;

public class Main {




    public static void main(String[] args) {
        int x;
        Producto productos[];
        Scanner sc = new Scanner(System.in);
        System.out.println("--Bienvenido a mi tienda de deportes --");

        System.out.println("Introduce el numero de articulos que quieres añadir");
        x = sc.nextInt();
        productos = new Producto[x];

        menuEntrada(productos, x);
        menuVenta(productos);
    }
    static void menuEntrada(Producto productos[], int x) {
        Scanner sc = new Scanner(System.in);

        System.out.println(productos.length);
///crear metodo para volver a usar este bucle
///Crear metodo para ventas....

        for (int i = 0; i < productos.length; i++) {

            System.out.println("Codigo producto: " +i);
            productos[i] = new Producto();
            productos[i].setCod(i);
            System.out.println("Introduce un nombre");
            productos[i].setName(sc.next());
            System.out.println(productos[i].name);
            System.out.println("Introduce el precio");
            productos[i].setPrice(sc.nextDouble());
            System.out.println("Introduce la cantidad en stock");
            productos[i].setStock(sc.nextInt());
        }

        ///Crear metodo para recogerDatos

        for (int i = 0; i < productos.length; i++) {
            System.out.println("Producto numero" + i);

            System.out.println(productos[i].getName());
            System.out.println(productos[i].price);
            System.out.println(productos[i].stock);

        }


    }

    static void menuVenta(Producto productos[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("----------Panel de ventas---------");
        System.out.println("Introduce el codigo del producto");
        int i = sc.nextInt();
        System.out.println(productos[i].getStock());
        System.out.println("Introduce el numero de " + productos[i].name + " a vender");
        productos[i].vender(sc.nextInt());
        System.out.println("Quedan " + productos[i].getStock() + " de " + productos[i].getName() + " en stock");


    }
}
