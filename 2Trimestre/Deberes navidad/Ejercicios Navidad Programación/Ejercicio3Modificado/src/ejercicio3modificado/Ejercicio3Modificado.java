//Ángel Cuevas Soriano
/*
EJERCICIO 3 Escribe un programa que reciba cinco números y que determine e 
imprima la cantidad de números negativos, positivos y la cantidad de ceros 
recibidos. 
 */
package ejercicio3modificado;

public class Ejercicio3Modificado {

    public static void numerosclasificados(){
        
          int numero;
        int n=15;
        int positivos=0;
        int negativos=0;
        int cantidadcero=0;
        
        for(int i=0;i<5;i++){
       
        numero = (int) (Math.random() * n -10);
        System.out.println("Valores random de un numero: : "+numero);
        if(numero>0){
            
            positivos= positivos + 1;
        }
          if(numero<0){
            
            negativos= negativos + 1;
          }
          if(numero==0){
            
            cantidadcero= 1 + cantidadcero;
          }
         
    }
        System.out.println("La cantidad de numeros positivos es: "+positivos);
           System.out.println("La cantidad de numeros negativos es: "+negativos);
           System.out.println("La cantidad de ceros es: "+cantidadcero);   
           
    }
    
  
    public static void main(String[] args) {
      
        numerosclasificados();
    
        }
        
    }
    

