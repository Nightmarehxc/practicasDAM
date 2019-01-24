public class Rueda
{
    public int getNruedas;
    String tipoRueda;
    int nRuedas;
    public Rueda()
    {

        tipoRueda="";
       nRuedas=0;
    }
    public int setNRuedas(int a_nRuedas)
    {
        nRuedas= a_nRuedas;
        return nRuedas;
    }
    public int getNruedas()

    {
        return nRuedas;
    }
    public String SetType(String a_TRueda)
    {
        tipoRueda = a_TRueda;
        return tipoRueda;
    }
    public String getType()
    {
        return tipoRueda;
    }
}
