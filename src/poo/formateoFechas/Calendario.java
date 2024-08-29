package formateoFechas;

public class Calendario {
    public static void main(String[] args) {
        Fecha fecha = new Fecha(0,"12-01-2024");
        Fecha fecha1 = new Fecha(0,"15-01-2024");
        Fecha fecha2 = new Fecha(0,"20-01-2024");
        System.out.println(fecha.mostrarFecha(0));
        System.out.println(fecha1.estaEntre(fecha,fecha2));
        System.out.println(fecha1.esMayor(fecha2));
    }
}
