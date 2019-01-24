public class Curso
{
    public String name;
    public static float nota;
    static float media;
    public Curso()
    {
        String name;
        float  nota;
    }

    public float setNota(float a_nota)
    {
        nota = a_nota;
        return nota;
    }
    public float getNota()
    {
        return nota;
    }
    public String setName(String a_name)
    {
        name = a_name;
        return name;

        
    }
    public String getName()
    {
        return name;
    }
    public float setmediaNotas(float a_media)
    {
        media = media + a_media;

        return media;
    }
    public float setmedia()
    {
        media = media / 6;
        return media;
    }
}
