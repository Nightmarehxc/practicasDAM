import java.util.Scanner;

public class PesoIdeal {

    public static void main(String[] args) {

        //Declaración de variables.
        double peso, altura, edad, pesoIdeal;

        Scanner sc = new Scanner(System.in);
        //Pedimos datos
        System.out.println("Indroduzca su altura en metros");
        altura = sc.nextDouble();

        // Convertimos la altura en centímetros
        altura = altura * 100;
        System.out.println("Indroduzca su edad");
        edad = sc.nextInt();
        System.out.println("Indroduzca su peso en kgs");
        peso = sc.nextInt();

        //Calculamos el peso ideal e imprimimos resultados
        pesoIdeal = ((altura - 100) + edad * 0.10) * 0.9;
        peso = pesoIdeal - peso;
        System.out.println("Tu peso ideal es: " + pesoIdeal);
        System.out.println("Deberías de ganar: " + peso);
    }
}