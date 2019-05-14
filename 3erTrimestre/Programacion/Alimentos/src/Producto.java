

public class Producto
{
    String fechaCaducidad;
    int dia;
    int mes;
    int ano;
    int n_lote;

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }
    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }
    public int getN_lote() {
        return n_lote;
    }
    public void setN_lote(int n_lote) {
        this.n_lote = n_lote;
    }
    public Producto(int a_dia,int a_mes,int a_ano, int n_lote)
    {
        this.dia = a_dia;
        this.mes = a_mes;
        this.mes = a_ano;
        this.fechaCaducidad = a_dia+"/"+a_mes+"/"+a_ano;
        this.n_lote = n_lote;
    }
}
