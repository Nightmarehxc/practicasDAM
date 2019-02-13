
/*c) Sumar todos los elementos de un array c de 100 elementos.*/

public class SumarElementosArray100 {

    public static void main(String[] args) {

        int [] array = new int [100];
        int i, suma=0;

        for (i=0;i<array.length;i++){

            array[i]= i; //Introducimos un valor en cada posicion del array
            suma = suma+array[i]; //Almacenamos en suma, la suma de los 100 primeros números (en este caso)
        }
        System.out.println("La suma de los 100 primeros elementos del array (100 primeros números) es: "+suma);
    }
}