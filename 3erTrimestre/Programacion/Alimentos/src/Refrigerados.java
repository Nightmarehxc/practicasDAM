public class Refrigerados extends Producto
{
    int osa;
    public Refrigerados(int a_dia, int a_mes, int a_ano, int n_lote,int a_osa) {
        super(a_dia, a_mes, a_ano, n_lote);
        this.osa = a_osa;
    }
}
