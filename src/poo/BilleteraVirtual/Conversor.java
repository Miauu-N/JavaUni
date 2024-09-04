package BilleteraVirtual;

public class Conversor {
    public static Dinero convertir(Dinero dinero, Moneda moneda) {
        double a = dinero.getMoneda().getValor() / moneda.getValor() * dinero.getMonto();
        return new Dinero(moneda,a);
    }
}
