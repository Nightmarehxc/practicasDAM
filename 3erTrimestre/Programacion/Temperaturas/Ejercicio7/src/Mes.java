import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Mes
{
    int contador = 0;

    ArrayList<Dia> Dias = new ArrayList<>(28);
    Dia dia;
    String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    void GenerarDias() {

        for (int i = 0; i < 28; i++) {
            if (contador <= 6) {

                Dias.add(i, new Dia());
                Dias.get(i).setD_name(contador);
                //System.out.println(Dias.get(i).getD_name());

                contador++;
                if (contador > 6) {
                    contador = 0;
                }

            }

            Dias.add(new Dia());

        }
    }
    void RellenarTemperaturas()
    {
        for(int i = 0; i<28;i++)
        {
            Dias.get(i).setTempMax(1.5f);
            Dias.get(i).setTempMin(0.5f);
        }
    }
    void getTemperaturas()
    {
        for(int i= 0;i<28;i++)
        {
            System.out.println("Dia :"+i+" "+Dias.get(i).getD_name()+"\n" +
                    "Temperatura minima: "+Dias.get(i).getTempMin()+"\n" +
                    "Temperatura maxima:"+Dias.get(i).getTempMax());
        }
    }
    void ordenarTemperaturas()
    {


    }
}
