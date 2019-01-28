import java.util.Scanner;

public class Main {
    static int nCurso=0;
    static Scanner sc = new Scanner(System.in);

    static Curso curso1 = new Curso();
    //static Curso curso2 = new Curso();

    public static void main(String[] args)
    {
        CreadorCursos cCursos = new CreadorCursos();


///
        System.out.println("Introduce nombre");
        curso1.setNombre(sc.next());
        System.out.println("Introduce las horas");
        curso1.setHoras(sc.nextInt());
        cCursos.CrearCurso(curso1.getName(),curso1.getnHoras());
        ////Se termina de crear el curso
      ///  curso2.getName(sc.next());


        System.out.println("Introduce la id del curso a buscar...");
        cCursos.SelectCurso(sc.nextInt());///Seleccionar curso
        cCursos.MostrarCurso();///Mostrar curso

    }
}
