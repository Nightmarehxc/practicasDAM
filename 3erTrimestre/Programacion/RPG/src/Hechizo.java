public class Hechizo
{
    String tipoHechizo;
    int potencia;

    public Hechizo(String tipoHechizo, int potencia) {
        this.tipoHechizo = tipoHechizo;
        this.potencia = potencia;
    }

    public String getTipoHechizo() {
        return tipoHechizo;
    }

    public void setTipoHechizo(String tipoHechizo) {
        this.tipoHechizo = tipoHechizo;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia)
    {
        this.potencia = potencia;
    }

    public static String toString(String a_datosHechizo)
    {
        return a_datosHechizo;
    }

}
