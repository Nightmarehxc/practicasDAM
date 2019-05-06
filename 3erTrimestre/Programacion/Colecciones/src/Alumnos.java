public class Alumnos
{
    String name;
    int age;
    String matricula;

    public Alumnos(String name, int age,String matricula) {
        this.name = name;
        this.age = age;
        this.matricula = matricula;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public String getMatricula()
    {
        return matricula;
    }
}
