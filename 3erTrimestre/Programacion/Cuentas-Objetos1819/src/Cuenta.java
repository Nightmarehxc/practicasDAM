public class Cuenta
{
    private int id;
    private String Nombre;
    private String Apellido;
    private String Apellido2;
    private float saldo;

    public Cuenta(int a_id, String a_nombre, String a_apellido, String a_apellido2, int a_saldo)
    {
        this.id = a_id;
        this.Nombre = a_nombre;
        this.Apellido = a_apellido;
        this.Apellido2 = a_apellido2;
        this.saldo = a_saldo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String a_nombre) {
        Nombre = a_nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String a_apellido) {
        Apellido = a_apellido;
    }

    public String getApellido2() {
        return Apellido2;
    }

    public void setApellido2(String a_apellido2) {
        Apellido2 = a_apellido2;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float a_saldo)
    {
        this.saldo = a_saldo;
    }
    public void sacarDinero(float a_saldo)
    {
        if(a_saldo > this.saldo)
        {
            System.out.println("No hay tanto dinero en la cuenta");
        }
        else {this.saldo = this.saldo - a_saldo;
        }
    }
    public void ingresarDinero(float a_saldo)
    {
        this.saldo = this.saldo + a_saldo;
    }
}
