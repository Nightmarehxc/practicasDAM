/*Escribe las sentencias Java necesarias para:
a) Visualizar el valor del séptimo elemento de un array de carácteres denominado f.*/

public class SeptimoElementoArray {

    public static void main(String[] args) {

        char [] f = new char [8];//Si no se inicializa el array, mostrará los valores a los que se inicializa por defecto.
        //f[7] = (char) (Math.random()*200); Si queremos mostrar algo, ponemos un aleatorio y un cast a tipo char.

        System.out.println(f[7]);
    }
}
