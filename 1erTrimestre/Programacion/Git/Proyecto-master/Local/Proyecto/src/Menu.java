import java.util.Scanner;

class Menu
{
    public static int MenuPrincipal()
    {
        System.out.println("##################################################################################################");
        System.out.println("################################--------Menu----------v.A.0.0.1----------#########################");
        System.out.println("##################################################################################################");
        System.out.println("##############################No se java y hay que darle en casa##################################");
        System.out.println("##################################################################################################");
        System.out.println("#######Bienvenido usuario, ¿Que programa deseas ejacutar?");
        System.out.println("##################################################################################################");
        System.out.println("1)Sucesión de Fibonacci");
        System.out.println("2)Aplicaciones de servidor");
        System.out.println("3) CFG");
        System.out.println("0 Salir");
        System.out.println("##################################################################################################");

    Scanner sc = new Scanner(System.in);

    int input =sc.nextInt();

    switch (input)
    {
        case 1:
            Fibonacci.NumerosF();
            break;
        case 2:
            System.out.println("1 Servidor Mensajeria v0.1");
            System.out.println("2 Cliente v.01");
            System.out.println("0 Salir");
            input = sc.nextInt();
                switch (input)
                {
                    case 1:
                        ServerMsg.initServer();
                        break;
                    case 2:
                        ClientMsg.InitClient();
                        break;
                    case 0:
                        System.out.println("....");
                        Menu.MenuPrincipal();
                        break;

                }
        case 3:
            Lector.LeerCFGServer();
            break;
        case 0:
            System.out.println("Cerrando programa....");
            break;
    }

        return 0;
    }
}
