package TaskManager;

import TaskManager.TaskManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskManagerTest {
    TaskManager manager;

    @BeforeEach
    void setUp() {
        manager = new TaskManager();
    }

    @Test
    public void agregarElementosYPrintear(){
        manager.addTarea("3",3);
        manager.addTarea("1",1);
        manager.addTarea("5",5);
        manager.addTarea("9",9);
        manager.addTarea("2",2);
        manager.addTarea("6",6);
        manager.addTarea("7 Vencido",7,"27/08/2024");

        assertEquals(manager.mostrarTareas(), """
                9
                6
                5
                3
                2
                1
                """);
    }

    @Test
    public void probarOrdenamientoSegunFechas(){
        manager.addTarea("2/09/2024 -- 3",3,"02/09/2024");
        manager.addTarea("1/09/2024 -- 3",3,"01/09/2024");
        manager.addTarea("3/09/2024 -- 3",3,"03/09/2024");
        manager.addTarea("9",9);
        manager.addTarea("2",2);
        manager.addTarea("3",3);
        manager.addTarea("6",6);
        manager.addTarea("7 Vencido",7,"27/08/2024");


        assertEquals(
                """
                9
                6
                1/09/2024 -- 3
                2/09/2024 -- 3
                3/09/2024 -- 3
                3
                2
                """,
                manager.mostrarTareas());

    }

}