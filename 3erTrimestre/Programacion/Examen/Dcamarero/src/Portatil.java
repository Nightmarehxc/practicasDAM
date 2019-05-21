////AUTOR CAMARERO ABELLA DANIEL
public class Portatil extends Ordenador
{
    String marca;
    float peso;
    float pantalla;

    public Portatil(int ram, float hdd,String cpu, String gpu, float price,String a_marca,float a_peso,float a_pantalla)
    {
        super(ram, hdd,cpu, gpu, price);
        this.marca = a_marca;
        this.peso = a_peso;
        this.pantalla = a_pantalla;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getPantalla() {
        return pantalla;
    }

    public void setPantalla(float pantalla) {
        this.pantalla = pantalla;
    }

    @Override
    void mostrarValores() {

        System.out.println("Pantalla: "+getPantalla());
        System.out.println("Marca: "+getMarca());
        System.out.println("Peso: "+getPeso());
        super.mostrarValores();


    }
}
