
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dam
 */
public class JavaEjercicioP9 {
    public static void main(String[] arg) {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Introducir el primer número: ");
        int a= sc.nextInt();
        System.out.println("Introducir el segundo número: ");
        int b= sc.nextInt();
        System.out.println("Introducir el tercer número: ");
        int c= sc.nextInt();
        if ((a>b)&&(a>c)){
            System.out.println("El número mayor es el primer número-> "+a);
        }
        if ((b>a)&&(b>c)){
            System.out.println("El número mayor es el segundo número-> "+b);
        }
        if ((c>a)&&(c>b)){
            System.out.println("El número mayor esel tercer número-> "+c);
        }
    }
}
