public class Banca
{
    double saldo;
    public Banca()
    {
        double saldo;
        saldo = 20;
    }


    public void abonar(double cantidad)
    {
        saldo = saldo + cantidad;
    }
    public double obtenerSaldo()
    {
        return saldo;
    }
}
