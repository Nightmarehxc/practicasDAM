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
    void AprenderHechizo()
    {
        int indice= hechizos.size();

        hechizos.add(indice,new Hechizo("Fuego Nivel "+1,1));


    }
    ///END aprender hechizo
    ///Start Lanzar Hechizo
    void LanzarHechizo(Pj a_target,int a_hechizo)
    {
        hechizos.get(a_hechizo).getTipoHechizo();
        hechizos.get(a_hechizo).getPotencia();
        int ataque = hechizos.get(a_hechizo).getPotencia();
    }
    ///End Lanzar echizo
    void  OlvidadHechizos() throws IOException {
        for(int i =0;i< hechizos.size();i++)
        {
            System.out.println(i+") Nombre Hechizo: "+hechizos.get(i).getTipoHechizo());

        }
        System.out.println("Que hechizo quieres olvidar?");
        int i = System.in.read();
        hechizos.remove(i);
    }

}
