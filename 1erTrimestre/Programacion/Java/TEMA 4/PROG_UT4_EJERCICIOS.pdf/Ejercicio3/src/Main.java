import java.util.Scanner;

public class Main {

    public static void cifrar(){

        int i,j;
        Scanner sc = new Scanner(System.in);
        String numeroString;
        char [] numero;
        int numeroInt;
        int [] numeros = new int [4];

        System.out.printf("Introduzca un número de cuatro cifras: ");
        numeroString=sc.nextLine();

        numero = numeroString.toCharArray();

        for(i=0;i<numero.length;i++){
            numeroString=Character.toString(numero[i]);
            numeroInt=Integer.parseInt(numeroString);
            numeros[i]=numeroInt;
        }

        for (j=0;j<numeros.length;j++){
            numeros[j]=((j+7)%10);
        }

        numeros[0]=numeros[2];
        numeros[1]=numeros[3];

        System.out.printf("El número cifrado es: ");

        for (i=0;i<numero.length;i++){
            System.out.print(numeros[i]);
        }
    }

    public static void descifrar(){

        int i,j;
        Scanner sc = new Scanner(System.in);
        String numeroString;
        char [] numero;
        int numeroInt;
        int [] numeros = new int [4];

        System.out.printf("Introduzca un número de cuatro cifras: ");
        numeroString=sc.nextLine();

        numero = numeroString.toCharArray();

        for(i=0;i<numero.length;i++){
            numeroString=Character.toString(numero[i]);
            numeroInt=Integer.parseInt(numeroString);
            numeros[i]=numeroInt;
        }

        for (j=0;j<numeros.length;j++){
            numeros[j]=((j-7)*(j%10));
        }

        numeros[2]=numeros[0];
        numeros[3]=numeros[1];

        System.out.printf("El número descifrado es: ");

        for (i=0;i<numero.length;i++){
            System.out.print(numeros[i]);
        }
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.printf("¿Qué opción desea?\n1.Cifrar\n2.Descifrar\n3.Salir");
            opcion=sc.nextInt();

            switch (opcion) {
                case 1:
                    cifrar();
                    break;
                case 2:
                    descifrar();
                    break;
                case 3:
                    break;
            }
        }while(opcion!=3);
    }
}
