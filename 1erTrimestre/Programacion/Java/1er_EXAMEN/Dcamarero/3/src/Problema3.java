///// Daniel Camarero Abella
import java.util.Scanner;

public class Problema3
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int inputa,inputb=0;
        int menu=0;
        double  resultado = 0;
        System.out.println("Introduce un numero");
        inputa = sc.nextInt();
        System.out.println("Introduce un numero");
        inputb = sc.nextInt();
        System.out.println("Selecciona la opcion");
        System.out.println("1 Sumar");
        System.out.println("2 Restar");
        System.out.println("3 Multiplicar");
        System.out.println("4 Dividir");
        menu = sc.nextInt();
        switch(menu)
        {
            case 1:
                resultado = inputa+inputb;
                break;
            case 2:
                resultado = inputa-inputb;
                break;
            case 3:
                resultado = inputa*inputb;
                break;
            case 4:
                resultado = inputa/inputb;
                break;
            case 5:
                break;


        }
        /// Imprime el resultado
        System.out.println(resultado);
    }
}

