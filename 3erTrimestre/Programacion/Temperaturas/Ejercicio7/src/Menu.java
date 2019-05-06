import java.util.Scanner;

class Menu
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Calendario calendario = new Calendario();
        calendario.GenerarCalendario();
        System.out.println("Generando dias.");
        boolean t =false;
        do{
            System.out.println("Menu de gestion de temperaturas medias");
            System.out.println("1) Rellenar tempreraturas \n" +
                    "2) Mostrar las temperaturas\n" +
                    "3)Visualizar las temperaturas del mes\n" +
                    "4) Dia o dias mas calurosos del mes\n" +
                    "5) Salir del programa.");
            int menu_Sel = sc.nextInt();
            int a_mes;
            switch (menu_Sel)
            {
                case 1:
                    /// faltaria generar un random para las temperaturas
                    System.out.println("Introduce el mes ");
                    a_mes = sc.nextInt()-1;

                    calendario.RellenarTemperaturas(a_mes);
                    System.out.println("Temperaturas del mes: "+calendario.meses[a_mes].getNombre());
                    break;
                case 2:
                    for(int i = 0;i<calendario.meses.length;i++)
                    {
                        calendario.getTemperaturas(i);
                    }
                    break;
                case 3:
                    System.out.println("Introduce el mes ");
                    a_mes = sc.nextInt()-1;
                    calendario.getTemperaturas(a_mes);
                    break;
                case 4:
                    System.out.println("Introduce el mes");
                    a_mes = sc.nextInt()-1;
                    calendario.OrdenarTemperaturas(a_mes);
                    break;
                case 5:
                    t = true;
                    break;
            }
        }while (!t);
    }
}
