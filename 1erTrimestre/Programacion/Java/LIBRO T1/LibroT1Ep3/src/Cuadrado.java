public class Cuadrado
{

        public static void main (String[] args)
        {
            int  numero = 2;//primer fallo se cierra linea ocn ";"
            int cuad = numero * numero; // variable no inicializada, y esto no es word no hay que usar tildes
            System.out.println("El cuadrado de "  + numero + " es :"+ cuad);
        }

}
