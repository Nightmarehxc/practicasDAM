////AUTOR CAMARERO ABELLA DANIEL
public class Ordenador implements Prestable {
    int ram;
    float hdd;
    String cpu;
    String gpu;
    float price;


    public Ordenador(int ram, float hdd,String cpu, String gpu, float price) {
        this.ram = ram;
        this.cpu = cpu;
        this.hdd = hdd;
        this.gpu = gpu;
        this.price = price;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public float getHdd() {
        return hdd;
    }

    public void setHdd(float hdd) {
        this.hdd = hdd;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    void mostrarValores() {
        System.out.println("CPU:" + getCpu());
        System.out.println("ram:" + getRam());
        System.out.println("hdd:" + getHdd());
        System.out.println("gpu:" + getGpu());
        System.out.println("price:" + getPrice());
        System.out.println("-----------------------------");///SEPARADOR

    }
}
