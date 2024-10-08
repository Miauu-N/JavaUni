package localderopa;

public class Prenda {
    private double precioLista;
    private int porcentajeGanancia;

    public Prenda(double precioLista){
        this.precioLista= precioLista;
        this.porcentajeGanancia=10;
    }

    protected void setPorcentajeGanancia(int porcentajeGanancia) {
        this.porcentajeGanancia = porcentajeGanancia;
    }

    public int getPorcentajeGanancia() {
        return this.porcentajeGanancia;
    }

    public double getPrecioLista() {
        return this.precioLista;
    }

    public  double calcularPrecioVenta( ){
        return this.precioLista + ( this.precioLista/100) * this.porcentajeGanancia;
    }

}
