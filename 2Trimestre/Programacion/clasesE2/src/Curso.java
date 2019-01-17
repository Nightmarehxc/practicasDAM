import java.util.Scanner;

public class Curso
{
    private static String nombre;
    private static int nHoras;
    private static int nCursos;///esta variable no deberia ir en este objeto, mañana añado la clase CURSOS y CrearCursos la cual se encargara de gestionar los cursos
    private static Scanner sc = new Scanner(System.in);

    public Curso()
    {
        Curso.nombre = nombre;

    }
    public  String setNombre()

    {
        System.out.println("Introduce tu nombre");
        nombre = sc.next();
        return nombre;
    }

    public String getName()
    {
        //nombre = nombre;
        return nombre;
    }
    public  int setHoras()
    {
        System.out.println("Introduce las horas");
        nHoras = sc.nextInt();
        return nHoras;
    }

    public int getnHoras()
    {

        return nHoras;
    }
}
