package rectan;

public class Rectangulo
{
    double alto;
    double ancho;

    public Rectangulo(double alto, double ancho) {
        this.alto = alto;
        this.ancho = ancho;
    }

    public double getAlto()
    {
        return alto;
    }

    public void setAlto(double a_alto) {
        this.alto = a_alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double a_ancho) {
        this.ancho = a_ancho;
    }
}
