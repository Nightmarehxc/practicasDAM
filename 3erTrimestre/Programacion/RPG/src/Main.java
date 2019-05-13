import java.util.ArrayList;

public class Main {

    static ArrayList<Pj> listaPlayers = new ArrayList<>();
    public static void main(String[] args)
    {
        ////Crear Players
        listaPlayers.add(new Mago("Gnomo Ilusionista",4,6,50));
        listaPlayers.add(new Mago("Elfo Guerrero",4,6,50));
        listaPlayers.add(new Clerigo("Chaman",4,6,50,"Y"));
        ////End Crear Players
///Aprender Skills

        listaPlayers.get(0).AprenderHechizo("Fuego",10);
        listaPlayers.get(0).AprenderHechizo("Tierra",20);
        listaPlayers.get(0).AprenderHechizo("Aire",30);
        listaPlayers.get(1).AprenderHechizo("Agua",30);
        listaPlayers.get(2).AprenderHechizo("Curar",-11);
///END Aprender Skills
///Mostrar skills
        for(int i=0; i < listaPlayers.size();i++)
        {
            System.out.println("Nombre: "+listaPlayers.get(i).getNombre());
            listaPlayers.get(i).MostrarHechizos();
        }

///End Mostrar skills
    ///Ataques

        listaPlayers.get(0).LanzarHechizo(listaPlayers.get(1),1);
        listaPlayers.get(1).LanzarHechizo(listaPlayers.get(0),0);
        listaPlayers.get(2).LanzarHechizo(listaPlayers.get(1),0);
        listaPlayers.get(0).LanzarHechizo(listaPlayers.get(1),2);

        for(int i=0; i < listaPlayers.size();i++)
        {
            System.out.println("Nombre: "+listaPlayers.get(i).getNombre()+"\n" +
                    "HP: "+listaPlayers.get(i).getHp());
            listaPlayers.get(i).MostrarHechizos();
        }
    }
}
