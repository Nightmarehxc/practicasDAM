import java.util.Scanner;

public class CompararCadenas {

    //Programa principal
    public static void main(String[] args) {

        //Declaración de variables
        Scanner sc = new Scanner(System.in);
        String cadena, cadena2;

        //Datos de entrada
        System.out.println("Introduzca una cadena de caracteres: ");
        cadena=sc.nextLine();
        System.out.println("Introduzca otra para comparar ambas: ");
        cadena2=sc.nextLine();

        //Llamamos al método que compara las cadenas
        comparaCadenas(cadena, cadena2);
    }

    //Método para comparar cadenas
    public static void comparaCadenas(String cadena1, String cadena2) {

        //Comparamos cadenas sin importar las mayúsculas y minúsculas
        if (cadena1.equalsIgnoreCase(cadena2)){
            System.out.println("Las cadenas SI son iguales, ignorando mayúsculas y minúsculas");
        }else{
            System.out.println("Las cadenas NO son iguales, ignorando mayúsculas y minúsculas");
        }

    }
}