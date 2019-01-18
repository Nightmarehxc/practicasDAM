public class CreadorCursos

{
     private static int id=0;
     public int ncursos= 0;

     private Curso[] lista = new Curso[10] ;

     public CreadorCursos()
     {
         id=0;


     }
        public void CrearCurso(String a_nombre, int a_nHoras)
        {

            lista[id] = new Curso();
            lista[id].setNombre(a_nombre);
            lista[id].setHoras(a_nHoras);
            ncursos = id++;
            System.out.println("ok");
        }

}
