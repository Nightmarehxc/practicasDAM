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
        menuPrincipal(productos,x);
////Termina el primer arranque
        //menuEntrada(productos, x);
        //menuVenta(productos);
    }
    static void menuPrincipal(Producto productos[],int x)
    {
        Scanner sc = new Scanner(System.in);

        boolean t=false;

        while (t == false){
            System.out.println("1) Crear item\n 2) Menu de Ventas \n cerrar) Cierra la aplicacion ");
            System.out.println();
            String input = sc.next();
            switch (input) {
                case "1":
                    menuEntrada(productos, x);
                    break;
                case "2":
                    menuVenta(productos);
                    break;
                case "cerrar":
                    t = true;
                    break;
            }
        }


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
        for (int j = 0 ; j< productos.length;j++)
        {
            System.out.println("Cod.Producto: "+j+" Nombre: "+productos[j].getName()+" Stock: "+productos[j].getStock());
        }
        System.out.println("Introduce el codigo del producto");
        int i = sc.nextInt();
        //System.out.println(productos[i].getStock());
        System.out.println("Introduce el numero de " + productos[i].name + " a vender");
        productos[i].vender(sc.nextInt());
        System.out.println("Quedan " + productos[i].getStock() + " de " + productos[i].getName() + " en stock");


    }
}
