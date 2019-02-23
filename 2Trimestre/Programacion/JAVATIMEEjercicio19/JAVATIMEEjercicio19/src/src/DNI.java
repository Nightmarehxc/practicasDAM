package src;

import java.time.YearMonth;

public class DNI {

    private int edad;
    private int mes;
    private int año;


    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setFechaExp(int mes, int año) {
        this.mes = mes;
        this.año = año;
        YearMonth fecha = YearMonth.of(año, mes);
    }

    public void getFechaExp() {
        if ((edad<=5)&&(edad>0)){
            System.out.println("Tendrá que renovar el DNI el: "+YearMonth.of(año,mes).plusYears(2));
        }
        if ((edad<30)&&(edad>5)){
            System.out.println("Tendrá que renovar el DNI el: "+YearMonth.of(año,mes).plusYears(5));
        }
        if ((edad>=30)&&(edad<70)){
            System.out.println("Tendrá que renovar el DNI el: "+YearMonth.of(año,mes).plusYears(10));
        }
        if (edad>=70){
            System.out.println("La fecha de renovar su DNI es permanente: ");
        }
    }
}
