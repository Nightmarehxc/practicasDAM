package src;

import java.time.LocalDate;

public class Signo {

    private int año;
    private int mes;
    private int dia;
    private String signo;
    private LocalDate fecha_nac;

    public void setAño(int año) {
        this.año = año;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setFecha_nac() {
       fecha_nac =  LocalDate.of( año, mes,dia);
    }

    public int getAño() {
        return año;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public String getsigno(){

        switch (mes) {
            case 1:
                if ((dia >= 1) && (dia <= 19)){
                    signo ="Capricornio";
                }
                else if (dia>=20){
                    signo = "Acuario";
                }
                break;

            case 2:
                if ((dia >= 1) && (dia <= 19)){
                    signo ="Acuario";
                }
                else if (dia>=20){
                    signo = "Piscis";
                }
                break;

            case 3:
                if ((dia >= 1) && (dia <= 20)){
                    signo ="Piscis";
                }
                else if (dia>=21){
                    signo = "Aries";
                }
                break;

            case 4:
                if ((dia >= 1) && (dia <= 20)){
                    signo ="Aries";
                }
                else if (dia>=21){
                    signo = "Tauro";
                }

                break;
            case 5:
                if ((dia >= 1) && (dia <= 20)){
                signo ="Tauro";
                }
                else if (dia>=21){
                signo = "Géminis";
                }

                break;
            case 6:
                if ((dia >= 1) && (dia <= 21)){
                    signo ="Géminis";
                }
                else if (dia>=22){
                    signo = "Cáncer";
                }

                break;
            case 7:
                if ((dia >= 1) && (dia <= 22)){
                    signo ="Cáncer";
                }
                else if (dia>=23){
                    signo = "Leo";
                }

                break;
            case 8:
                if ((dia >= 1) && (dia <= 23)){
                    signo ="Leo";
                }
                else if (dia>=24){
                    signo = "Virgo";
                }
                break;
            case 9:
                if ((dia >= 1) && (dia <= 23)){
                    signo ="Virgo";
                }
                else if (dia>=24){
                    signo = "Libra";
                }
                break;

            case 10:
                if ((dia >= 1) && (dia <= 22)){
                    signo ="Libra";
                }
                else if (dia>=23){
                    signo = "Escorpio";
                }
                break;
            case 11:
                if ((dia >= 1) && (dia <= 22)){
                    signo ="Escorpio";
                }
                else if (dia>=23){
                    signo = "Sagitario";
                }
                break;

            case 12:
                if ((dia >= 1) && (dia <= 21)){
                    signo ="Sagitario";
                }
                else if (dia>=22){
                    signo = "Capricornio";
                }
                break;

        }
        return signo;

    }
}