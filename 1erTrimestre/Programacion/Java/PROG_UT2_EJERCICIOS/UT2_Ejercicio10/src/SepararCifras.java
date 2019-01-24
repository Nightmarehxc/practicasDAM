import java.util.Scanner;

public class SepararCifras {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int i = 0;
        int cifra;

        String[] c = new String[5];
        String numeroString;
        System.out.println("Introduzca un número");

        numero = sc.nextInt();
        numeroString = String.valueOf(numero);
        int [] numeroSeparado= new int[5];

        for (i = 0; i < numeroString.length(); i++) {
            //numeroSeparado[i] = numeroString.charAt(i);
            System.out.println("Número "+i+": "+numeroString.charAt(i));
        }

     /*   if (numeroString.length() == 5) {

            //c = numero%5







            /*for (i=0; i<=5;i++){

                cifra = (numero/10000)%10;

                System.out.println(+cifra+"   ");

                numero=numero-(numero%1000);
            }

        } else {
            System.out.println("El número debe ser de cinco cifras");
        }*/
    }
}
