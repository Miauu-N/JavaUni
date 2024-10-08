package localderopa;

public class TarjetaDorada extends Tarjeta{

    @Override
    public double calcularPrecioFinal(double precio){
        return ((1.5 * precio) / 100 + precio - 100);
    }
}
