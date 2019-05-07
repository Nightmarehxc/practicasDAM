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
    void AprenderHechizo()
    {
        int indice= hechizos.size();

        hechizos.add(indice,new Hechizo("Fuego Nivel "+1,1));


    }
    void LanzarHechizo(String a_objetivo,int a_hechizo)
    {
        hechizos.get(a_hechizo).getTipoHechizo();
        hechizos.get(a_hechizo).getPotencia();
        int ataque = hechizos.get(a_hechizo).getPotencia();


    }
    ///END aprender hechizo
}
