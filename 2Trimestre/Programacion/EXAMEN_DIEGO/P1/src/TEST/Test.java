package TEST;

import Triangulo.Triangulo;

import java.util.Scanner;

/*CORRAL GONZALEZ, DIEGO*/
public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double c1, c2;
        boolean repite;
        try {
        do {
            repite = false;

                System.out.println("\nIntroduzca el valor de dos catetos (entre 10 y 20)");
                c1 = sc.nextDouble();
                c2 = sc.nextDouble();

                if (((c1 < 10) || (c2 < 10)) && ((c1 > 20) || (c2 > 20))) {
                    System.out.println("Valor no válido");
                    repite = true;
                }
            } while (repite) ;

            Triangulo t1 = new Triangulo(c1, c2);
            t1.calculaHipotenusa();
            t1.mostrarResultado();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }}

