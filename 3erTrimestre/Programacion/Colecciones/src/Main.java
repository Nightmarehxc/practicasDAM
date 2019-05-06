import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Alumnos> listaAlumnos = new ArrayList<>();
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Boolean t =false;

        System.out.println("Listado de alumnos");

        do{

            System.out.println("Ingresa una opcion\n" +
                    "1)Añadir alumno\n" +
                    "2)Mostrar alumnos");
        String sel = sc.next();
        switch (sel)
        {
            case "1":
                System.out.println("Introduce un nombre");
                String name = sc.next();
                System.out.println("Introduce la edad");
                int edad = sc.nextInt();
                System.out.println("Introduce el curso al que pertenece");
                String curso = sc.next();

                CrearAlumno(name,edad,curso);
                break;
            case "2":
                MostrarAlumnos();
                break;
        }
        }while (t == false);

    }

    static void CrearAlumno(String a_name, int a_age, String a_curso)
    {
        int indice = listaAlumnos.size();
        listaAlumnos.add(indice,new Alumnos(a_name,a_age,a_curso));
    }
    static void MostrarAlumnos()
    {
        for(int i = 0; i< listaAlumnos.size();i++)
        {
            System.out.println("-----------------------------------------------------\n" +
                    "Nombre: "+listaAlumnos.get(i).getName()+"\n" +
                    "Edad: "+listaAlumnos.get(i).getAge()+"\n" +
                    "Curso: "+ listaAlumnos.get(i).getMatricula()+"\n" +
                    "-----------------------------------------------------");
        }
    }
}
