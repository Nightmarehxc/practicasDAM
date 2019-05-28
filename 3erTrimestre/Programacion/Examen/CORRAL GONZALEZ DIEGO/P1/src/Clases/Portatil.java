/*Corral González, Diego
 */
package Clases;

//SUBCLASE PORTATIL QUE HEREDA DE ORDENADOR
public class Portatil extends Ordenador implements Prestable{

    private String marca;
    private double tPantalla;
    private int peso;
    
    //CONSTRUCTOR POR DEFECTO
    public Portatil(){
        
    }

    //CONSTRUCTOR SOBRECARGADO CON PARÁMETROS PROPIOS
    public Portatil(int ram, double hdd, String procesador, String grafica, double precio, String marca, double tPantalla, int peso) {
        super(ram, hdd, procesador, grafica, precio);
        this.marca = marca;
        this.tPantalla = tPantalla;
        this.peso = peso;
    }
    
    //GETTERS Y SETTERS
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double gettPantalla() {
        return tPantalla;
    }

    public void settPantalla(double tPantalla) {
        this.tPantalla = tPantalla;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    //MÉTODOS QUE IMPLEMENTA DE LA INTERFAZ
    public int prestar(){
        
        return 0;
    }
    
    public int devolver(){
        return 1;
    }
    
    public int prestado(){
        return -1;
    }
    
    //MÉTODO ABSTRACTO HEREDADO DE LA CLASE PADRE QUE MUESTRA LOS DATOS PROPIOS DE ESTA
    public void mostrarDatos() {
        System.out.println("Los valores de este PORTATIL son: ");
        System.out.println("Marca: "+getMarca());
        System.out.println("Tamaño de pantalla: "+gettPantalla()+" pulgadas");
        System.out.println("Peso: "+getPeso()+" gramos");
        mostrarDatosHW();
    }
}
