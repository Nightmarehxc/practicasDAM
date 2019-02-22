//Ángel Cuevas Soriano
/*
19) Pide por teclado un número entero positivo (debemos controlarlo) y muestra 
el número de cifras que tiene. Por ejemplo: si introducimos 1250, nos muestre 
que tiene 4 cifras. Tendremos que controlar si tiene una o mas cifras, 
al mostrar el mensaje.
 */
package discostring19;

import java.util.Scanner;

public class DiscoString19 {

   //Scanner publico
     public static Scanner entrada = new Scanner(System.in);
     
    public static void main(String[] args) {
        int n=0;
        do{
            System.out.println("Introduce un numero");
            n=entrada.nextInt();
            
        }while(n<0); int cont=0; for (int i=n;i>0;i/=10){
            //Incrementamos el contador
            cont++;
        }
        Comprobador(n,cont);
    }
       
    public static void Comprobador(int n, int cont){
        //Controlamos en el caso de que haya una cifra o mas
        if (cont==1){
            System.out.println("El numero "+n+ " tiene "+cont+" cifra");
        }else{
            System.out.println("El numero "+n+ " tiene "+cont+" cifras");
        }
    } 
    }

