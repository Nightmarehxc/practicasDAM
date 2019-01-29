import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static Descarga[] arrayDescargas = new Descarga[3];

    public static void main(String[] args) {
        añadirArchivo();
    }

    public static void añadirArchivo() {
        for (int i = 0; i < arrayDescargas.length; i++) {
            arrayDescargas[i] = new Descarga();
            System.out.println("Fichero numero" + i);
            System.out.println("Introduce el nombre del fichero");
            arrayDescargas[i].setName(sc.next());
            System.out.println("Introduce el peso del fichero");
            arrayDescargas[i].setPeso(sc.nextFloat());
            System.out.println("Introduce la velocidad de tu conexion en MB");
            arrayDescargas[i].setVel(sc.nextFloat());
            float op = arrayDescargas[i].getPeso() / arrayDescargas[i].getVel();
            System.out.println("Tardara :" + op/60 + "minutos");
        }
    }
}
