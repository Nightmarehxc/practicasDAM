//Ángel Cuevas Soriano
/*
21) Muestra los números primos entre 1 y 100.
 */
package discostring21;


public class DiscoString21 {


    public static void main(String[] args) {
        int a=0;
        for (int i = 0; i < 100; i++) {
             a=a+1;
             if(a%2!=0 && a%3!=0 && a%5!=0 ){
            System.out.println(a);  
             }
        }
    }
    
}
