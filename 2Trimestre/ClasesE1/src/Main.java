import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        ///Instancio un coche///
        Coche car1 = new Coche(Coche.setColor(),0f,Coche.setModelo(),Coche.setMarca());
        System.out.println("Introduce el numero de ruedas");
        Rueda ruedas[] = new Rueda[Coche.nRuedas];
        System.out.println("ejecutar");
        Scanner sc = new Scanner(System.in);
        for (int i=0; i > ruedas[Coche.nRuedas].getNruedas;i++)
        {
            ruedas[i].SetType(sc.next());
        }
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
