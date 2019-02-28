public class Calculadora
{
    public static int v,v1;
    static int  resultado;
    static int max;
    public Calculadora()

    {
        int v,v1;
    }
    public static void Sumar(int a_1,int a_2)
    {
         resultado = a_1 +a_2;



    }

    public static int getSuma()
    {

        return resultado;
    }

    public static void Max(int a_1,int a2)
    {
        max = a_1;
        if (a_1 > a2)
        {
            max = a_1;

        }

    }

}
