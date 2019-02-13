import java.util.Scanner;

public class CalcularBilletes
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();


        int centenas;
        int decenas;
        int unidades;

        // OPCIONAL: Descomponemos la cifra en unidades, decenas y centenas para esquematizar los billetes en tres IF.
        unidades = input%10;
        decenas = ((input/10)%10);
        centenas = (input/100);

        if (centenas>0) {

            if ((input / 500) != 0) {

                int billete500 = (input / 500);
                System.out.println("Billetes de 500: " + billete500);
                input = (input) - (billete500*500);
            }

           else if ((input / 200) != 0) {

                int billete200 = (input / 200);
                System.out.println("Billetes de 200: " + billete200);
                input = (input) - (billete200*200);

            }
            if ((input / 100) != 0) {

                int billete100 = (input / 100);
                System.out.println("Billetes de 100: " + billete100);
                input = (input) - (billete100*100);

            }
        }

        if (decenas >0) {

            if ((input / 50) != 0) {

                int billete50 = (input / 50);

                System.out.println("Billetes de 50:" + billete50);

                input = input - (billete50 * 50);
            }


                if ((input / 20) != 0) {

                    int billete20 = (input / 20);

                    System.out.println("Billetes de 20:" + billete20);

                    input = input - (billete20 * 20);

                    if ((input / 10) != 0) {

                        int billete10 = (input / 10);

                        System.out.println("Billetes de 10:" + billete10);

                        input = input - (billete10 * 10);
                    }
                }
            }

            if (unidades > 0) {

                if (unidades >= 5) {
                    int billete5= (unidades/5);
                    System.out.println("Billetes de 5:" + billete5);
                    unidades = unidades - 5;
                }
                System.out.println("Sobran:" + unidades + " euros pa' birras");

            }
    }
}