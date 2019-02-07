public class Banca
{
    public double saldo;
    public Banca()
    {
        saldo = 20;
    }


    public void abonar(double cantidad)
    {
        saldo = saldo + cantidad;

    }
    public double obtenerSaldo()
    {
        System.out.printf("El saldo de la cuenta es: "+saldo);
        return saldo;
    }
}
