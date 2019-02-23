public class Pajaro
{

    static int nPajaros=0;
    static String color;
    static int edad;

    public Pajaro()
    {

    }
    public static int crearPajaro()
    {
        nPajaros++;
        return nPajaros;
    }
    public int getNPajaros()
    {
        return nPajaros;
    }
    public String setColor(String a_col)
    {
        color = a_col;
        return color;
    }
    public String getColor()
    {
        return color;
    }
    public int setEdad(int a_edad)
    {
        edad = a_edad;
        return edad;
    }
    public int getEdad()
    {
        return edad;
    }

    public void MostrarPajaros()
    {
        System.out.println("Color " + getColor());
        System.out.println("Edad "+ getEdad());
        System.out.println("ID "+nPajaros);
    }

}
