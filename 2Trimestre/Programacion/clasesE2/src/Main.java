import java.util.Scanner;

public class Main {
    static int nCurso=0;
    static Curso curso = new Curso();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        CreadorCursos cCursos = new CreadorCursos();



        System.out.println("Introduce las horas");
        curso.setNombre(sc.next());
        System.out.println("Introduce las horas");
        curso.setHoras(sc.nextInt());

        cCursos.CrearCurso(curso.getName(),curso.getnHoras());
        ///la siguiente instruccion deberia ser recoger la nogitud del array
        /// y añadirle el numerodel curso

/*
        System.out.println("Nombre del curso: "+curso.getName());
        System.out.println("Horas: "+curso.getnHoras());
*/
    }
}
