package localderopa;

import java.util.ArrayList;
import java.util.Objects;

public class App {
    public ArrayList<MediosDePago> mediosDePagos;
    public ArrayList<Prenda> prendas;

    public App() {
        this.mediosDePagos = new ArrayList<>();
        this.prendas = new ArrayList<>();
    }

    public void agregarMedioDePago(MediosDePago medio){
        this.mediosDePagos.add(medio);
    }

    public void agregarPrenda(Prenda prenda){
        this.prendas.add(prenda);
    }

    public MediosDePago buscarMedioDePago(MediosDePago medio){
        for( MediosDePago resultado : mediosDePagos){
            if(Objects.equals(medio,resultado)) {
                return resultado;
            }
        }
        return null;
    }

    public Prenda buscarPrenda(Prenda prenda){
        for( Prenda resultado : prendas){
            if(Objects.equals(prenda,resultado)) {
                return resultado;
            }
        }
        return null;
    }

    public double precioPrendaConMedioDePago(Prenda prenda,MediosDePago medio){
        return  medio.calcularPrecioFinal(prenda.calcularPrecioVenta());
    }
}
