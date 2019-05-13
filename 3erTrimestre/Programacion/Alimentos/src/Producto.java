import java.util.Date;

public class Producto
{
    Date fechaCaducidad;
    int n_lote;

    public Date getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(Date fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public int getN_lote() {
        return n_lote;
    }

    public void setN_lote(int n_lote) {
        this.n_lote = n_lote;
    }

    public Producto(Date fechaCaducidad, int n_lote) {
        this.fechaCaducidad = fechaCaducidad;
        this.n_lote = n_lote;
    }
}
