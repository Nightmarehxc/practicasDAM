package Trivial;

import java.lang.reflect.Array;
import java.util.Scanner;

public class TrivialMain
{
    static Enunciado[] preguntas = new Enunciado[4];
    static String[] respuestas = new  String[4];
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {

        int x;
        boolean t = false;


        do {
            System.out.println("1)Crear examen\n" +
                    "2)Hacer Examen");
            x = sc.nextInt();
            switch (x){
                case 1:
                CrearExamen();
                break;
                case 2:
                    HacerExamen();
                    comprobarRespuestas();
                    break;
                case 9:
                    System.out.println("Cerrando programa...");
                    t = true;
                    break;
            }
            }while (t == false);
    }

    public static void CrearExamen()
    {

        for(int i = 0 ; i < preguntas.length;i++)
        {
            System.out.println("Introduce la pregunta " +i);
            preguntas[i].setPregunta(sc.nextLine());
            System.out.println("Introduce la respuesta");
            preguntas[i].setRespuesta(sc.next());

        }
        System.out.println("Creacion de examen terminada");
    }
     static void HacerExamen()
    {
        System.out.println("Introduce tu nombre");
        String nombre = sc.next();
        for(int i = 0 ; i < preguntas.length;i++)
        {
            preguntas[i].getPregunta();
            respuestas[i]=sc.next();
        }
    }
    static void comprobarRespuestas()
    {

        for(int i = 0; i < respuestas.length;i++)
        {
            respuestas[i].compareTo(preguntas[i].getRespuesta());
        }

    }
}
