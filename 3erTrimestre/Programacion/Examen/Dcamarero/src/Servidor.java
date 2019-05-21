////AUTOR CAMARERO ABELLA DANIEL
public class Servidor extends Ordenador {
    float monitor;
    String m_Teclado;
    String m_Raton;

    public Servidor(int ram, float hdd,String cpu, String gpu, float price, float a_monitor, String a_Teclado, String a_Raton) {
        super(ram, hdd,cpu , gpu, price);
        this.monitor = a_monitor;
        this.m_Teclado = a_Teclado;
        this.m_Raton = a_Raton;
    }

    public float getMonitor() {
        return monitor;
    }

    public void setMonitor(float monitor) {
        this.monitor = monitor;
    }

    public String getM_Teclado() {
        return m_Teclado;
    }

    public void setM_Teclado(String m_Teclado) {
        this.m_Teclado = m_Teclado;
    }

    public String getM_Raton() {
        return m_Raton;
    }

    public void setM_Raton(String m_Raton) {
        this.m_Raton = m_Raton;
    }

    @Override
    void mostrarValores() {
        System.out.println("Monitor: " + getMonitor());
        super.mostrarValores();

    }
}
