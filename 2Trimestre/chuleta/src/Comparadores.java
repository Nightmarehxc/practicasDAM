public class Comparadores
{
    public void Comparar()
    {

        String c1 = "Hola";
        String c2 = "Hola";
        if (c1 == c2) System.out.println("c1==C2 es verdad");
        else System.out.println("c1==C2 es falso");
        if (c1.equals(c2)) System.out.println("c1.equals(c2) es verdad");
        else System.out.println("c1.equals(c2) es falso");
        if (c1 == "Hola") System.out.println("c1==\"Hola\" es verdad");
        else System.out.println("c1==\"Hola\" es falso");
        String c3 = "HolaAdios";
        System.out.println("c1 = " + c1);
        System.out.println("c3 = " + c3);
        System.out.println("c1+\"Adios\" = " + c1 + "Adios");
        if (c3 == c1 + "Adios") System.out.println("c3==c1 es verdad");
        else
            System.out.println("c3==c1 es falso");//ya que no estamos comparando dos        //literales que si compartirian el mismo objeto
    }
}
