package TiendaVirtual;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class RegistroVentasDiaria {

    LocalDate Fecha;
    double [] ListaVentas;
    int [] ListaCodProducto;
    private int dia; private int mes; private int año;

    public RegistroVentasDiaria(int dia, int mes, int año, double[] listaVentas, int[] listaCodProducto) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
        Fecha = LocalDate.of(año, mes, dia);
        ListaVentas = listaVentas ;
        ListaCodProducto = listaCodProducto ;
    }

    public void setFecha(){
        this.Fecha=Fecha.now();
    }

    public LocalDate getFecha(){
        return Fecha;
    }

    imprimirRegistroVentas(){




    }

}
