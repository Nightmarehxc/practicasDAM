import java.time.*;
import java.time.format.DateTimeFormatter;

public class Venta
{
    public static String hora;

    public static int cod;
    public static float precio;


    public Venta(int a_cod, float a_precio)
    {

        hora = gethora();
        cod = a_cod;
        precio = a_precio;
    }

    public static int getCod() {
        System.out.println("El código es: "+cod);
        return cod;
    }

    public static void setCod(int cod) {

        Venta.cod = cod;
    }

    public static float getPrecio()
    {
        System.out.println("El precio es: "+precio);
        return precio;
    }

    public static void setPrecio (float a_precio)
    {
        Venta.precio = a_precio;
    }

    public static String gethora()
    {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        hora = dtf.format(now);

        System.out.println(hora);

        return hora;
    }
    public void modYear(int a_year)
    {

        Year modAño = Year.of(a_year);

        System.out.println("El año ahora es:" +modAño);

    }


}
