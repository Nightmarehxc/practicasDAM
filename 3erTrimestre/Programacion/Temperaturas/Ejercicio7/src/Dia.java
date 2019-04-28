class Dia
{
    private float tempMin;
    private float tempMax;
    final String[] d_names = new String[]{"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};
    String d_name;



    public float getTempMin()
    {
        return tempMin;
    }

    public void setTempMin(float a_tempMin)
    {
        this.tempMin = a_tempMin;
    }

    public float getTempMax() {
        return tempMax;
    }

    public void setTempMax(float a_tempMax)
    {
        this.tempMax = a_tempMax;
    }

    public String getD_name() {
        return d_name;
    }

    public void setD_name(int n_day)
    {
        this.d_name = d_names[n_day];
    }
}
