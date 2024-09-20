package repuestera;

import java.util.ArrayList;
import java.util.HashMap;

public class Stock {
    private ArrayList<ConteoProductos> stock;

    public Stock() {
        this.stock = new ArrayList<>();
    }

    public boolean hayDisponible(Producto producto, int cantidad){
        for (ConteoProductos x : stock){
            if (x.getProducto() == producto){
                return x.getCantidad() >= cantidad;
            }
        }
        return false;
    }

    public void agregarStock(Producto producto, int cantidad){
        for (ConteoProductos x : stock){
            if (x.getProducto().equals(producto)){
                x.plus(cantidad);
            }
        }
    }
}
