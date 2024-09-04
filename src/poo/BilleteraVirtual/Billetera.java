package BilleteraVirtual;

public class Billetera {
    String usuario;
    Dinero dinero;

    public Billetera(String usuario, Dinero dinero) {
        this.usuario = usuario;
        this.dinero = dinero;
    }

    public boolean isFrom(String billetera) {
        return usuario.equals(billetera);
    }

    public boolean has(Dinero dinero) {
        if (dinero.hasSameMoneda(this.dinero)){
            return this.dinero.getMonto() >= dinero.getMonto();
        }
        else {
            return has(Conversor.convertir(dinero,this.dinero.getMoneda()));
        }
    }

    public void debitar(Dinero dinero) {
        if (dinero.hasSameMoneda(this.dinero)){
            this.dinero.minus(dinero.getMonto());
        }
        else {
            debitar(Conversor.convertir(dinero,this.dinero.getMoneda()));
        }
    }

    public void acreditar(Dinero dinero) {
        if (dinero.hasSameMoneda(this.dinero)){
            this.dinero.plus(dinero.getMonto());
        }
        else {
            acreditar(Conversor.convertir(dinero,this.dinero.getMoneda()));
        }
    }

    public Dinero getDinero() {
        return this.dinero;
    }
}
