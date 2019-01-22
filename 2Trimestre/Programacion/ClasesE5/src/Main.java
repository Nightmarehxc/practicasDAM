import java.util.Scanner;

public class Main
{
    static Scanner sc = new Scanner(System.in);
    static Curso c1 = new Curso();
    static Curso c2 = new Curso();
    static Curso c3 = new Curso();
    static Curso c4 = new Curso();
    static Curso c5 = new Curso();
    static Curso c6 = new Curso();
    static float notas;
    public static float CalcularMedia()
    {
        notas = (
                (c1.getNota() + c2.getNota()+ c3.getNota()+c4.getNota()+c5.getNota()+c6.getNota())/6);            ;
        return notas;
    }
    public static void main(String[] args)


    {

        ///Creamos los cursos


        //Creacion Curso 1
        System.out.println("Creando curso 1");
        c1.setName("Programacion ");
        System.out.println("Introduce la nota");
        c1.setNota(sc.nextFloat());
        // Fin NEW Curso 1
        System.out.println("Nombre "+ c1.getName()+ " Nota :" + c1.getNota());

        //Creacion Curso 2
        System.out.println("Creando curso 1");
        c2.setName("Lenguaje Marcas ");
        System.out.println("Introduce la nota");
        c2.setNota(sc.nextFloat());
        // Fin NEW Curso 2
        System.out.println("Nombre "+ c2.getName()+ " Nota :" + c2.getNota());

        //Creacion Curso 3
        System.out.println("Creando curso 3");
        c3.setName("BBDD");
        System.out.println("Introduce la nota");
        c3.setNota(sc.nextFloat());
        // Fin NEW Curso 1
        System.out.println("Nombre "+ c3.getName()+ " Nota :" + c3.getNota());

        //Creacion Curso 4
        System.out.println("Creando curso 1");
        c4.setName("Entornos de desarrollo ");
        System.out.println("Introduce la nota");
        c4.setNota(sc.nextFloat());
        // Fin NEW Curso 2
        System.out.println("Nombre "+ c4.getName()+ " Nota :" + c4.getNota());

        //Creacion Curso 5
        System.out.println("Creando curso 1");
        c5.setName("Sistemas Informaticos ");
        System.out.println("Introduce la nota");
        c5.setNota(sc.nextFloat());
        // Fin NEW Curso 2
        System.out.println("Nombre "+ c5.getName()+ " Nota :" + c5.getNota());

        //Creacion Curso 6
        System.out.println("Creando curso 1");
        c6.setName("FOL");
        System.out.println("Introduce la nota");
        c6.setNota(sc.nextFloat());
        // Fin NEW Curso 5
        System.out.println("Nombre "+ c6.getName()+ " Nota :" + c6.getNota());



        CalcularMedia();
        System.out.println("Nota media "+ notas);


    }



}
