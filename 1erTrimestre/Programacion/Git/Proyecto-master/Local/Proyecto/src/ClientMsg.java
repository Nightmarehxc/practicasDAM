import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientMsg
{

    // Cliente
    public static void InitClient()
    {
        Scanner input = new Scanner(System.in);
        String servidor="";
        int port=0;
        String msg ="";
        Socket sc;
        DataOutputStream mensaje;
        DataInputStream entrada;
        System.out.println("Escribe la direccion del servidor");
        servidor = input.nextLine();
        System.out.println("Escribe la direccion el puerto");
        port = input.nextInt();

        try
        {
            sc = new Socket (servidor,port);
            //Creamos el flujo de datos
            System.out.println("Escribe el mensaje");
            msg = input.nextLine();
            mensaje = new DataOutputStream(sc.getOutputStream());
            ///Enviamos el mensaje

            mensaje.writeUTF(msg);
            ///Cerramos conexion

            sc.close();
            //Menu.MenuPrincipal();
        }catch (Exception e)
        {
            System.out.println("Error "+ e.getMessage());
        }


    }
}
