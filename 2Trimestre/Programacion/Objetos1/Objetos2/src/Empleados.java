import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Empleados extends Direccion {
    int id;
    String nombre;
    double salario;

    public Empleados() {

    }
    //  Direccion direccion;
//    Scanner sc = new Scanner(System.in);

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}

