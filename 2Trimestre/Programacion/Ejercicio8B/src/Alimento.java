
import java.util.*;

/**
 * 
 */
public class Alimento {
    public static String name;
    public String tipo;
    public float peso;
    public float optTemp;

    public Alimento(String a_name,String a_tipo,float a_peso,float a_optTemp)
    {
        name = a_name;
        tipo = a_tipo;
        peso = a_peso;
        optTemp = a_optTemp;

    }

    /**
     * 
     */
    public String  setName(String a_name)
    {
        name = a_name;
        return name;
    }
    public void setType()
    {

    }
    public static String getName()
    {
        return name;
    }
}