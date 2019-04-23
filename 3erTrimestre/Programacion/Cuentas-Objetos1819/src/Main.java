import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);


    static ArrayList<Cuenta> listaCuentas = new ArrayList<Cuenta>();
    static int nCuentas = listaCuentas.size();

    public static void main(String[] args)
    {
        System.out.println(nCuentas);
        Menu();





    }
    static void Menu()
    {
        boolean salir = false;
        do {

            System.out.println("Cajero automatico\n" +
                    "---------------------------------------\n" +
                    "1)Crear Cuenta\n" +
                    "2)Crear cuenta con saldo inicial\n" +
                    "3)Ingresar dinero\n" +
                    "4)Sacar dinero\n" +
                    "5)Ver Saldo\n" +
                    "6)Salir");
            int menuSelector = sc.nextInt();
            switch (menuSelector) {
                case 1:
                    int nCuenta;
                    System.out.println("Introduce tu nombre");
                    String nombre = sc.next();
                    System.out.println("Introduce tu apellido");
                    String apellido = sc.next();
                    System.out.println("Introduce tu segundo apellido");
                    String apellido2 = sc.next();
                    Cuenta cuenta;
                    nCuenta = listaCuentas.size();
                    listaCuentas.add(cuenta = new Cuenta(nCuenta, nombre, apellido, apellido2, 0));
                    //listaCuentas.add(cuenta);

                    System.out.println("Numero de cuenta " + listaCuentas.get(nCuenta).getId() + "\n" +
                            "Nombre: " + listaCuentas.get(nCuenta).getNombre() + "\n" +
                            "Apellidos: " + listaCuentas.get(nCuenta).getApellido() + " " + listaCuentas.get(nCuenta).getApellido2() + "\n" +
                            "Saldo en cuenta: " + listaCuentas.get(nCuenta).getSaldo() + "€");


                    break;
                case 2:

                    System.out.println("Introduce tu nombre");
                    nombre = sc.next();
                    System.out.println("Introduce tu apellido");
                    apellido = sc.next();
                    System.out.println("Introduce tu segundo apellido");
                    apellido2 = sc.next();
                    nCuenta = listaCuentas.size();
                    listaCuentas.add(cuenta = new Cuenta(nCuenta, nombre, apellido, apellido2, 20));
                    //listaCuentas.add(cuenta);

                    System.out.println("Numero de cuenta " + listaCuentas.get(nCuenta).getId() + "\n" +
                            "Nombre: " + listaCuentas.get(nCuenta).getNombre() + "\n" +
                            "Apellidos: " + listaCuentas.get(nCuenta).getApellido() + " " + listaCuentas.get(nCuenta).getApellido2() + "\n" +
                            "Saldo en cuenta: " + listaCuentas.get(nCuenta).getSaldo() + "€");
                    break;
                case 3:
                    System.out.println("Introduce tu numero de cuenta");
                      nCuenta =  sc.nextInt();
                    System.out.println("Introduce cuanto dinero quieres ingresar");
                    float ingresar = sc.nextFloat();
                    listaCuentas.get(nCuenta).ingresarDinero(ingresar);
                    System.out.println("Saldo en cuenta: " + listaCuentas.get(nCuenta).getSaldo() + "€");
                    break;
                case 4:
                    System.out.println("Introduce tu numero de cuenta");
                    nCuenta =  sc.nextInt();
                    System.out.println("Introduce cuanto dinero quieres sacar");
                    ingresar = sc.nextFloat();
                    listaCuentas.get(nCuenta).sacarDinero(ingresar);
                    System.out.println("Saldo en cuenta: " + listaCuentas.get(nCuenta).getSaldo() + "€");
                    break;
                case 5:
                    System.out.println("Introduce tu numero de cuenta");
                    nCuenta =  sc.nextInt();
                    System.out.println("Saldo en cuenta: " + listaCuentas.get(nCuenta).getSaldo() + "€");
                    break;

                case 6:
                    salir = true;
                    break;


            }
        }while (salir == false);
    }
    void Ingresar()
    {


    }
    void CrearCuenta()
    {

    }
}
