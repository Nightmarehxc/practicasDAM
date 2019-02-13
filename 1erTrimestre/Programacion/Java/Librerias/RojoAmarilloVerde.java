import java.util.Scanner;

public class RojoAmarilloVerde {

    //Variable donde alamacenaremos el valor que nos devuelva el método getAleatorio
    static int aleatorio;

    //Creamos un método para generar los números aleatorios
    public static int getAleatorio() {
        aleatorio = (int) Math.floor(Math.random() * 9) + 1;
        return aleatorio;
    }

    public static void main(String[] args) {

        //Declaramos variables
        int numeroIntroducido1, numeroIntroducido2, numeroIntroducido3, c = 0, aleatorio1, aleatorio2, aleatorio3, partidas = 1, intentosMinimos = 1, media = 1, intentosMaximos = 0;
        int partidaMinima = 1, partidaMaxima = 1, intentos = 0;
        Scanner sc = new Scanner(System.in);
        char respuesta;

        //Bucle para jugar hasta que lo desee el usuario
        do {
            //Creamos números aleatorios
            aleatorio1 = 1;//getAleatorio();
            aleatorio2 = 2;//getAleatorio();
            aleatorio3 = 3;//getAleatorio();

            //Bucle para jugar la partida
            do {
                intentos++;
                //Datos de entrada
                System.out.println("Introduzca tres números: ");
                numeroIntroducido1 = sc.nextInt();
                numeroIntroducido2 = sc.nextInt();
                numeroIntroducido3 = sc.nextInt();

                //Comparamos el primer número introducido
                if (numeroIntroducido1 == aleatorio1) {
                    System.out.println("Verde");
                } else if ((numeroIntroducido1 == aleatorio2) || (numeroIntroducido1 == aleatorio3)) {
                    System.out.println("Amarillo");
                } else if ((numeroIntroducido1 != aleatorio2) && (numeroIntroducido1 != aleatorio3)) {
                    System.out.println("Rojo");
                }

                //Comparamos el segundo número introducido
                if (numeroIntroducido2 == aleatorio2) {
                    System.out.println("Verde");
                } else if ((numeroIntroducido2 == aleatorio3) || (numeroIntroducido2 == aleatorio1)) {
                    System.out.println("Amarillo");
                } else if ((numeroIntroducido2 != aleatorio2) && (numeroIntroducido2 != aleatorio3)) {
                    System.out.println("Rojo");
                }

                //Comparamos el tercer número introducido
                if (numeroIntroducido3 == aleatorio3) {
                    System.out.println("Verde");
                } else if ((numeroIntroducido3 == aleatorio2) || (numeroIntroducido3 == aleatorio1)) {
                    System.out.println("Amarillo");
                } else if ((numeroIntroducido3 != aleatorio2) || (numeroIntroducido3 != aleatorio1)) {
                    System.out.println("Rojo");
                }

                //Intentos máximos
                if (intentosMaximos < intentos) {
                    intentosMaximos = intentos;
                    partidaMaxima = partidas;
                    if (partidas == 1) {
                        intentosMinimos = intentosMaximos;
                    }
                }

                //Intentos mínimos
                if (intentosMinimos > intentos) {
                    intentosMinimos = intentos;
                    partidaMinima = partidas;
                }

                c++;
            }
            while ((numeroIntroducido1 != aleatorio1) || (numeroIntroducido2 != aleatorio2) || (numeroIntroducido3 != aleatorio3));

            media = c / partidas; //Media de intentos es el contador total entre el número de partidas.

            //Imprimimos resultado
            System.out.println("Has adivinado los números en " + intentos + " intentos!. Los números eran: " + aleatorio1 + "  " + aleatorio2 + "  " + aleatorio3);

            //Imprimimos estadísticas
            System.out.println("\nESTADISTICAS");
            System.out.println("Partidas jugadas: " + partidas);
            System.out.println("Media de intentos por partida: " + media);
            System.out.println("Mínimo de intentos: " + intentosMinimos + " en la partida: " + partidaMinima);
            System.out.println("Máximo de intentos: " + intentosMaximos + " en la partida: " + partidaMaxima);

            System.out.println("\n¿Desea volver a jugar? (S/N)");
            respuesta = sc.next().charAt(0);
            partidas++;
            intentos = 0;

        } while (respuesta == 'S');
    }
}