public class Producto
{

    int cod;
    String name;
    int stock;
    double price;
    public Producto()
    {
        int cod;
        String name;
        int stock;
        double price;
    }

    public int getCod() {
        return cod;
    }

    public String getName() {
        return name;
    }

    public int getStock() {
        return stock;
    }

    public double getPrice() {
        return price;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void vender(int a_venta)
    {
        stock = stock - a_venta;
    }
}
