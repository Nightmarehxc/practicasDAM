import java.io.BufferedReader;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Map;

public class ServerMsg
{

    ///
    public static void initServer() {
        final int port=5000;
        ServerSocket sc;
        Socket so;

        DataOutputStream salida;
        String copy;

        BufferedReader entrada;
        try {
            sc = new ServerSocket(port);//Crea un socket servidor a la ecucha
            so = new Socket();
            System.out.println("Esperando una conexion");
            so = sc.accept();
            ///Inicia el socket, Esperando una conexion por parte del cliente
            System.out.println("Un cliente se a conectado");
            ///  Canales de entrada y salida de datos
            entrada = new BufferedReader(new InputStreamReader(so.getInputStream()));
            salida =  new DataOutputStream(so.getOutputStream());
            System.out.println("Confirmando conexion con el cliente...");
            salida.writeUTF("Conexion Exitosa");

            ///Recepcion del mensaje
            copy = entrada.readLine();
            System.out.println(copy);
            //Thread.sleep(4000);
            salida.writeUTF("Se a recibido tu mensaje.\n Terminando conexion...");
            salida.writeUTF("esperamos verte pronto");
            System.out.println("Cerrando conexion");
            sc.close();//Cierro conexion
        } catch(Exception e)
        {
            System.out.println("Error: "+e.getMessage());
        }
        /*this.value = entry.getValue();
        this.key = entry.getKey();
        entry e= (entry)
        Entry e = (Entry) o;

        if (Key == q){}*/
    }

}
