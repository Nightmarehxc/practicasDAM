
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.time.LocalDate;
import java.time.LocalTime;

public class Horario
{
    LocalTime tiempo = LocalTime.now();
    int horas = tiempo.getHour();
    int minutos = tiempo.getMinute();
    int segundos = tiempo.getMinute();
    String reloj;

    public LocalTime getTiempo() {
        return tiempo;
    }

    public void setTiempo(LocalTime tiempo) {
        this.tiempo = tiempo;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public String getReloj() {
        return reloj;
    }

    public void setReloj(String reloj) {
        this.reloj = reloj;
    }
    public void modificarMinutos(int m_Minutos)
    {
        this.minutos = m_Minutos;
    }
}
