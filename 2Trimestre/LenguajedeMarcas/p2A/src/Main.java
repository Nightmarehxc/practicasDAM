//Camarero Abella Daniel

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Llamamos al método que genera un array aleatorio del alfabeto
        vectorAleatorio();
    }

    //Método que genera un vector aleatorio y muestra por pantalla si con un patron predefinido, se puede formar ese vector o no
    public static void vectorAleatorio(){

        //Definimos un patron de búsqueda en String y lo convertimos en array para su comparación con el vector
        String patronS ="ae";
        char [] patron = patronS.toCharArray();

        //Declaración de variables. Array de caracteres de tamaño variable predefinido
        int i, j=0,c=0, tamaño=1000;
        char[] intercepcion = new char [tamaño];

        System.out.println("El vector es: ");
        //Bucle para generar el array aleatorio
        for (i=0; i<intercepcion.length;i++){
            intercepcion[i]= (char) ((Math.random()*255-1));

            //Bucle para comparar con el patron. Si se encuentran similitudes, aumentamos el contador
            for (j=j+c; j<patron.length;j++){
                if (intercepcion[i]==patron[j]){
                    c++;
                }
            }
            System.out.print(intercepcion[i]);
        }

    }

}