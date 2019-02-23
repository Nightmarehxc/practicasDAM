package src;



public class Main {

    public static void main(String[] args) {
        Calc calc1 = new Calc();
        System.out.println("La hora de apertura del instituto es a las "+calc1.getHoraAp()+" horas");
        System.out.print("\n");
        System.out.println("La hora de cierre del instituto es a las "+calc1.getHoraCi()+" horas");
        System.out.print("\n");
        System.out.println("La hora actual es: "+calc1.getNow());
        System.out.print("\n");
        System.out.println("-------------------------------------------");
        calc1.getTiempoApertura();

        System.out.print("\n");
        System.out.println("-------------------------------------------");
        calc1.getTiempoCierre();
    }
}
