

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.println("Hello World!");
        MenuPrincipal();

        ///////


    }
    public static void MenuPrincipal()
    {
        int x = sc.nextInt();
        switch (x)
        {
            case 1:
                System.out.println("Creando curso");
                GestorCursos.crearCurso();
                MenuPrincipal();

                break;
            case 2:
                System.out.println("El total de cursos es: ");
                GestorCursos.MostrarCursos();
                MenuPrincipal();
                break;
            case 3:
                System.out.println("Selecciona el curso");
                for (int i=0;i<GestorCursos.nCursos;i++)
                {
                    System.out.println("Curso "+i);
                }
                GestorCursos.selCurso(sc.nextInt());
                MenuPrincipal();
                break;



        }
    }
}
