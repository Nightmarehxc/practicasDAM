package TablaMultiplicar;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int resultado;
        System.out.println("Introduce el numero, para sacar su tabla de multiplicar");
        Numero num = new Numero(sc.nextInt());
        for(int i = 0; i <= 10;i++ )
        {
            resultado = i * num.getNumero();
            System.out.println(resultado);
        }

    }
}
