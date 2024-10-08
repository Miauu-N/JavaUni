package localderopa;

public class Remera extends Prenda{

    public Remera(double precio){
        super(precio);
    }

    @Override
    public double calcularPrecioVenta() {
        double precioLista= getPrecioLista();
        precioLista += 100;
        return  precioLista + (precioLista/100) * getPorcentajeGanancia();
    }


}
