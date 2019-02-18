import org.omg.CORBA.PUBLIC_MEMBER;

public class Main
{

    public static void main(String[] args)
    {
        System.out.println("Introduce 1)Para crear venta");

        RegistroVentasDiaria rv = new RegistroVentasDiaria();
        rv.crearVenta();
        rv.imprimirRegistroVentas();

        System.out.println("Hello World!");

    }


}
