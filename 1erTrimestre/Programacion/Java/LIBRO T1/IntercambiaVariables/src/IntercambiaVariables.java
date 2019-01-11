public class IntercambiaVariables {

    public static void main (String[] args)
    {
        int a = 1;
        int b = 2;
        int c ;
        System.out.println("imprime valor original de A: "+ a);
        System.out.println("imprime valor original de B: "+ b);
        c = a;
        a = b;
        b = c;

        System.out.println("imprime valor cambiado de A: "+ a);
        System.out.println("imprime valor cambiado de B: "+ b);
    }
}
