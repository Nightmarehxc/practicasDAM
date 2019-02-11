import java.sql.Time;
import java.text.SimpleDateFormat;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Date;
import java.util.Scanner;


public class Main
{
    static int dia;
    static int mes;
    static int año;
    static LocalDate fecha = LocalDate.of(año, mes, dia);
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {

        System.out.println("Introduce el dia");
        dia = sc.nextInt();
        System.out.println("Introduce el mes");
        mes = sc.nextInt();
        System.out.println("Introduce el año");
        año = sc.nextInt();

        SimpleDateFormat formato = new SimpleDateFormat(fecha.toString());







    }
}
