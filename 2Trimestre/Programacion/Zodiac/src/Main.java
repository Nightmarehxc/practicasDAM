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

    static int temp;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {

        System.out.println("Introduce el dia");
        dia = sc.nextInt();
        System.out.println("Introduce el mes");
        mes = sc.nextInt();
        calcularMes();

        System.out.println("Introduce el año");
        año = sc.nextInt();
        LocalDate fecha = LocalDate.of(año, mes, dia);
        System.out.println(fecha);
        fecha.getMonth();


    }
    public static void calcularMes()
    {
        switch (temp) {
            case 1:
                if ()
                {

                }
                mes = "January";
                break;
            case 2:
                mes = "February";
                break;
            case 3:
                mes = "March";
                break;
            case 4:
                mes = "April";
                break;
            case 5:
                mes = "May";
                break;
            case 6:
                mes = "June";
                break;
            case 7:
                mes = "July";
                break;
            case 8:
                mes = "August";
                break;
            case 9:
                mes = "September";
                break;
            case 10:
                mes = "October";
                break;
            case 11:
                mes = "November";
                break;
            case 12:
                mes = "December";
                break;
        }
    }
}
