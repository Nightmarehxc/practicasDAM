
import java.util.*;

/**
 *
 */
public class Test {

    Scanner sc = new Scanner(System.in);
    static Numero n1 = new Numero();
    int valor;

    /**
     * Default constructor
     */
    public Test() {

    }

    public void IntroduceDatos() {
        System.out.println("Introduce el numero a calcular");
        n1.setNum(sc.nextInt());
    }

    public void calcularParImpar() {
        valor = n1.getNum();
        if ((valor % 2) == 0) {
            System.out.println("El numero " + valor + " es Par");
        } else {
            System.out.println("El numero " + valor + " es Impar");
        }


    }


}