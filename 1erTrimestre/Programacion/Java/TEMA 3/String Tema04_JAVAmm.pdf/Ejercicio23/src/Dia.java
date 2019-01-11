import java.util.Scanner;

public class Dia
{

    public static int getTypeOfDayWithSwitchStatement() {
        String dayOfWeekArg;
        String typeOfDay="";
        Scanner sc = new Scanner(System.in);

        int dia = 0;
        System.out.println("Introduce el dia de la semana");

        dayOfWeekArg = sc.nextLine();

        switch (dayOfWeekArg) {
            case "Lunes":
                dia = 1;
                break;
            case "Martes":
                dia = 2;
                break;
            case "Miercoles":
                typeOfDay = "En medio de la semana";
                dia = 3;
                break;
            case "Jueves":
                dia = 4;
                break;
            case "Viernes":
                dia = 5;
                break;
            case "Sabado":
                typeOfDay = "Fin de semana";
                dia = 6;
                break;
            case "Domingo":
                typeOfDay = "Fin de semana";
                dia = 7;
                break;
            default:
                throw new IllegalArgumentException("No es un dia de la semana valido " + dayOfWeekArg);
        }
        System.out.println("El dia de la semana es: " + dia+" Tipo de dia: "+typeOfDay);
        return 0;
    }

}
