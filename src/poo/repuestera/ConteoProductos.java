package repuestera;

public class ConteoProductos {
    private  int cantidad;

    private final Producto producto;

    public ConteoProductos(int cantidad, Producto producto) {
        this.cantidad = cantidad;
        this.producto = producto;
    }

    public int getCantidad() {
        return this.cantidad;
    }

    public Producto getProducto() {
        return this.producto;
    }

    public void plus(int cantidad){
        this.cantidad += cantidad;
    }

    public void minus(int cantidad){
        this.cantidad -= cantidad;
    }
}
