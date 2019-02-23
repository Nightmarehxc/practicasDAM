
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
public class JavaEjercicioP4 {
    public static void main(String[] arg) {
        
        int a, b;
        Scanner sc= new Scanner(System.in);
        System.out.println("Introducir el primer número: ");
        a= sc.nextInt();
        System.out.println("Introducir el segundo número: ");
        b= sc.nextInt();
        if (a>b){
        System.out.println(b+ " "+a);
        }
        else{
        System.out.println(a+ " "+b);    
        }
    }
}
