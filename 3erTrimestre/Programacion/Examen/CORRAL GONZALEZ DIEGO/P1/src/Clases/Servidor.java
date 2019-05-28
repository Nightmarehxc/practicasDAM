/*Corral González, Diego
 */
package Clases;

public class Servidor extends Ordenador{
    
    private double tMonitor;
    private String modTeclado;
    private String modRaton;
    
    //CONSTRUCTOR POR DEFECTO
    public Servidor(){
        
    }

    //CONSTRUCTOR SOBRECARGADO CON PARÁMETROS PROPIOS
    public Servidor(int ram, double hdd, String procesador, String grafica, double precio, double tMonitor, String modTeclado, String modRaton) {
        super(ram, hdd, procesador, grafica, precio);
        this.tMonitor=tMonitor;
        this.modTeclado=modTeclado;
        this.modRaton=modRaton;
    }
    
    //GETTERS Y SETTERS
    public double gettMonitor() {
        return tMonitor;
    }

    public void settMonitor(double tMonitor) {
        this.tMonitor = tMonitor;
    }

    public String getModTeclado() {
        return modTeclado;
    }

    public void setModTeclado(String modTeclado) {
        this.modTeclado = modTeclado;
    }

    public String getModRaton() {
        return modRaton;
    }

    public void setModRaton(String modRaton) {
        this.modRaton = modRaton;
    }
    
     //MÉTODO ABSTRACTO HEREDADO DE LA CLASE PADRE QUE MUESTRA LOS DATOS PROPIOS DE ESTA
    public void mostrarDatos() {
        System.out.println("Los valores de este SERVIDOR son: ");
        System.out.println("Tamaño monitor: "+gettMonitor()+" pulgadas");
        System.out.println("Tipo de teclado: "+getModTeclado());
        System.out.println("Tipo de ratón: "+getModRaton());
        mostrarDatosHW();
    }
    
}
