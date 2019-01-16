import java.util.Scanner;

public class Curso
{
    private String nombre;
    private static int nHoras;
    private static int nCursos;
    Scanner sc = new Scanner(System.in);

    public Curso()
    {
        Curso.nHoras = nHoras;

    }
    public String setNombre()
    {
        return nombre;
    }
    public static int setHoras(int hor)
    {
        nHoras = hor;
        return nHoras;
    }
    private String getName()
    {
        this.nombre = sc.next();
        return nombre;
    }
    public int getnHoras()
    {
        this.nHoras = nHoras;
        return nHoras;
    }
}
