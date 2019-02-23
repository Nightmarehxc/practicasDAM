//Ángel Cuevas Soriano
/*
22) Del siguiente String “La lluvia en Sevilla es una maravilla” cuenta cuantas
vocales hay en total (recorre el String con charAt).
 */
package discostring22;


public class DiscoString22 {

 
    public static void main(String[] args) {
      String cadena="La lluvia en Sevilla es una maravilla";
  
        int cont=0;
        for (int i=0;i<cadena.length();i++){
          
            if(cadena.charAt(i)=='a' ||  cadena.charAt(i)=='e' ||  cadena.charAt(i)=='i' || cadena.charAt(i)=='o' || cadena.charAt(i)=='u'){
                cont++;
            }
        }
  
        System.out.println("Hay "+cont+" vocales en total");
    }
    
}
