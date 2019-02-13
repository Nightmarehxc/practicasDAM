import java.util.Scanner;

public class ArrayAleatorioMetodos {

    //Programa principal
    public static void main(String[] args) {

        //Declaración de variables
        String patronS;
        Scanner sc = new Scanner(System.in);

        //Datos entrada
        System.out.println("Introduzca nombre o patrón: ");
        patronS=sc.next();

        //Llamamos al método que genera un array aleatorio del alfabeto
        vectorAleatorio(patronS);
    }

    //Método que genera vector aleatorio y busca caracteres suficientes para generar el patron que se le pasa como parametro
    public static void vectorAleatorio(String patron){

        //Decalración de variables. Tamaño de array variable
        int i, j=0,c=0, tamaño=1000;
        char[] intercepcion = new char [tamaño];

        System.out.println("El vector es: ");
        //Bucle para crear el array aleatorio con letras del alfabeto
        for (i=0; i<intercepcion.length;i++){
            intercepcion[i]= (char) ((Math.random()*26 + 'a'));

            //Bucle para comparar cada elemento del array con los distintos caracteres del patrón
            for (j=0; j<patron.length();j++){
                if (intercepcion[i]==patron.charAt(j)){ //Si coincide, informamos
                    c++;
                }
            }

            System.out.print(" "+intercepcion[i]);
        }
        if (c>=(patron.length())){
            System.out.println("\n\nHay caracteres suficientes para formar el nombre: "+patron);
        }
    }

}