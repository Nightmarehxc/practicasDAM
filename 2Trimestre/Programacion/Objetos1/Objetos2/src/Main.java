import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Empleados empleado = new Empleados();
    public static Direccion d1 = new Direccion();
    static ArrayList<Direccion> listaD = new ArrayList<>();//Listas de direcciones
    static ArrayList<Empleados> listaEmpleados = new ArrayList<>();//Listas de Empleados

    public static void main(String[] args) {
        listaEmpleados.add(0, empleado);
        boolean t = false;
        do {
            System.out.println("---Menu de RRHH--\n" +
                    "1) Crear direcciones\n" +
                    "2) Mostrar direcciones\n" +
                    "3) Gestion de Empleados");
            int x = sc.nextInt();
/*
            if (x < 1) {
                throw new ArithmeticException("Opcion equivocada");
            } else if (x > 3) {
                throw new ArithmeticException("Opcion equivocada");
            } else {*/
                switch (x) {
                    case 1:
                        crearCalles();
                        break;
                    case 2:
                        getDirecciones();
                        break;
                    case 3:
                        System.out.println("1)Crear Empleados \n " +
                                "2)Mostrar Empleados\n" +
                                "3)Modificar Empleados");

                        x= sc.nextInt();
                        switch (x)
                        {
                            case 1:
                                crearEmpleado();
                                break;
                            case 2:
                                getEmpleados();
                            case 3:
                                getEmpleados();
                                System.out.println("introduce la ID ");
                                modDireccion(sc.nextInt());
                        }
                        break;
                    case 0:
                        t= true;
                        break;
                }



        }while (t == false);
    }

    ///getCalles
    public static void crearCalles() {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuantas direcciones deseas añadir?");
        int j = sc.nextInt();
        for (int i = 0; i < j; i++) {
            System.out.println("Calle");
            listaD.add(i, d1);

            listaD.get(i).setCalle(sc.next());
            System.out.println("Numero");
            listaD.get(i).setNumero(sc.nextInt());
            System.out.println("Puerta");
            listaD.get(i).setPuerta(sc.next());
            System.out.println("Ciudad");
            listaD.get(i).setCiudad(sc.next());
        }
    }

    ///Mostrar calles
    public static void getDirecciones() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mostrar calles");
        int j = listaD.size();
        for (int i = 0; i < j; i++) {
            System.out.println("ID");
            System.out.println(i);
            System.out.println("Calle");
            listaD.get(i).getCalle();
            System.out.println("Numero");
            System.out.println(listaD.get(i).getNumero());
            System.out.println("Escalera");
            System.out.println(listaD.get(i).getPuerta());
            System.out.println("Ciudad");
            System.out.println(listaD.get(i).getCiudad());
        }
    }

    public static void crearEmpleado() {
        int j = listaEmpleados.size();
        System.out.println("Cuantos empleados deseas añadir?");
        int x = sc.nextInt();
        for (int i = 0; i < x; i++) {
            listaEmpleados.add(j, empleado);
            System.out.println("---Creador de empleados--");
            System.out.println("Introduce el Nombre");
            listaEmpleados.get(j).setNombre(sc.next());
            System.out.println("---Introduce el Sueldo--");
            listaEmpleados.get(j).setSalario(sc.nextDouble());
            modDireccion(j);
        }
    }

    static void getEmpleados() {
        boolean trigger = false;
        System.out.println("1 para listar los empleados \n2) Para modificar empleados \n3) para salir");

        {
            do {
                switch (sc.nextInt()) {
                    case 1:
                        for (int i = 0; i < listaEmpleados.size(); i++) {
                            System.out.println("Id: " + i + "\n Nombre:" + listaEmpleados.get(i).getNombre() + "\nSalario: " + listaEmpleados.get(i).getSalario());

                        }
                        break;
                    case 2:

                        for (int i = 0; i < listaEmpleados.size(); i++) {
                            System.out.println("Id: " + i + "\n Nombre:" + listaEmpleados.get(i).getNombre());

                        }

                        System.out.println("Ingresa la ID del empleado");
                        int id = sc.nextInt();
                        System.out.println("Que operacion desea realizar\n 1) modificar direccion \n 2)Modificar salario 3)Eliminar empleado ");
                        int x = sc.nextInt();
                        switch (x) {
                            case 1:

                                break;
                        }

                        break;
                    case 3:
                        trigger = true;
                        break;
                }

            } while (trigger = false);
        }
    }

    static void modDireccion(int selEmp) {
        System.out.println("---Introduce 1 para seleccionar una ciudad creada --");
        System.out.println("---Introduce 2 para introducir una nueva direccion--");
        switch (sc.nextInt()) {
            case 1:
                getDirecciones();//Muestra las ciudades
                int x =sc.nextInt();
                listaEmpleados.get(selEmp).setCalle(listaD.get(x).getCalle());

                break;
            case 2:

                int xa = listaD.size();
                listaD.add(xa, d1);

                listaD.set(xa, d1).setCalle(sc.next());
                listaD.set(xa, d1).setNumero(sc.nextInt());
                listaD.set(xa, d1).setPuerta(sc.next());
                listaD.set(xa, d1).setCiudad(sc.next());
                break;
        }
    }
}