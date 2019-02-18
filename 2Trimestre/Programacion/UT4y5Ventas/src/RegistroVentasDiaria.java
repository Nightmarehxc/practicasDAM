import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class RegistroVentasDiaria
{
    ArrayList<Venta> listaVentas = new ArrayList<Venta>();
    ArrayList<Integer> listaCodProd = new ArrayList<Integer>();
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");


    public RegistroVentasDiaria()

    {
        Venta.gethora();
    }



}
