import java.util.Scanner;

public class Menu
{

    public static int MainMenu()
    {

        Scanner sc = new Scanner(System.in);


        System.out.println("Menu de seleccion practica UT3-Metodos");
        System.out.println("1) Ventas");
        System.out.println("2) Persistencia multiplicativa");
        System.out.println("3) Sobre la tela de una araña");
        int menuSel = sc.nextInt();
        switch (menuSel)
        {
            case 1:
                Caja.Ingresar();
                break;

            case 2:
                PersistenciaMutiplicativa.Ejercicio();
                break;
            case 3:
                TelaAraña.Tela();
                break;
        }
        return 0;
    }
}
