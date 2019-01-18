public class CreadorCursos

{
     public static int id=0;
     public int ncursos= 1;

     public Curso[] lista = new Curso[ncursos];

     public CreadorCursos()
     {
         id=0;
         ncursos=1;


     }
        public void CrearCurso(String a_nombre, int a_nHoras)
        {

            lista[id] = new Curso();
            lista[id].setNombre(a_nombre);
            lista[id].setHoras(a_nHoras);
            ncursos = id + 1;
            System.out.println("Curso "+a_nombre+"Creado con exito. "+" ID del curso: "+id);
            System.out.println("Numero de cursos "+ncursos);
        }
        public int SelectCurso(int a_id)
        {
            id = a_id;
            return id;

        }
        public void MostrarCurso()
        {
            System.out.println("ID : " +id);
            System.out.println("Nombre del curso "+lista[id].getName());
            System.out.println("Duracion del curso "+lista[id].getnHoras()+" Horas");

        }

}
