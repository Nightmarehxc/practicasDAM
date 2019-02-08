import java.util.Scanner;

public class Curso
{
    static int id;
    static String nombre;
    static float[] nota = new float[3];
    public static float notaMedia;

    public static Scanner sc = new Scanner(System.in);
    public Curso()

    {



    }

    public static float getNota(int a_trimestre)
    {
        int i= a_trimestre;
        System.out.println(nota[i]);

        return nota[i];
    }
    public static void setNota(int a_trimestre)
    {
        System.out.println("Introduce la nota del trimestre"+a_trimestre);
        int i=a_trimestre;
        nota[i]=sc.nextFloat();

    }
    public static float getNotaMedia()
    {

        for (int i = 0 ; i<nota.length;i++)
        {

            notaMedia = getNota(i)+notaMedia;
        }
        notaMedia = notaMedia/nota.length;
        System.out.println("la media es "+notaMedia);
        return notaMedia;
    }
}
