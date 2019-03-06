import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("BIENVENIDO AL AHORCADO\nNúmero de intentos:3");

        int intentos = 3, aciertos=0;
        boolean palabraAcertada=false;
        String frase = "programacion";
        String caracter;
        char [] respuesta=new char[frase.length()];

        for (int i=0;i<respuesta.length;i++){
            respuesta[i]='_';
            System.out.print(respuesta[i]+" ");
        }

        do {
            System.out.println("\nIntentos: "+intentos+"\nIntroduzca caracter: ");
            caracter = sc.next();

            if (frase.contains(caracter)){

                for(int i=0; i<frase.length();i++){
                    if(frase.charAt(i)==caracter.charAt(0)) {
                        respuesta[i] = frase.charAt(i);
                        aciertos++;
                    }
                }
            }else intentos--;

            for(int i=0; i<respuesta.length;i++){
                System.out.print(respuesta[i]+" ");
            }

            if (aciertos==frase.length()) {
                palabraAcertada=true;
            }

        } while ((intentos != 0)&&(!palabraAcertada));

        if (intentos==0){
            System.out.println("\nHas perdido");
        }else{
            System.out.println("\nENHORABUENA, has ganado!");
        }
    }
}
