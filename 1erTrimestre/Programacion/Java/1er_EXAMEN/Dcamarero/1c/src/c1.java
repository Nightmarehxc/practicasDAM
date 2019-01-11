import java.util.Scanner;
/// Nombre Daniel Camarero Abella
public class c1 {
    public static void main(String[] args)
    {

        int a = 0;

        int b = 0;
        /// Creamos el objeto scanner
        Scanner sc= new Scanner(System.in);
        /// leemos datos
        System.out.println("Escribe un maximo de numeros");
        b = sc.nextInt();
        /// Si el numero es mayor a 200 Hazlo, SI NO  escribe un n mayor a 200
        if (b > 200)
                {
                        /// bucle para sumar numeros pares, el maximo esta definido con variable B
                        for (int i=2; i< b;i++)
                        {
                            a= a + 2;
                        }
                }

            else
                {
                    System.out.println("Escribe un numero mayor a 200");
                }
    }
}
