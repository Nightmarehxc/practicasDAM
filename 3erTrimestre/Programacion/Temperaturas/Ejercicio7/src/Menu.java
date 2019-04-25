import java.util.Scanner;

public class Menu
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Calendario cal = new Calendario();
        boolean t =false;
        do{
        System.out.println("Menu de gestion de temperaturas medias");
        System.out.println("1) Rellenar tempreraturas \n" +
                "2) Mostrar las temperaturas\n" +
                "3)Visualizar las temperaturas del mes\n" +
                "4) Dia o dias mas calurosos del mes\n" +
                "5) Salir del programa.");
        int menu_Sel = sc.nextInt();
        switch (menu_Sel)
        {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                t = true;
                break;
        }
        }while (t == false);
    }
}
