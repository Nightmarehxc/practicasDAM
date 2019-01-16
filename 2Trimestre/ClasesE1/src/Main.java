public class Main
{
    public static void main(String[] args)
    {
        ///Instancio un coche///
        Coche car1 = new Coche(Coche.setColor(),0f,Coche.setModelo(),Coche.setMarca());
        Motor.setOn();
        Coche.imprimir();
        Motor.acelerar();

        for(int i=0; i <10; i++)
        {
            Coche.imprimir();
            Motor.acelerar();
        }
    }
}
