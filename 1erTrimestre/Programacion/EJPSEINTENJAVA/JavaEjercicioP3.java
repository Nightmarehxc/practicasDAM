
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
public class JavaEjercicioP3 {
     
    public static void main(String[] arg) {
        
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.println("Introducir número: ");
        n= sc.nextInt();
        if(n%2==0){
             System.out.println(n+" es par");
        }else{
            System.out.println(n+" es impar");
        }      
        
    }
}
