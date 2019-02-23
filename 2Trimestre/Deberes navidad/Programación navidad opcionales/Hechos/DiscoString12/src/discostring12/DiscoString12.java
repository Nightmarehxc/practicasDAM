//Ángel Cuevas Soriano
/*
12) Muestra los números del 1 al 100 (ambos incluidos) divisibles entre 2 y 3. 
Utiliza el bucle que desees.
 */
package discostring12;


public class DiscoString12 {

 public static void Divisibles(){
     
     int a=0;
     for (int i = 0; i < 100; i++) {
         a=a+1;
         if (a%2==0&&a%3==0) {
             System.out.println(a); 
         }
     }
     
 }
    public static void main(String[] args) {
        Divisibles();
    }
    
}
