public class Motor extends Coche
{

    public Motor(String color, float velocidad, String modelo, String marca, Motor mot) {
        super(color, velocidad, modelo, marca, mot);
    }

    public void Encender()
    {
        if (motor == true)
        {
            System.out.println("El motor ya esta encendido");
        }
        else
            {
                this.motor = true;
                this.velocidad = 0.01f;
            }
    }
    public void Apagar()
    {
        if (motor == false)
        {
            System.out.println("El motor ya esta apagado");
        }
        else
        {
            this.motor = false;
            this.velocidad = 0.00f;
        }
    }
    public void acelerar()
    {
        this.velocidad++;
    }
    public void frenar()
    {
        this.velocidad--;
    }
}
