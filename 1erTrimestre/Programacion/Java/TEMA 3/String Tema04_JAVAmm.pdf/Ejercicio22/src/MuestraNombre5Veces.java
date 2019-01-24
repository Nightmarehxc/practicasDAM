import java.util.Scanner;

public class MuestraNombre5Veces {

   public static Scanner sc = new Scanner(System.in);

    public static String getNombre(){
        String nombre;
        System.out.println("Inserte su nombre");
        nombre=sc.nextLine();
        return nombre;
    }


     public static void MuestraNombre(String name){
        int i, numero;

        System.out.println("Cuantas veces desea ver su nombre?");
        numero = sc.nextInt();

        for(i=0; i<numero; i++){
            System.out.println(name);
        }

     }

    public static void main(String[] args) {

        MuestraNombre(getNombre());

    }
}
