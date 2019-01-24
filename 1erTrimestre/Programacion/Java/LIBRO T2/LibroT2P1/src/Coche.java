class Coche
{
    private  int velocidad;
    Coche() {velocidad=0;}
    public int GetVelocidad(){return  velocidad;}
    public void acelera (int mas){velocidad+=mas}
    public void frena(int menos){velocidad-=menos}

}
