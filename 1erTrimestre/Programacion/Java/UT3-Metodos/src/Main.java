import java.util.Scanner;

import static java.lang.String.valueOf;

public class Main
{
    public static void main(String[] args)
    {
        String lector = null;
        Scanner sc = new Scanner(System.in);
        boolean eMenu =false;


        do {
            Menu.MainMenu();
            System.out.println("¿Pulsa Q si quieres cerrar?");
            System.out.println("¿Pulsa 1 Para cargar el menu");
            lector = sc.nextLine();
            if (lector == "1")
            {
                Menu.MainMenu();
            }
            else if(lector == "q")
            {
                eMenu = true;
            }




        }while(eMenu == true);


    }

}

