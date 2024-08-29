package TaskManager;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class TaskTest {
    public static Task tareaEjemplo;
    public static Task tareaAnterior;
    public static Task tareaPosterior;

    @BeforeEach
    void setUp() {
        tareaEjemplo = new Task("Hacerme mate",2);
        tareaAnterior = new Task("Dar el final de matematica discreta",10,"31/07/2024");
        tareaPosterior = new Task("Aprender a usar JavaScript",6,"12/07/2025");
    }

    @Test
    public void tacharTarea(){
        tareaEjemplo.terminada();
        assertEquals(tareaEjemplo.mostrarTarea(),"(Terminada) Hacerme mate");
    }
    @Test
    public void tareaVencida(){
        assertTrue(tareaAnterior.isVencida());
        assertEquals(tareaAnterior.mostrarTarea(),"(Vencida) Dar el final de matematica discreta");
    }
    @Test
    public void tareaSinFecha(){
        assertEquals(tareaEjemplo.mostrarTarea(),"Hacerme mate");
    }

}