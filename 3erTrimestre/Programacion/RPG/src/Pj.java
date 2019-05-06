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

}
