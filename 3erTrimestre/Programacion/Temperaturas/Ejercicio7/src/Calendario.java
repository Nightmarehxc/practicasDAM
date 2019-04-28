public class Calendario
{
    Mes[] meses = new Mes[12];
    Mes mes;
    String[] m_names = new String[12];
    String[] d_names = new String[7];

    void GenerarCalendario()
    {
        m_names = new String[]{"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        for(int i = 0; i < meses.length; i++)
        {

            meses[i] = new Mes();
            meses[i].setNombre(m_names[i]);
            ///System.out.println(meses[i].getNombre());
            meses[i].GenerarDias();

        }
    }
    void RellenarTemperaturas(int a_mes)
    {
        meses[a_mes].RellenarTemperaturas();
    }
    void getTemperaturas(int a_mes)
    {
        meses[a_mes].getTemperaturas();
    }
}
