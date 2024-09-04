package BilleteraVirtual;

public class Dinero {
    private Moneda moneda;
    private double monto;

    public Dinero(Moneda moneda, double monto) {
        this.moneda = moneda;
        this.monto = monto;
    }

    public Moneda getMoneda() {
        return this.moneda;
    }

    public void setMoneda(Moneda moneda) {
        this.moneda = moneda;
    }

    public double getMonto() {
        return this.monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public boolean hasSameMoneda(Dinero dinero) {
        return moneda.equals(dinero.moneda);
    }

    public String toString(){
        return monto + moneda.getNombre() + "s";
    }

    public void minus(double monto) {
        this.monto -= monto;
    }

    public void plus(double monto) {
        this.monto += monto;
    }
}
