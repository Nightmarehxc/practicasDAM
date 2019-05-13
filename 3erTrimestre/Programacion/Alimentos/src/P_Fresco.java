import java.util.Date;

public class P_Fresco extends Producto
{
Date fechaEnvasado;

    public P_Fresco(Date fechaCaducidad, int n_lote, java.sql.Date fechaEnvasado) {
        super(fechaCaducidad, n_lote);
        this.fechaEnvasado = fechaEnvasado;
    }
}
