public class P_Congelado extends Producto {
    float temp;
    public P_Congelado(int a_dia, int a_mes, int a_ano, int n_lote,float a_temp)
    {
        super(a_dia, a_mes, a_ano, n_lote);
        this.temp = a_temp;
    }
}
