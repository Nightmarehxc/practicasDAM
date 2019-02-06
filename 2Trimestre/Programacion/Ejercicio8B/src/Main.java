public class Main
{
    public static void main(String[] args)
    {
        Nevera frigorifico = new Nevera("5",10.0f,false,1.1f,1.1f);
        System.out.println("La temperatura es: "+frigorifico.temp+"ºC" );
        System.out.println("El ancho es: "+frigorifico.sizeX+"");
        System.out.println("El ancho es: "+frigorifico.sizeY+"");
        frigorifico.cDoorState();
        frigorifico.abrirPuerta();
        frigorifico.cDoorState();
        frigorifico.cerrarPuerta();
        frigorifico.cDoorState();
        System.out.println("El ancho es: "+frigorifico.sizeX+"");
    }
}
