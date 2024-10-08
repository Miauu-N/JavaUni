package localderopa;

public class Tarjeta extends MediosDePago{
    @Override
    public double calcularPrecioFinal(double precio) {
        return  precio /  100 + precio;
    }
}
