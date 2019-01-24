import java.util.Scanner;
/// Nombre Daniel Camarero Abella
public class b1 {
    public static void main(String[] args)
    {

        int a = 0;

        int b = 0;
        /// Creamos el objeto scanner
        Scanner sc= new Scanner(System.in);
        /// leemos datos
        b = sc.nextInt();

        /// bucle para sumar numeros pares, el maximo esta definido con variable B
        for (int i=2; i< b;i++)
        {
            a= a + 2;
        }
        System.out.println("La suma de los pares es: "+ a);
    }
}
