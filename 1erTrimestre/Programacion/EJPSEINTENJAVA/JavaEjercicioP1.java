/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dam
 */
import java.util.Scanner;
        
public class JavaEjercicioP1 {
    
    public static void main(String[] arg) {
        
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.println("Introducir número: ");
        n= sc.nextInt();
        
        System.out.println("El cuadrado es " +n*n+" y el cubo es " +n*n*n);
    }
}
