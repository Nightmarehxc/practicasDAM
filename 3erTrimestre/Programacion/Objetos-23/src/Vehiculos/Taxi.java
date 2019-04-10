package Vehiculos;

public class Taxi extends Vehiculo
{
    String licencia;

    public Taxi(String a_modelo,String a_matricula,float a_CV,String a_licencia)
    {
        this.modelo = a_modelo;
        this.matricula = a_matricula;
        this.potenciaCV = a_CV;
        this.licencia = a_licencia;

    }

    public String getLicencia()
    {
        return licencia;
    }

    public void setLicencia(String a_licencia)
    {
        this.licencia = a_licencia;
    }



}
