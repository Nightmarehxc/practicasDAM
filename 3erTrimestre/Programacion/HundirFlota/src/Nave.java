public class Nave
{
    String name;
    int start,longitud;
    int[][] heal;/// la primera matriz se encargara de definir la posicion donde impacta, y la segunda el heal que tiene la nave 0=no impacto 1 Impacto
    int azimut; //Rumbo 0 Horzizontal 1 Vertical


    void CrearLancha()
    {
        this.name = "Lancha";
        this.longitud = 1;
        heal = new int[longitud][2];
    }
    void CrearFragata()
    {
        this.name = "Fragata";
        this.longitud = 2;
    }
    void CrearSubmarino()
    {
        this.name="Submarino";
        this.longitud = 3;
    }
    void CrearDestructor()
    {
        this.name="Destructor";
        this.longitud = 4;
    }
    void CrearAcorazado()
    {
        this.name = "Acorazado";
        this.longitud = 5;
    }
    void CrearPortaAviones()
    {
        this.name = "PortaAviones";
        this.longitud= 6;
    }
    public int Impacto(heal)
    {
        int
        return heal[][];
    }
}
