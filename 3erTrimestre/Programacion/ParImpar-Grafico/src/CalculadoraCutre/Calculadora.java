package CalculadoraCutre;

public class Calculadora
{
    int a;
    int b;


    public static int Sumar(int a, int b)
    {
        int resultado;
        resultado = a+b;
        return resultado;
    }
    public static float Restar(int a,int b)
    {
        float resultado;
        resultado = a-b;
        return resultado;
    }public static float Multiplicar(int a,int b)
    {
        float a_resultado;
        a_resultado = a*b;
        return a_resultado;
    }public static float  Dividir(int a,int b)
    {
        float a_resultado;
        a_resultado = a/b;
        return a_resultado;
    }

}
