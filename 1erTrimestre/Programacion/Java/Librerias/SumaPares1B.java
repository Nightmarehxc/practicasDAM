import java.util.Scanner;
public class SumaPares1B {
    public static void main(String[] args)
    {

        int a = 0;

        int b = 0;
        /// Creamos el objeto scanner
        Scanner sc= new Scanner(System.in);
        /// Para leer datos
        b = sc.nextInt();

        /// bucle para sumar numeros pares
        for (int i=2; i< b;i++)
        {
            a= a + 2;
        }
        System.out.println("La suma de los pares es: "+ a);
    }
}