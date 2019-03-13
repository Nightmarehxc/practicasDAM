import java.time.LocalTime;
import java.time.temporal.TemporalField;
import java.util.Scanner;

public class Main {


    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        DivideNumero divideNumero = new DivideNumero(sc.nextDouble(),sc.nextDouble());
        divideNumero.setResultado();
        System.out.println(divideNumero.getResultado());
        divideNumero.setFloor();
        System.out.println(divideNumero.getFloor());





        /*
/// Begin modMinutos
        Horario hora = new Horario();
        System.out.println(hora.getHoras());
        hora.getMinutos();
        hora.modificarMinutos(sc.nextInt());
        System.out.println(hora.getMinutos());
/// End modMinutos
*/


    }
}
