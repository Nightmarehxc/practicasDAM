////AUTOR CAMARERO ABELLA DANIEL
import com.sun.org.apache.xpath.internal.operations.Or;

import java.io.BufferedOutputStream;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
    static Scanner sc = new Scanner(System.in);
    static Portatil p1;
    static Portatil p2;
    static Servidor s1;
    static Servidor s2;

    public static void main(String[] args) {

        System.out.println("Creamos portatil a mano");
        crearPortatil();  /// punto 5
        System.out.println("Creamos servidor a mano");
        crearServidor();  /// punto 6

        ///PUNTO 8
        ///Inicio LISTA PC
        ArrayList<Ordenador> listaPcs = new ArrayList<>();
        listaPcs.add(new Portatil(15, 1024,"Intel", "Nvidia gt-1050", 500, "intel", 200.0f, 17.0f));
        listaPcs.add(new Portatil(20, 512,"Intel", "Nvidia gt-1060", 200, "amd", 100.0f, 18.0f));
        listaPcs.add(new Servidor(20418, 512,"Intel", "amd", 500.f, 17.5f, "logi", "Tech"));
        listaPcs.add(new Servidor(1418, 2512,"Intel", "GPU", 500.f, 15.5f, "logi", "Tech"));
        listaPcs.add(p1);
        listaPcs.add(p2);
        listaPcs.add(s1);
        listaPcs.add(s2);

        for (int i = 0; i < listaPcs.size(); i++) {
            listaPcs.get(i).mostrarValores();
        }
        ///END LISTA PC
        ///END punto8


    }

    static void crearPortatil() {
        int i_ram;
        float i_price;
        String i_cpu = null;

        boolean t_ram;
        do {
            System.out.println("Introduce la ram, deberia ser multiplo de 5");
            i_ram = sc.nextInt();
            if (i_ram % 5 == 0) {
                System.out.println(i_ram + " SI es múltiplo de " + 5);
                t_ram = true;
            } else {
                System.out.println(i_ram + " NO es múltiplo de 5\n" +
                        "Introduce otro numero");
                i_ram = sc.nextInt();
                t_ram = false;
            }
        } while (t_ram = false);

        ArrayList<Procesador> marcaCPU = new ArrayList();
        marcaCPU.add(new Procesador("Intel"));
        marcaCPU.add(new Procesador("AMD"));
        boolean t_marca = false;
        do {
            System.out.println("Selecciona la marca\n" +
                    "1)" + marcaCPU.get(0).getMarca() + "\n" +
                    "2)" + marcaCPU.get(1).getMarca());
            int marcaSelector = sc.nextInt() - 1;
            if (marcaSelector == 0) {
                i_cpu = marcaCPU.get(0).getMarca();
                t_marca = true;
            }
            if (marcaSelector == 1) {
                i_cpu = marcaCPU.get(1).getMarca();
                t_marca = true;
            }
        } while (t_marca == false);
        boolean t_price = false;
        do {
            System.out.println("introduce el precio");
            i_price = sc.nextFloat();
            if (i_price > 0) {
                t_price = true;
            }


        } while (t_price = false);
        p1 = new Portatil(i_ram, 1024,i_cpu,"Nvidia gt-1050", i_price,  "Toshiba",200.0f, 17.5f);
        p2 = new Portatil(i_ram, 1024,i_cpu, "Nvidia gt-1050", i_price, "HUAWEI", 250.0f, 18.5f);


    }

    static void crearServidor() {
        float i_pantalla = 0;
        boolean t_pantalla = false;
        do {
            System.out.println("Introduce el tamaño de la pantalla.\n" +
                    "Debe ser mayor de 15 pulgadas");
            i_pantalla = sc.nextFloat();
            try {


                if (i_pantalla > 15) {
                    t_pantalla = true;
                } else if (i_pantalla <= 15) {
                    System.out.println("Debe ser mayor a 15\"!!!");
                }


            } catch (InputMismatchException e) {
                System.out.println("Debe ser mayor a 15\"!!!");
            }


        } while (t_pantalla == false);
        s1 = new Servidor(20418, 512,"Intel", "amd", 500.f, i_pantalla, "logi", "Tech");
        s2 = new Servidor(20418, 512,"AMD", "amd", 777.f, i_pantalla, "logi", "Trust");
        s1.mostrarValores();
        s2.mostrarValores();
    }

}
