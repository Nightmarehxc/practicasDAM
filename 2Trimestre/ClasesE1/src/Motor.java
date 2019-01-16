public class Motor extends Coche
{

    public static boolean motor = false;

    public Motor(String color, float velocidad, String modelo, String marca/* Motor mot*/)
    {
        super(color, velocidad, modelo, marca/*mot*/);
    }

/*
    public boolean Encender()
    {
        Mover a setOn
        if (motor)
        {
            System.out.println("El motor ya esta encendido");
        }
        else
            {
                motor = true;
                System.out.println("Motor encendido");
                Motor.acelerar();


            }
        return Coche.motor;
    }
    */
    public static boolean setOn()
    {
        motor = true;
        System.out.println("Motor encendido");


        return motor;
    }

    public void Apagar()
    {
        if (motor == false)
        {
            System.out.println("El motor ya esta apagado");
        }
        else
        {
            motor = false;
            velocidad = 0.00f;
        }
    }
    public static float acelerar()
    {
        velocidad++;
        return velocidad;
    }
    public float getVelocidad()
    {
        return velocidad;
    }
    public float frenar()
    {
        velocidad--;
        return velocidad;
    }

}
