package ar.unlu.edu.poo.formateoFechas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Fecha {
    static private final DateTimeFormatter parser = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    static private final DateTimeFormatter parser2 = DateTimeFormatter.ofPattern("MM-dd-yyyy");
    private final LocalDate fecha;

    /**
     *  parametros: Modo,Fecha <p>
     *  Modos: <p>
     *      0 = "dd-MM-yyyy" <p>
     *      1 = "MM-dd-yyyy" <p>
     */
    public Fecha(int modo,String fecha){
        if (modo == 0){
            this.fecha = LocalDate.parse(fecha,parser);
        }
        else {
            this.fecha = LocalDate.parse(fecha,parser2);
        }
    }

    public LocalDate getFecha(){
        return this.fecha;
    }

    public boolean estaEntre(Fecha a,Fecha b){
        return (a.getFecha().isBefore(fecha) && b.getFecha().isAfter(fecha)) || (b.getFecha().isBefore(fecha) && a.getFecha().isAfter(fecha));
    }

    public boolean esMayor(Fecha a){
        return fecha.isAfter(a.getFecha());
    }

    public boolean esMenor(Fecha a){
        return fecha.isBefore(a.getFecha());
    }

    /**
     *  parametros: Modo <p>
     *  Modos: <p>
     *      0 = "dd-MM-yyyy" <p>
     *      1 = "MM-dd-yyyy" <p>
     */
    public String mostrarFecha(int modo){
        if (modo == 0){
            return fecha.format(parser);
        }
        else{
            return fecha.format(parser2);
        }
    }
}
