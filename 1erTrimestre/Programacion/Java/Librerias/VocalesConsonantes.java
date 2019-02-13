public class VocalesConsonantes {

    public static void main (String[]args) {

         char letra = getLetras();

         System.out.println("Letra aleatoria: " +letra);

         if ((letra == 'a') || (letra == 'e') || (letra == 'i') || (letra == 'o') || (letra == 'u') || (letra == 'A') || (letra == 'E') || (letra == 'I') || (letra == 'O') || (letra == 'U')) {

            System.out.println(letra + " Es una vocal");
         } else {
                System.out.println(letra + " Es una consonante");
         }
    }

    public static char getLetras() {
        return (char) (Math.random()*26 + 'a');
    }
}