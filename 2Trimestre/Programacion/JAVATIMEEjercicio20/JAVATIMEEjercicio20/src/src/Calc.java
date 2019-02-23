package src;


import java.time.Duration;
import java.time.LocalTime;

public class Calc {

    private LocalTime HoraAp = LocalTime.of(8, 00);
    private LocalTime HoraCi = LocalTime.of(21, 00);
    private LocalTime Now = LocalTime.now();
    private boolean isOnTime = LocalTime.parse(HoraAp.toString())
            .isBefore(LocalTime.parse(Now.toString()));

    private boolean isOutTime = LocalTime.parse(HoraCi.toString())
            .isBefore(LocalTime.parse(Now.toString()));

    private long DifAp = Duration.between(HoraAp,Now).getSeconds();
    private long mindif = DifAp %60;
    private long hordif = (DifAp/60)/60;

    private long DifCi = Duration.between(HoraCi,Now).getSeconds();
    private long midif = DifCi %60;
    private long hodif = (DifCi/60)/60;

    public LocalTime getHoraAp() {
        return HoraAp;
    }

    public LocalTime getHoraCi() {
        return HoraCi;
    }

    public LocalTime getNow() {
        return Now;
    }

    public void getTiempoApertura(){
        if (isOnTime == true){
            System.out.println("El instituto está abierto y lleva abierto "+hordif+" horas y "+mindif+" minutos");
        }
        if (isOnTime == false){
            System.out.println("El instituto está cerrado");
        }
    }

    public void getTiempoCierre(){
        if (isOutTime == true){
            System.out.println("Al instituto le faltan "+hodif+" horas y "+midif+" minutos para el cierre");

        }
        if (isOutTime== false){
            getTiempoApertura();
        }
    }
}
