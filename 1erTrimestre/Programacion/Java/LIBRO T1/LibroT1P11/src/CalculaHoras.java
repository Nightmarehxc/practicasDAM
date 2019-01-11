import java.util.Scanner;

public class CalculaHoras
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        double hora = Math.ceil(t/3600);
        double min = Math.ceil((t - hora *3600 )/60);
        double seg = t - (hora *3600 + min *60);
        System.out.println(hora + "horas" + min + "minutos" + seg + "segundos")

    }

    }
