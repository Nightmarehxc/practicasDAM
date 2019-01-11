public class Ventas
{
    float max = 0;
    float min = 0;
    private int dia=0;
    private float[] dinero;
    private float total=0f;

    int semanas[];

    public Ventas()
    {
        dinero = new  float[7];
    }

    public int AddCaja(float a_dinero)
    {
        dia++;
        dinero[dia] = a_dinero;
        //total = 0;
        //for (int i=0; i<6; i++)
        //{
            total += dinero[dia];
        //}
        return dia;
    }

    public float GetCaja(int a_dia)
    {
        return dinero[a_dia];
    }
    public float getTotal()
    {
        return total;
    }
    public int getDia()
    {
        dia = dia;
        return dia;
    }

}
