import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
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

    public static float getPrecio() {
        System.out.println("El precio es: "+precio);
        return precio;
    }

    public static void setPrecio(float precio) {
        Venta.precio = precio;
    }

    public static String gethora()
    {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        hora = dtf.format(now);
        System.out.println(hora);


        return hora;
    }
    public void modYear(String a_year)
    {



        for ( int i=0;i<4;i++)
        {

            for(int j=0;j<4;j++) {
                hora.charAt(i) =
            }
        }
    }


}
