import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class RegistroVentasDiaria
{
    ArrayList<Float> listaVentas = new ArrayList<Float>();
    ArrayList<Integer> listaCodProd = new ArrayList<Integer>();
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    int nVentas=1;
    Scanner scanner = new Scanner(System.in);
    Venta nuevaVenta[] = new Venta[nVentas];

    public RegistroVentasDiaria()
    {

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
    }



}
