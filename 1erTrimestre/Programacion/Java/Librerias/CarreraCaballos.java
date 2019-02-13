import java.util.Scanner;

public class CarreraCaballos {

    public static void main(String[] args) {

        //Declaracion de variables
        int jugadorUno = 0, jugadorDos = 0, caballoApostado, carreras, largo, numCarrera = 0, caballoGanador, avance1 = 0, avance2 = 0, jugadorGanador = 0, c1 = 0, c2 = 0, avance1T, avance2T;
        Scanner sc = new Scanner(System.in);


        //Datos de entrada y sus condiciones
        do {
            System.out.println("Ingrese el número de carreras");
            carreras = sc.nextInt();
            if (carreras < 2) {
                System.out.println("El número de carreras ha de ser al menos 2");
            }
        } while (carreras < 2);

        do {
            System.out.println("Ingrese el largo de la pista en metros");
            largo = sc.nextInt();
            if ((largo < 200) || (largo > 800)) {
                System.out.println("El largo de la pista debe ser entre 200 y 800 metros");
            }
        } while ((largo < 200) || (largo > 800));

        //Empezamos la apuesta hasta que se completen todas las carreras seleccionadas por el usuario
        do {
            //Reseteamos los avances de cada caballo y aumentamos el numero de carrera
            avance1T = 0;
            avance2T = 0;
            numCarrera++;

            System.out.println("\n************************INICIANDO EL JUEGO NUMERO " + numCarrera + " *************************");
            System.out.println("\nJugador 1, elija el caballo al que quiere apostar (1 o 2)");
            caballoApostado = sc.nextInt();

            //El primer jugador elige primero a que caballo apostar
            if (caballoApostado == 1) {
                System.out.println("Jugador 1 apuesta al caballo " + caballoApostado + " El jugador 2 apuesta al caballo 2");
            } else {
                System.out.println("Jugador 1 apuesta al caballo " + caballoApostado + " El jugador 2 apuesta al caballo 1");
            }

            //Comenzamos carrera hasta que uno de los dos caballos recorra toda la pista.
            do {
                //Calculamos aleatoriamente el recorrido de cada caballo. Ha de ser positivo siempre

                do {
                    avance1 = (int) (((Math.random() * 10) + 1) - (numCarrera * 0.1));
                    if ((avance1 > 0) && (avance1 + avance1T <= largo) && (avance1 < largo)) {
                        avance1T = avance1T + avance1;
                        System.out.println("\nEl caballo 1 se encuentra en la posicion: " + avance1T);
                    }
                } while (avance1 < 0);


                do {
                    avance2 = (int) (((Math.random() * 10) + 1) - (numCarrera * 0.1));
                    if ((avance2 > 0) && (avance2 + avance2T <= largo) && (avance1T < largo)) {
                        avance2T = avance2T + avance2;
                        System.out.println("\nEl caballo 2 se encuentra en la posicion: " + avance2T);
                    }
                } while (avance2 < 0);


            } while ((avance1T < largo) && (avance2T < largo));

            //Vemos que caballo es el ganador de esta carrera y almacenamos los datos para comparar despues
            if (avance1T == largo) {
                caballoGanador = 1;
                c1++;

            } else {
                caballoGanador = 2;
                c2++;
            }

            //Vemos que jugador gana la apuesta en esta carrera y almacenamos los datos para comparar despues
            if (caballoGanador == caballoApostado) {
                jugadorUno++;
            } else{
                jugadorDos++;
            }

            //Informamos quien ha ganado esta carrera
            System.out.println("La carrera " + numCarrera + " la gana el caballo " + caballoGanador);

        } while (numCarrera < carreras);

        //Comparamos datos para saber que caballo ha ganado mas veces
        if (c1 < c2) {
            caballoGanador = 2;
        } else if (c1 > c2) {
            caballoGanador = 1;
        }

        //Informamos que jugador es el ganador
        if (jugadorUno > jugadorDos) {
            jugadorGanador = 1;
        } else if (jugadorUno < jugadorDos) {
            jugadorGanador = 2;
        } else {
            System.out.println("\nEMPATE");
        }
        System.out.println("\nEl caballo ganador final es: " + caballoGanador + "\nEl jugador ganador es: " + jugadorGanador);

    }
}