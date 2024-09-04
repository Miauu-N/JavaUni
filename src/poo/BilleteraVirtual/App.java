package BilleteraVirtual;

import java.util.ArrayList;

public class App {
    ArrayList<Moneda> monedas;
    ArrayList<Billetera> billeteras;

    public App() {
        monedas = new ArrayList<>();
        billeteras = new ArrayList<>();
    }

    public void crearMoneda(String nombre, double valor) {
        Moneda moneda = new Moneda(nombre,valor);
        monedas.add(moneda);
        return;
    }

    public void crearBilletera(String nombre, int monto, String moneda) {

        Dinero dinero = new Dinero(searchMoneda(moneda),monto);
        Billetera billetera = new Billetera(nombre,dinero);
        billeteras.add(billetera);
    }

    private Moneda searchMoneda(String moneda) {
        for (Moneda m : monedas){
            if (m.is(moneda)){
                return m;
            }
        }
        throw new RuntimeException("Moneda invalida");
    }

    public void transferir(String billetera1, String billetera2, int monto, String moneda) {
        Billetera b1 = searchBilletera(billetera1);
        Billetera b2 = searchBilletera(billetera2);
        Transferencia tf = new Transferencia(b1,b2,new Dinero(searchMoneda(moneda),monto));
    }

    private Billetera searchBilletera(String billetera) {
        for (Billetera b : billeteras){
            if (b.isFrom(billetera)){
                return b;
            }
        }
        throw new RuntimeException("Billetera invalida");
    }

    public String getSaldo(String nombre) {
        return searchBilletera(nombre).getDinero().toString();
    }
}
