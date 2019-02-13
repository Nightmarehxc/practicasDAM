import java.util.Scanner;

public class Ruleta {

    static int aleatorio;
    static int color;//0 blanco. 1 negro
    static boolean ParImpar; // Par: true. Impar: false

    public static int getAleatorio() {
        aleatorio = 5; //(int) Math.floor(Math.random() * (36 - 16));
        return aleatorio;
    }

    public static boolean getParidad(int aleatorio1) {

        if (aleatorio1 % 2 == 0) {
            ParImpar = true;//Es par: true
        } else {
            ParImpar = false;//Es impar: false
        }
        return ParImpar;
    }

    public static int getColor(boolean ParImpar) {

        if (ParImpar) {
            color = 0;//Blanco
        } else {
            color = 1;//Negro
        }
        return color;
    }

    public static void main(String[] args) {

        //Declaración de variables
        int numeroCasilleros = 0, numeroApostado = 0, aleatorio1, colorApostado = 0, colorRuleta;
        double cantidadApostar = 0, montoInicial = 0, ganancias = 0, banca = 0, montoFinal = 0;
        boolean paridadRuleta, paridadNumeroApostado;
        Scanner sc = new Scanner(System.in);
        String ganador;

        //DATOS ENTRADA

        //CASILLEROS
        do {
            System.out.println("Introduzca el número de casilleros de la ruleta: ");
            numeroCasilleros = sc.nextInt();
            if ((numeroCasilleros < 16) || (numeroCasilleros > 36) || (numeroCasilleros % 4 != 0)) {
                System.out.println("El número debe estar comprendido entre 16 y 36, y ha de ser múltiplo de 4");
            }
        } while ((numeroCasilleros < 16) || (numeroCasilleros > 36) || (numeroCasilleros % 4 != 0));

        //DINERO INICIAL
        do {
            System.out.println("Introduzca su dinero inicial: ");
            montoInicial = sc.nextFloat();
            montoFinal=montoInicial;
            if (montoInicial <= 0) {
                System.out.println("No puede ser inferior a 0");
            } else {
                banca = montoInicial * 100;
            }
        } while (montoInicial <= 0);


        do {
            //APUESTA
            do {
                System.out.println("Introduzca cantidad a apostar: ");
                cantidadApostar = sc.nextFloat();

                if ((cantidadApostar <= 0) || (cantidadApostar > montoFinal)) {
                    System.out.println("Debe ser mayor que 0 y no superior a su monto inicial");
                }
            } while ((cantidadApostar <= 0) || (cantidadApostar > montoFinal));

            //APOSTAMOS AL NÚMERO
            do {

                System.out.println("Introduzca el número al que quiere apostar: ");
                numeroApostado = sc.nextInt();
                paridadNumeroApostado = getParidad(numeroApostado);
                colorApostado = getColor(paridadNumeroApostado);

            } while ((numeroApostado < 0) && (numeroApostado > numeroCasilleros));

            //LANZAMOS LA RULETA
            aleatorio1 = getAleatorio();
            paridadRuleta = getParidad(aleatorio1);
            colorRuleta = getColor(paridadRuleta);
            System.out.println("El número seleccionado por la ruleta fue: " + aleatorio1);

            if (colorApostado == colorRuleta) {
                ganancias = 1.8 * cantidadApostar;
                montoFinal = montoFinal + ganancias;
                System.out.println("\nColor acertado, ganancia extra de 1.8");
            } else {
                banca = banca + cantidadApostar;
                montoFinal = montoFinal - cantidadApostar;
            }

            if (numeroApostado == aleatorio1) {
                ganancias = 16 * cantidadApostar;
                montoFinal=montoFinal+ganancias;
            } else {
                banca = banca + cantidadApostar;
                montoFinal = montoFinal - cantidadApostar;
            }

            System.out.println("\nJugador->número apostado: " + numeroApostado + ", cantidad apostada: " + cantidadApostar + " \nGanancia: " + ganancias + "\nDinero actual del jugador: " + montoFinal);

        } while ((montoFinal > 0) &&  (montoFinal <= (50 * montoInicial)));

        if (banca > montoFinal) {
            ganador = "La Banca";
            System.out.println("El ganador es: " + ganador);
        } else {
            ganador = "El Jugador";
            System.out.println("El ganador es: " + ganador);
            if (montoFinal > (50 * montoInicial)){
                System.out.println("Se ha superado el máximo de ganancias (50 veces su dinero inicial");
            }
        }
    }
}