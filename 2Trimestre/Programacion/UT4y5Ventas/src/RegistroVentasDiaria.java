import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

@SuppressWarnings("SyntaxError")
public class RegistroVentasDiaria {
    //ArrayList<Venta> listaVentas = new ArrayList<Venta>();
    //ArrayList<Integer> listaCodProd = new ArrayList<Integer>();
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    static int nVentas = 0;
    int ventasPopulares[] = new int[11];////////////////////0,1,2,3,4,5,6,7,8,9,10
    static Scanner scanner = new Scanner(System.in);
    static Venta [] listaVentas = new Venta[nVentas];
    static ArrayList<Venta>  lVentas = new ArrayList<Venta>();
    static int i=1;

    public RegistroVentasDiaria() {

    }

    public static void crearVenta()
    {
        System.out.println("Venta numero "+ nVentas);
        System.out.println("Introduce  el codigo de producto");
        int a_cod = scanner.nextInt();
        System.out.println("Introduce  el precio");
        float a_price = scanner.nextFloat();
        System.out.println("Confirmar Venta\nS)Confirmar\n N)Cancelar)");


        switch (scanner.next()) {

            case "s":
                 nVentas = lVentas.size();

                System.out.println(nVentas);
                lVentas.add(
                        new Venta(a_cod,a_price));
                System.out.println(lVentas.get(nVentas));

/*

                nVentas++;
                i=nVentas;
                listaVentas[nVentas] = new Venta(a_cod, a_price);
                System.out.println(listaVentas.length);
                System.out.println("Venta"+i+ "creada satisfactoriamente");
*/
                break;

            case "n":
                System.out.println("Venta cancelada");
                break;
        }
               /* ///Metodo para gestionar la popularidad
                switch (listaVentas[i].cod)
                {
                    case 0:
                        ventasPopulares[i] = ventasPopulares[i] + 1;f
                        break;
                    case 1:
                        ventasPopulares[i] = ventasPopulares[i] + 1;
                        break;
                    case 2:
                        ventasPopulares[i] = ventasPopulares[i] + 1;
                        break;
                    case 3:
                        ventasPopulares[i] = ventasPopulares[i] + 1;
                        break;
                    case 4:
                        ventasPopulares[i] = ventasPopulares[i] + 1;
                        break;
                    case 5:
                        ventasPopulares[i] = ventasPopulares[i] + 1;
                        break;
                    case 6:
                        ventasPopulares[i] = ventasPopulares[i] + 1;
                        break;
                    case 7:
                        ventasPopulares[i] = ventasPopulares[i] + 1;
                        break;
                    case 8:
                        ventasPopulares[i] = ventasPopulares[i] + 1;
                        break;
                    case 9:
                        ventasPopulares[i] = ventasPopulares[i] + 1;
                        break;
                    case 10:
                        ventasPopulares[i] = ventasPopulares[i] + 1;
                        break;
                }*/
    }


    void imprimirRegistroVentas()
    {
        for(i=0;i < lVentas.size();i++) {

            lVentas.get(i).getCod();
            lVentas.get(i).getPrecio();
        }
        /*System.out.println("Nº de ventas: " + listaVentas.length);
        for (int i = 0; i < listaVentas.length; i++)
        {
            System.out.println("Numero de venta" + i);
            listaVentas[i].gethora();
            listaVentas[i].getCod();
            listaVentas[i].getPrecio();
        }*/
    }

    static void buscarVenta(int codigoBusqueda) {

        for (int i = 0; (i < nVentas) || (lVentas.get(i).getCod() != codigoBusqueda); i++) {
            if (lVentas.get(i).getCod() == codigoBusqueda) {
                System.out.println("La posición en la que está el producto es en la: " + i);
            }
        }
    }

    static int buscaProductoEstrella(Venta [] listaVentas)
    {
        int i;
        int productoEstrella = 0;

        for (i=0;i<listaVentas.length;i++){

            productoEstrella = listaVentas[i].cod;

        }

        return productoEstrella;
    }

    static void modAño(int a_cod)
    {
        System.out.println("Indroduce el año a modificar");
        listaVentas[a_cod].modYear(scanner.nextInt());

    }

}
