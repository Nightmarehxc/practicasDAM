import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
       Empleados e1 = new Empleados();
       //Empleados e1 = new Empleados(sc.next(),sc.nextInt(),sc.next(),sc.next());

        //Empleados e2 = new Empleados("HilLtop Road",12,"","Hilltop");
        ArrayList<Empleados> listaEmpleados = new ArrayList<>();


        listaEmpleados.add(0,e1);
        listaEmpleados.get(0).setNombre(sc.next());
        System.out.println(listaEmpleados.get(0).getNombre());

        /*e1.setNombre(sc.next());
        e1.setSalario(sc.nextDouble());


        System.out.println("Empleado: "+e1.getNombre()+" Salario: "+e1.getSalario());
        System.out.println(e1.getCalle()+"Numero: "+e1.getNumero()+"Puerta: "+e1.getPuerta()+"Ciudad: "+e1.getCiudad());

        e2.setNombre(sc.next());
        e2.setSalario(sc.nextDouble());


        System.out.println("Empleado: "+e2.getNombre()+" Salario: "+e2.getSalario());
        System.out.println(e2.getCalle()+"Numero: "+e2.getNumero()+"Puerta: "+e2.getPuerta()+"Ciudad: "+e2.getCiudad());

*/
    }


}
