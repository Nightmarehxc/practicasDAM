public class Venta
{
    private int codProd;
    private double precio;

    public Venta(int codProd, double precio) {
        this.codProd = codProd;
        this.precio = precio;
    }

    public int getCodProd() {
        return codProd;
    }

    public void setCodProd(int codProd) {
        this.codProd = codProd;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {

        this.precio = precio;
    }
}
