/*Corral González, Diego
 */
package Clases;

//SUPERCLASE ABSTRACTA
public abstract class Ordenador {

    //DECLARACIÓN DE VARIABLES
    private int ram;
    private double hdd;
    private String procesador;
    private String grafica;
    private double precio;

    //CONSTRUCTOR POR DEFECTO
    public Ordenador(){
        
    }
    
    //CONSTRUCTOR
    public Ordenador(int ram, double hdd, String procesador, String grafica, double precio){
        this.ram=ram;
        this.hdd=hdd;
        this.procesador=procesador;
        this.grafica=grafica;
        this.precio=precio;
    }
    
    //GETTERS Y SETTERS
    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public double getHdd() {
        return hdd;
    }

    public void setHdd(double hdd) {
        this.hdd = hdd;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getGrafica() {
        return grafica;
    }

    public void setGrafica(String grafica) {
        this.grafica = grafica;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    //MÉTODO QUE DEVOLVERÁ LOS VALORES GENÉRICOS DE CADA TIPO DE ORDENADOR
    public void mostrarDatosHW(){
        System.out.println("Las cracterísticas generales de este hardware son: \nRAM:"+getRam());
        System.out.println("Tamaño disco duro:" +getHdd()+" GB");
        System.out.println("Procesador:" +getProcesador());
        System.out.println("Tarjeta gráfica:" +getGrafica());
        System.out.println("Precio:" +getPrecio()+" euros\n");
    }
    
    //MÉTODO ABSTRACTO QUE INDICA QUE CADA TIPO DE ORDENADOR DEBE MOSTRAR SUS DATOS RELEVANTES PROPIOS DE SU CLASE
    public abstract void mostrarDatos();
    
}