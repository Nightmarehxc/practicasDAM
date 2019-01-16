import java.util.Scanner;

public class Curso
{
    private String nombre;
    private int nHoras;
    private static int nCursos;
    Scanner sc = new Scanner(System.in);

    public String setNombre()
    {
        return nombre;
    }
    public int setHoras()
    {

        return nHoras;
    }
    public String getName()
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
