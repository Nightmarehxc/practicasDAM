import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Mago extends Pj
{
    int maxHechizos;
    ArrayList<Hechizo> hechizos = new ArrayList<Hechizo>();
    //constructor
    public Mago(String nombre, int str, int intel, int hp)
    {
        super(nombre, str, intel, hp);

    }
    //endConstructor

    ///BEGIN aprender hechizo


    @Override
    public void AprenderHechizo(String a_name,int dano) {
        super.AprenderHechizo(a_name,dano);
    }
}
