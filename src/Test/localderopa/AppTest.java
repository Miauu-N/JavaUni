package localderopa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    App app;

    @BeforeEach
    void setApp(){
        app= new App();
        app.agregarPrenda(new Remera(100));
        app.agregarMedioDePago(new Efectivo());
    }

    @Test
    public void probando(){
        Remera remera = new Remera(100);
        Efectivo efectivo= new Efectivo();
        app.agregarPrenda(remera);
        app.agregarMedioDePago(efectivo);
        double precio= efectivo.calcularPrecioFinal(remera.calcularPrecioVenta());
        System.out.println(precio);

    }


}