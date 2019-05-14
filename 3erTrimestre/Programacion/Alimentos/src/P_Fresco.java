public class P_Fresco extends Producto
{
    int e_dia;
    int e_mes;
    int e_ano;
    String pais;
    String fechaEnvasado;
    public P_Fresco(int a_dia, int a_mes, int a_ano, int n_lote,int a_e_dia,int a_e_mes,int a_e_ano)
    {
        super(a_dia, a_mes, a_ano, n_lote);
        this.fechaCaducidad = "Caduca "+a_dia+"/"+a_mes+"/"+a_ano;
        this.n_lote = n_lote;
        this.fechaEnvasado = "Envasado "+a_e_dia+"/"+a_e_mes+"/"+a_e_ano;
    }
}

