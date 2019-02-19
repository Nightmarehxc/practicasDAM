import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class RegistroVentasDiaria
{
    ArrayList<Venta> listaVentas = new ArrayList<Venta>();
    ArrayList<Integer> listaCodProd = new ArrayList<Integer>();
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    static int nVentas=1;
    int ventasPopulares[] = new int[11];////////////////////0,1,2,3,4,5,6,7,8,9,10
    Scanner scanner = new Scanner(System.in);
    public static Venta nuevaVenta[] = new Venta[nVentas];

    public RegistroVentasDiaria()

    {

    }
    void crearVenta()
    {
        for (int i=0; i < nuevaVenta.length; i++ )
        {
            System.out.println("Introduce  el codigo y el precio");
            nuevaVenta[i] = new Venta(scanner.nextInt(),scanner.nextFloat());

            switch (nuevaVenta[i].cod)
            {
                case 0:
                    ventasPopulares[i] = ventasPopulares[i]+1;
                    break;
                case 1:
                    ventasPopulares[i] = ventasPopulares[i]+1;
                    break;
                case 2:
                    ventasPopulares[i] = ventasPopulares[i]+1;
                    break;
                case 3:
                    ventasPopulares[i] = ventasPopulares[i]+1;
                    break;
                case 4:
                    ventasPopulares[i] = ventasPopulares[i]+1;
                    break;
                case 5:
                    ventasPopulares[i] = ventasPopulares[i]+1;
                    break;
                case 6:
                    ventasPopulares[i] = ventasPopulares[i]+1;
                    break;
                case 7:
                    ventasPopulares[i] = ventasPopulares[i]+1;
                    break;
                case 8:
                    ventasPopulares[i] = ventasPopulares[i]+1;
                    break;
                case 9:
                    ventasPopulares[i] = ventasPopulares[i]+1;
                    break;
                case 10:
                    ventasPopulares[i] = ventasPopulares[i]+1;
                    break;
            }
            System.out.println("Nueva venta creada");
            boolean confirmarVenta=true;
        }

        nVentas++;
    }
    void imprimirRegistroVentas()
    {
        for(int i=0;i < nuevaVenta.length;i++)
        {
            nuevaVenta[i].gethora();
            nuevaVenta[i].getCod();
            nuevaVenta[i].getPrecio();
        }
    }
    static void buscarVenta(int codigoBusqueda)
    {
        int i=0;
        for (i=0;(i<nVentas)||(nuevaVenta[i].cod!=codigoBusqueda);i++){
            if (nuevaVenta[i].cod==codigoBusqueda){
                System.out.println("La posición en la que está el producto es en la: "+i);
            }
        }
    }
}
