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
    int nVentas=1;
    Scanner scanner = new Scanner(System.in);
    Venta nuevaVenta[] = new Venta[nVentas];

    public RegistroVentasDiaria()

    {
<<<<<<< HEAD

    }
    void crearVenta()
    {
        for (int i=0; i < nuevaVenta.length; i++ )
        {
            nuevaVenta[i] = new Venta(scanner.nextInt(),scanner.nextFloat());
            System.out.println("Nueva venta creada");
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
=======
        Venta.gethora();
>>>>>>> b996dec465675a4834c74e41f5a3074eb361d5d2
    }



}
