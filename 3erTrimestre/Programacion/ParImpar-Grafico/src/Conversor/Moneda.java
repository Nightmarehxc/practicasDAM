package Conversor;

public class Moneda
{
    final static double euro = 0.9;

    double valor;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    static double Calcular(double valor)
    {
        valor = valor * euro;
        return valor;
    }
}
