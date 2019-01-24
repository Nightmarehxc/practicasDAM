import java.util.Scanner;

public class Main {



    public static void getDiaPosterior_Anterior (int numero){

        String [] dias = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        int i;
        String diaPosterior = "", diaAnterior ="";

        for (i=0;i<numero;i++) {

            diaPosterior = dias[i+1];
            diaAnterior = dias[Math.abs(i-1)];
        }

        System.out.println("El día posterior es: "+diaPosterior);
        System.out.println("El día anterior es: "+diaAnterior);
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;
        System.out.println("Introduzca un número");
        numero=sc.nextInt();

        getDiaPosterior_Anterior(numero);

    }
}
