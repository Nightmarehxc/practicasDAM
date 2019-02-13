import java.util.Scanner;

public class ContarCadenaCaracteres {

    //Programa principal
    public static void main(String[] args) {

        //Declaración de variables
        Scanner sc = new Scanner(System.in);
        String cadena;

        //Datos de entrada
        System.out.println("Introduzca una cadena de caracteres: ");
        cadena=sc.nextLine();

        //Resultado llamando al método
        System.out.println("Hay "+contarVocales(cadena)+" vocales");
    }

    //Método que contará las vocales
    public static int contarVocales(String cadena){
        int i,c=0;
        //Recorremos la cadena y comparamos cada caracter con una vocal. Si coincide, aumentamos el contador que retornamos al main
        for (i=0;i<cadena.length();i++){
            if(cadena.charAt(i)=='a'||cadena.charAt(i)=='e'||cadena.charAt(i)=='i'||cadena.charAt(i)=='o'||cadena.charAt(i)=='u'||cadena.charAt(i)=='A'||cadena.charAt(i)=='E'||cadena.charAt(i)=='I'||cadena.charAt(i)=='O'||cadena.charAt(i)=='U'){
                c++;
            }
        }
        return c;
    }
}