/*Escribe las sentencias Java necesarias para:
b) Inicializar con el valor 8 los 5 elementos de un array de enteros llamado*/

public class Inicializar5ElemenosArray {


    public static void InicializarArray (int[] array){

        int i;

        for (i=0;i<array.length;i++){
            array[i]=8;
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {

        int [] array = new int [5];

        InicializarArray(array);
    }

}
