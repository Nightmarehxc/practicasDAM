/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Triangulo;

import static java.lang.Math.sqrt;

public class Triangulo {

    public static double cateto1, cateto2, hipotenusa;

    Triangulo(double cateto1, double cateto2){
        this.cateto1=cateto1;
        this.cateto2=cateto2;
    }

    public static double getCateto1() {
        return cateto1;
    }

    public void setCateto1(double cateto1) {
        this.cateto1 = cateto1;
    }

    public static double getCateto2() {
        return cateto2;
    }

    public void setCateto2(double cateto2) {
        this.cateto2 = cateto2;
    }

    public static double calculaHipotenusa(){

        double c1,c2;
        c1=getCateto1();
        c2=getCateto2();
        hipotenusa=sqrt((c1*c1)+(c2*c2));

        return hipotenusa;
    }

    public static void mostrarResultado(){
        System.out.println("El resultado es: "+hipotenusa);
    }


}

