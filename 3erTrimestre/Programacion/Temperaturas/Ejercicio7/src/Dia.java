public class Dia
{
    float tempMin;
    float tempMax;

    public Dia(float a_tempMin, float a_tempMax)
    {
        this.tempMin = a_tempMin;
        this.tempMax = a_tempMax;
    }

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
}
