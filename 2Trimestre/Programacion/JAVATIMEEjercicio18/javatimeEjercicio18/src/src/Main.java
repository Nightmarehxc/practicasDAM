package src;

import jdk.nashorn.internal.ir.IfNode;

import java.sql.SQLOutput;
import java.time.*;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿En qué año naciste?");
        int ano = sc.nextInt();
        System.out.println("¿En qué més naciste?");
        String imiento = sc.next();
        Month nac = Month.valueOf(imiento);
        System.out.println("¿En qué día naciste?");
        int dada = sc.nextInt();
        LocalDate date = LocalDate.of(ano, nac, dada);
        DayOfWeek dia = date.getDayOfWeek();
        LocalDate today = LocalDate.now();
        System.out.println("El día que nací fue el " + date + " y era un " + dia);
        System.out.println(today);
        Period uno = Period.between(date, today);
        System.out.println(uno.getYears() + " años");
        System.out.println(uno.getMonths() + " meses");
        System.out.println(uno.getDays() + " días");
        long days = ChronoUnit.DAYS.between(date, today);
        System.out.println(days + " total de días vividos");
        System.out.println("el año en que pude empezar a conducir fue" + date.plusYears(18));
        int mes = sc.nextInt();
        String estacion;
        if (mes == 12 || mes == 1 || mes == 2)
            estacion = "INVIERNO";
        else if (mes == 3 || mes == 4 || mes == 5)
            estacion = "PRIMAVERA";
        else if (mes == 6 || mes == 7 || mes == 8)
            estacion = "VERANO";
        else if (mes == 9 || mes == 10 || mes == 11)
            estacion = "OTONO";
        else
            estacion = "ERROR";
        if (mes >= 1 && mes <=12)
            System.out.println("El mes pertenece a la estacion " + mes+ " " + estacion);

            }


        }


