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
        Curso.nHoras = nHoras;

    }
    public  String setNombre(String a_nombre)

    {
        nombre = a_nombre;


        return nombre;
    }

    public String getName()
    {
        //nombre = nombre;
        return nombre;
    }
    public  int setHoras(int a_nHoras)
    {
        nHoras = a_nHoras;
        return nHoras;
    }

    public int getnHoras()
    {

        return nHoras;
    }
}
