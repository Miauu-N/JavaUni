package localderopa;

public class Sweater extends Prenda{

    public Sweater(double precioLista) {
        super(precioLista);
        setPorcentajeGanancia(getPorcentajeGanancia() + 8);
    }
}
