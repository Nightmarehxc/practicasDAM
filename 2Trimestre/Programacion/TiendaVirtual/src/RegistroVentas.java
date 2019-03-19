import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class RegistroVentas
{

    private static LocalDateTime fecha;
    private static ArrayList<Venta> listaVenta = new ArrayList<>();
    private static Venta venta;

    public static void crearVenta()
    {
        Scanner sc = new Scanner(System.in);
        int i = listaVenta.size()+1;
        listaVenta.add(i,venta);
        listaVenta.get(i).setCodProd(sc.nextInt());
        listaVenta.get(i).setPrecio(sc.nextInt());
    }
    public static void mostrarVentas()
    {

    }
}
