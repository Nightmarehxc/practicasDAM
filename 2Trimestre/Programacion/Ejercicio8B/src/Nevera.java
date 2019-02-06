
import java.util.*;

/**
 * 
 */
public class Nevera extends Mueble{
    static public boolean stateDoor;
    static public float temp;
    public String contenedor[] = new String[capacidad];

    /**
     * Default constructor
     */
    public Nevera(int a_capacidad,float a_temp, boolean a_stateDoor,float a_sizeX,float a_sizeY)
    {
        temp = a_temp;
        sizeX =a_sizeX;
        sizeY =a_sizeY;
        capacidad = a_capacidad;
    }


    public void abrirPuerta()
    {
        if(stateDoor==true)
        {
            System.out.println("La puerta ya esta abierta");
        }
        else
            {
                stateDoor = true;
                System.out.println("La puerta esta abierta");
            }
    }
    public void cerrarPuerta()
    {
        if(stateDoor==false)
        {
            System.out.println("La puerta ya esta cerrada");
        }
        else
        {
            stateDoor = false;
            System.out.println("La puerta acaba de cerrase");
        }
    }
    public void cDoorState()
    {
        if(stateDoor==false)
        {
            System.out.println("La puerta ya esta cerrada");
        }
        else
        {
            System.out.println("La puerta ya esta abierta");
        }
    }

    public void bajarTemperatura()
    {
        temp--;
    }
    public void subirTemperatura()
    {
        temp++;
    }

    public static float getTemp()
    {
        temp = temp;
        return temp;
    }
}