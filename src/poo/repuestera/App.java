package repuestera;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class App {
    Stock stock;
    ArrayList<Orden> ordenes;
    ArrayList<Orden> ordenesTerminadas;


    public App() {
        stock = new Stock();
        ordenes = new ArrayList<>();
        ordenesTerminadas = new ArrayList<>();
    }

    public void addOrden(String fecha,int numero){
        DateTimeFormatter parser = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        ordenes.add(new Orden(numero, LocalDate.parse(fecha,parser)));

    }

}
