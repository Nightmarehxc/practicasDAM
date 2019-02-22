//Ángel Cuevas Soriano
/*
 9) Lee un número por teclado que pida el precio de un producto 
(puede tener decimales) y calcule el precio final con IVA. El IVA 
sera una constante que sera del 21%.
 */
package discostring9;

import java.util.Scanner;


public class DiscoString9 {

    //Scanner publico
public static Scanner entrada= new Scanner(System.in);

public static void IVA(double precio){
    
   double  preciofinal= precio+(precio*0.21);
    System.out.println("El precio final con IVA de 21% es: "+preciofinal+"€");
}

    public static void main(String[] args) {
        System.out.println("Escribe el precio de un producto: ");
          double precio=entrada.nextDouble();
          
          IVA(precio);
    }
    
}
