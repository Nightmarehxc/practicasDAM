import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("BIENVENIDO AL AHORCADO\nNúmero de intentos:3");

        int intentos = 3;
        boolean acierto = false;
        String frase = "El rey es mi padre";
        String caracterStr;
        char [] caracter;

        do {
            System.out.println("\nIntroduzca caracter a buscar");
            caracterStr = sc.nextLine();
            caracter=caracterStr.toCharArray();
            for (int i = 0; i < caracter.length; i++) {

                if (caracter[i]==(frase.charAt(i))) {
                    System.out.print(frase.charAt(i));
                    acierto = true;
                } else {
                    System.out.print("_");
                }
            }
            if (acierto) {
                acierto = false;
            } else
                intentos--;

        } while (intentos != 0);

    }


}
