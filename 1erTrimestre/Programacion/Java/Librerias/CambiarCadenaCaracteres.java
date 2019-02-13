import java.util.Scanner;

public class CambiarCadenaCaracteres {

    //Programa principal
    public static void main(String[] args) {

        //Declaración de variables
        Scanner sc = new Scanner(System.in);
        String cadena;

        //Datos de entrada
        System.out.println("Introduzca una cadena de caracteres: ");
        cadena=sc.nextLine();

        //Resultado llamando al método
        cambiarAporE(cadena);
    }

    //Método que contará las vocales
    public static void cambiarAporE (String cadena){
        int i,j;
        char patron = 'a';
        char [] cadenaArray=cadena.toCharArray();

        //Recorremos la cadena y comparamos cada caracter con la "e". Si coincide, lo cambiamos por la "a".
        for (i=0;i<cadenaArray.length;i++){
            if(cadenaArray[i]=='e') {
                cadenaArray[i] = 'a';
            }
        }
        //Imprimimos resultado
        System.out.println("Cambiando la 'e' por la 'a', quedaría: ");
        for (j=0; j<cadenaArray.length;j++) {
            System.out.print(cadenaArray[j]);
        }

    }
}