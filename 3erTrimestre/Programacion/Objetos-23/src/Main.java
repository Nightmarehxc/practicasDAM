import Vehiculos.Autobus;
import Vehiculos.Taxi;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        Taxi t1;
        Autobus bus;

        t1 = new Taxi("Tesla","2525BFC",120,"50620602");
        System.out.println("Creando taxi");

        System.out.println("Ingresa una matricula");
        t1.setMatricula(sc.next());
        System.out.println("Ingresa una Licencia");
        t1.setLicencia(sc.next());
        System.out.println("Ingresa un Modelo");
        t1.setModelo(sc.next());
        System.out.println("Ingresa la potencia del motor");
        t1.setPotenciaCV(sc.nextFloat());


        System.out.println("Info del taxi\n" +
                "Modelo "+ t1.getModelo()+"\n" +
                "Matricula: "+ t1.getMatricula()+"\n" +
                "Potencia Motor: "+t1.getPotenciaCV()+"\n" +
                "Licencia: "+t1.getLicencia());

        System.out.println("Creando bus");
        bus = new Autobus(56,"Verde","481",500);

        System.out.println("Info del Bus\n" +
                "Modelo "+ bus.getModelo()+"\n" +
                "Matricula: "+ bus.getMatricula()+"\n" +
                "Potencia Motor: "+bus.getPotenciaCV()+"\n" +
                "Numero de plazas: "+bus.getnPlazas());
    }
}
