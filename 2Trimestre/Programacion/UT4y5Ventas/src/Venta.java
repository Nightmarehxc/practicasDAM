import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Venta
{
    public static void gethora()
    {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));
    }
}
