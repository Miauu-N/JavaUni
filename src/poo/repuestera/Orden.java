package repuestera;

import java.time.LocalDate;
import java.util.ArrayList;

public class Orden {
    private LocalDate fecha;

    private int numero;

    private EstadoOrden estado;

    private ArrayList<ConteoProductos> detalles;

    public Orden(int numero, LocalDate fecha){
        this.numero = numero;
        this.fecha = fecha;
        this.estado = EstadoOrden.SIN_PROCESAR;
        this.detalles = new ArrayList<>();
    }

    public void agregarProducto(Producto producto, int cantidad){
        this.detalles.add(
                new ConteoProductos(cantidad, producto)
        );
    }

    public void aceptar(){
        this.estado = EstadoOrden.ACEPTADA;
    }

    public void rechazar(){
        this.estado = EstadoOrden.RECHAZADA;
    }

    public int getNumero() {
        return this.numero;
    }

    public EstadoOrden getEstado() {
        return this.estado;
    }

    public LocalDate getFecha() {
        return this.fecha;
    }
}
