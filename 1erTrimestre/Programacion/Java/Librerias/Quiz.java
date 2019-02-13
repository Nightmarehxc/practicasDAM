import java.util.Scanner;

public class Quiz{

    //Declaración de constantes
    final static String solucionCorrecta1 = "Madrid";
    final static String solucionCorrecta2 = "Nadie la descubrió, ya estaba allí!";


    //Método que devuelve la nota tras efectuar la primera pregunta
    public static int getPregunta1(){
        int nota=0;
        String respuesta;
        Scanner sc = new Scanner(System.in);

        System.out.println("1ª PREGUNTA: ¿Cuál es la capital de España?");
        respuesta=sc.nextLine();

        if (respuesta.equalsIgnoreCase(solucionCorrecta1)) { //Comparamos la respuesta ignorando las mayúsculas y minúsculas
            System.out.println("Solución correcta!");
            nota=5;
        }else {
            System.out.println("La respuesta correcta sería: " +solucionCorrecta1);
            nota = 0;
        }
        return nota; //Devolvemos la nota
    }

    //Método que devuelve la nota tras efectuar la segunda pregunta
    public static int getPregunta2(){
        int nota=0;
        String respuesta;
        Scanner sc = new Scanner(System.in);

        System.out.println("\n2ª PREGUNTA: ¿Quién descubrió América?");
        respuesta=sc.nextLine();

        if (respuesta.equalsIgnoreCase(solucionCorrecta2)) {
            System.out.println("Solución correcta!");
            nota=5;
        }else {
            System.out.println("La respuesta correcta sería: " +solucionCorrecta2);
            nota = 0;
        }
        return nota;
    }

    //Programa principal que llama a los métodos de las preguntas
    public static void main(String[] args)
    {
        int pregunta1=getPregunta1();
        int pregunta2= getPregunta2();
        int notaFinal= pregunta1+pregunta2;

        System.out.println("\nNOTA DEL EXAMEN: "+notaFinal);
    }
}