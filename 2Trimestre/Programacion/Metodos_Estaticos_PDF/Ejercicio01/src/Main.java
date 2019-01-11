import java.util.Scanner;
public class Main {

    public static void PositivoNegativo (int n){
        if(n>=0){
            System.out.println("El número introducido es POSITIVO");
        }else{
            System.out.println("El número introducido es NEGATIVO");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número");
        PositivoNegativo(sc.nextInt());
    }
}
