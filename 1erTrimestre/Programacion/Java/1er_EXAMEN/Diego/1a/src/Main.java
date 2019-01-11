/*Autor: Corral González, Diego*/

public class Main {

    public static void main(String[] args) {

        //Declaración e inicialización de variables
        int i, resultadoPar=0, resultadoImpar=0;

        //Bucle iterativo para recorrer todos los números de los que queremos comprobar su paridad
        for (i=1; i<=100;i++){

            //Comprobamos si es par o impar y lo sumamos, almacenando el resultado en su respectiva variables
            if((i%2)==0){

                resultadoPar=resultadoPar+i;
            }else{

                resultadoImpar=resultadoImpar+i;

            }
        }
        //Imprimimos resultado
        System.out.println("La suma de los 100 primeros números pares es: " +resultadoPar + "\nLa suma de los 100 primeros números impares es: " +resultadoImpar);
    }
}
