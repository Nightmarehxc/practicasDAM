public class AleatorioParImpar {

    public static void main(String[] args)
    {
        //Declaración de variables
        double aleatorio = ((Math.random())*100); //Variable double donde almacenar lo que devuelve el método random (hasta 100)

        aleatorio=Math.floor(aleatorio);

        //Mostramos número aleatorio
        System.out.println(aleatorio+"\n");

        //Comprobamos si es par o impar e imprimimos resultado
        if(aleatorio%2==0){
            System.out.println("Es par");
        }else{
            System.out.println("Es impar");
        }
    }
}