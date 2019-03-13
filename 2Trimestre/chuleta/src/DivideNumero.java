public class DivideNumero
{
    public double a;
    public double b;
    public double resultado;
    public double redondeo;

    public DivideNumero(double a, double b) {

        this.a = a;
        this.b = b;
    }

    public double getA()
    {
        return a;
    }

    public void setA(double i_a)
    {
        this.a = a;
    }

    public double getB()
    {
        return b;
    }

    public void setB(double i_b)
    {
        this.b = b;
    }

    public double getResultado()
    {
        return resultado;
    }

    public void setResultado()
    {
        resultado = a / b;
        this.resultado = resultado;

    }

    public double getFloor() {
        return redondeo;
    }

    public void setFloor() {
        redondeo = Math.floor(resultado);
        this.redondeo = redondeo;
    }

}
