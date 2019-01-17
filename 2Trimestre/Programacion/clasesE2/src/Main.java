public class Main {

    static Curso curso1 = new Curso();
    public static void main(String[] args)
    {

        curso1.setNombre();
        curso1.setHoras();
        ///la siguiente instruccion deberia ser recoger la nogitud del array
        /// y añadirle el numerodel curso


        System.out.println("Nombre del curso: "+curso1.getName());
        System.out.println("Horas: "+curso1.getnHoras());

    }
}
