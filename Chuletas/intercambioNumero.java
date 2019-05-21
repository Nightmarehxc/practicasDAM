/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopropio;
import java.util.Scanner;
import java.util.ArrayList;


public class intercambioNumero {

public static void introducirValores(ArrayList <Integer> listaNumeros){

Scanner teclado = new Scanner(System.in);
Integer numero;

System.out.println("Introduce un numero: ");

do { 

numero = teclado.nextInt();

listaNumeros.add(numero);

System.out.println("Introduce otro numero y si quieres salir introduce uno negativo");

} while (numero >= 0);

for (int i = 0; i < listaNumeros.size(); i++) {

if (listaNumeros.get(i) < 0 ) {

listaNumeros.remove(i);

}

}

}

public static void mostrarLista(ArrayList <Integer> listaNumeros){
System.out.println("La lista contiene los siguientes numeros");
System.out.println(listaNumeros);
}

public static void intercambiarPosiciones(ArrayList <Integer> listaNumeros){

Integer aux;

aux = listaNumeros.get(1);
listaNumeros.set(1, listaNumeros.get(3));
listaNumeros.set(3, aux);

}

public static void main(String[] args) {

ArrayList <Integer> listaNumeros = new ArrayList <> ();
introducirValores(listaNumeros);
mostrarLista(listaNumeros);
intercambiarPosiciones(listaNumeros);
mostrarLista(listaNumeros);
}

}

