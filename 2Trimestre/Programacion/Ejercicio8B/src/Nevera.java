
import java.util.*;

/**
 * 
 */
public class Nevera{
    static public boolean stateDoor;
    static public float temp;


    /**
     * Default constructor
     */
    public Nevera(boolean stateDoor,float sizeX,float sizeY)
    {

        sizeX=0.5f;
        sizeY=1.5f;
        float temp;
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
            System.out.println("La puerta esta cerrada");
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
            System.out.println("La puerta esta abierta");
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