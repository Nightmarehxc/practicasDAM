import java.util.Scanner;
///Daniel Camarero Abella
public class JuegoConNumeros
{
    public static void main(String[] args) {
        double aleatorio = ((Math.random()) * 200); //Variable double donde almacenar lo que devuelve el método random (hasta 100)
        aleatorio = Math.floor(aleatorio);
        int x = 0;
        boolean b = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Vamos a jugar a un juego escribe un numero");


        x = sc.nextInt();

            do {
                System.out.println("escribe un numero");
                if (x == aleatorio) {
                    b = true;
                    System.out.println("Acertaste");


                } else {
                    if (x < aleatorio) {
                        System.out.println("Soy mas grande");
                    } else {
                        System.out.println("Fallaste");
                    }
                }

            } while (b = false);
        }
}