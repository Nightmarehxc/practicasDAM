
package excepciones_ej04;


public class Excepciones_Ej04 {


    public static void main(String[] args) {
       int a, b, c;
       a=10;
       b=0;
       
       try{
           c=a/b;
       }
       catch(ArithmeticException e){
           System.out.println("error: " + e.getMessage());
           c=0;
       }
        System.out.println("Resultado: " + c);
        
       int [] array = new int[3];
       array[0]=1;
       array[1]=1;
        
       try{
           
            //array[2]=21z;
           for(int i=0; i<5; i++){
          System.out.print(array[i] + " "); 
       }
       }
       catch(ArrayIndexOutOfBoundsException e){
           System.out.println("superas array: " + e.getMessage());
           
       }
       catch(RuntimeException e){
          System.out.println("datos incompatibles: " + e.getMessage());
       }
       
    }
    
    
    
}
