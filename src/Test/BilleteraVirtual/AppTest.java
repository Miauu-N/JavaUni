package BilleteraVirtual;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    App app;

    @BeforeEach
    void setUp() {
        this.app = new App();
        app.crearMoneda("Dolar",1);
        app.crearMoneda("ars",0.001);
        app.crearBilletera("Romero Nicolas",100,"Dolar");
        app.crearBilletera("Graciano Elias",100,"Dolar");
    }

    @Test
    void crearMoneda(){
        app.crearMoneda("Dolar",1);
    }

    @Test
    void crearBilletera() {
        app.crearBilletera("Romero Nicolas",100,"Dolar");
    }

    @Test
    void transferencia(){
        app.transferir("Romero Nicolas","Graciano Elias",100,"Dolar");
        assertEquals("0.0 Dolars", app.getSaldo("Romero Nicolas"));
        assertEquals("200.0 Dolars", app.getSaldo("Graciano Elias"));
    }

    @Test
    void transferenciaConversor(){
        app.transferir("Romero Nicolas","Graciano Elias",100,"ars");
        assertEquals("99.9 Dolars", app.getSaldo("Romero Nicolas"));
        assertEquals("100.1 Dolars", app.getSaldo("Graciano Elias"));
    }
}
