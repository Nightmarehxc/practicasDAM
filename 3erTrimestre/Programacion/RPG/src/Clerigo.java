public class Clerigo extends Pj
{

    private String godName;

    public Clerigo(String nombre, int str, int intel, int hp, String godName)
    {
        super(nombre, str, intel, hp);
        this.godName = godName;
    }

    public void Curar(Pj target)
    {
        int cura = target.getHp()+11;
        target.setHp(cura);
    }

}
