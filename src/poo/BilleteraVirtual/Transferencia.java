package BilleteraVirtual;

public class Transferencia {
    private Billetera billetera1;
    private Billetera billetera2;
    private Dinero dinero;

    public Transferencia(Billetera billetera1,Billetera billetera2, Dinero dinero) {
        this.billetera1 = billetera1;
        this.billetera2 = billetera2;
        this.dinero = dinero;
        if (billetera1.has(dinero)) {
            billetera1.debitar(dinero);
            billetera2.acreditar(dinero);
        }

    }
}
