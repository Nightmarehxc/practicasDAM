import java.util.Scanner;

public class GestorCursos {
    public static int nCursos = 0;
    public static Curso[] contCursos;

    static {

    }

    public static Scanner sc = new Scanner(System.in);


    GestorCursos() {

    }

    public static void crearCurso() {
        contCursos = new Curso[nCursos];
        nCursos++;
        System.out.println(nCursos);

    }

    public static int MostrarCursos() {
        System.out.println("................................ ");
        System.out.println(nCursos);


        return nCursos;
    }

    public static void selCurso(int a_curso) {

        System.out.println("El curso seleccionado es " + a_curso);

        switch (a_curso) {
            case 0:
                System.out.println("Selecciona una opcion");


                System.out.println("Definir Notas o Get notas");
                switch (sc.nextInt()) {
                    case 1:
                        System.out.println("Selecciona un trimestre");
                        int tri = sc.nextInt();
                        Curso.setNota(tri);
                        break;
                    case 2:
                        System.out.println("Selecciona un trimestre");
                        tri = sc.nextInt();
                        Curso.getNota(tri);
                        break;
                }


                break;
        }
    }
}
/*
 int obtenerMáximo(); obtiene la calificación máxima
 • int obtenerMínimo(): obtiene la calificación mínima.
 • double obtenerMedia(): obtiene las medias de las calificaciones.
  • void imprimirGráficoBarras(): imprime el gráfico de barras de las calificaciones,
   que indique el número de alumnos que ha tenido una determinada nota.
* */