package Vehiculos;

public class Autobus extends Vehiculo
{

    int nPlazas;

    public Autobus(int nPlazas,String a_modelo,String a_matricula,float a_CV)
    {
        this.modelo = a_modelo;
        this.matricula = a_matricula;
        this.potenciaCV = a_CV;
        this.nPlazas = nPlazas;
    }

    public int getnPlazas() {
        return nPlazas;
    }

    public void setnPlazas(int nPlazas) {
        this.nPlazas = nPlazas;
    }
}
