import java.io.IOException;
import java.util.ArrayList;

public class Pj implements Rol
{
    String nombre;
    final String[] raza = new String[]{"Humano","Elfo","Gnomo"};
    int str;
    final int strMax = 20;

    int intel;
    final int i_Max=25;
    final int hpMax =500;
    int hp;
    int maxHechizos;
    ArrayList<Hechizo> hechizos = new ArrayList<Hechizo>();

    public Pj(String nombre, int str, int intel, int hp)
    {
        this.nombre = nombre;
        this.str = str;
        this.intel = intel;
        this.hp = hp;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String[] getRaza() {
        return raza;
    }

    public int getStr() {
        return str;
    }

    public void setStr(int str) {
        this.str = str;
    }

    public int getIntel() {
        return intel;
    }

    public void setIntel(int intel) {
        this.intel = intel;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
    ///Begin AprenderHechizo
    public void AprenderHechizo(String a_name,int dano)
    {
        int indice= hechizos.size();
        hechizos.add(indice,new Hechizo(a_name+1,dano));
    }
    ///END aprender hechizo
    ///Start Lanzar Hechizo
    public void LanzarHechizo(Pj a_target,int a_hechizo)
    {
        System.out.println("Nombre del objetivo: "+a_target.getNombre()+"\n" +
                "HP:"+a_target.getHp());
        hechizos.get(a_hechizo).getTipoHechizo();
        hechizos.get(a_hechizo).getPotencia();
        int ataque = hechizos.get(a_hechizo).getPotencia();
        int enemyHP = a_target.getHp();
        a_target.setHp(enemyHP-hechizos.get(a_hechizo).getPotencia());
        System.out.println("HP restante: "+a_target.getHp());
    }
    ///End Lanzar echizo
    void  OlvidadHechizos() throws IOException
    {
        for(int i =0;i< hechizos.size();i++)
        {
            System.out.println(i+") Nombre Hechizo: "+hechizos.get(i).getTipoHechizo()+"\n" +
                    "Fza de hechizo: "+hechizos.get(i).getPotencia());
        }
        System.out.println("Que hechizo quieres olvidar?");
        int i = System.in.read();
        hechizos.remove(i);
    }
   public void MostrarHechizos()
    {
        for(int i =0;i< hechizos.size();i++)
        {
            System.out.println(i+") Nombre Hechizo: "+hechizos.get(i).getTipoHechizo()+"\n" +
                    "Fza de hechizo: "+hechizos.get(i).getPotencia());
        }
    }
}
