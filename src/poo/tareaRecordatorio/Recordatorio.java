package tareaRecordatorio;

import TaskManager.Task;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Recordatorio extends Task {
    private static final DateTimeFormatter parser = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    LocalDate recordatorio;

    /**
     *  Formato: "dd/MM/yyyy"
     */
    public Recordatorio(String descripcion, int prioridad, String fechaLimite, String recordatorio) {
        super(descripcion, prioridad, fechaLimite);
        this.recordatorio = LocalDate.parse(recordatorio,parser);
    }

    public String mostrarTarea(){
        String prefix = "";
        if (this.estado == 1){
            prefix = prefix.concat("(Terminada) ");
        }
        else if(this.isVencida()){
            prefix = prefix.concat("(Vencida) ");
        }
        else if(this.recordatorio.isBefore(LocalDate.now())){
            prefix = prefix.concat("(Por vencer) ");
            this.prioridad = 10;
        }
        return prefix.concat(descripcion);
    }
}
