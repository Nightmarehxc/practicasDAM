

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {

        MenuPrincipal();

        ///////


    }
    public static void MenuPrincipal()
    {
        System.out.println("1)Crear curso");
        System.out.println("2)Mostrar cursos");
        System.out.println("3)Seleccionar curso");
        int x = sc.nextInt();
        switch (x)
        {
            case 1:
                System.out.println("Creando curso");
                GestorCursos.crearCurso();
                System.out.flush();
                MenuPrincipal();

                break;
            case 2:
                System.out.println("El total de cursos es: ");
                GestorCursos.MostrarCursos();
                MenuPrincipal();
                break;
            case 3:
                if(GestorCursos.nCursos == 0)
                {
                    System.out.println("no hay cursos");
                    System.out.flush();
                    MenuPrincipal();
                }
                else {
                    System.out.println("Gestionar cursos");
                    for (int i = 0; i < GestorCursos.nCursos; i++) {
                        System.out.println("Curso " + i);
                    }
                    GestorCursos.selCurso(sc.nextInt());
                    MenuPrincipal();
                }
                break;
        }
    }
}
