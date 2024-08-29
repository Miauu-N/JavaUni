package TaskManager;

import TaskManager.Task;

import java.util.ArrayList;
import java.util.Stack;

public class TaskManager {
    private final ArrayList<Task> tareas;

    public TaskManager() {
        this.tareas = new ArrayList<>();
    }

    public void addTarea(String descripcion, int prioridad,String fechaLimite){
        Task newTarea = new Task(descripcion,prioridad,fechaLimite);
        Stack<Task> stack = new Stack<>();
        if (tareas.isEmpty()){
            tareas.add(newTarea);
        }
        else {
            Task tareaActual = tareas.removeLast();
            stack.add(tareaActual); // no, es para ir vaciando la lista hasta donde entra la nueva tarea
            var prioActual = tareaActual.getPrioridad();
            var centinel = true;
            boolean igualAnterior = (prioActual == newTarea.getPrioridad()) && (tareaActual.getFechaLimite() == null   ||  newTarea.getFechaLimite().isBefore(tareaActual.getFechaLimite()));
            while (newTarea.getPrioridad() > tareaActual.getPrioridad() || igualAnterior){
                if (tareas.isEmpty()){
                    centinel = false;
                    break;
                }
                else{
                    tareaActual = tareas.removeLast();
                    stack.add(tareaActual);
                    prioActual = tareaActual.getPrioridad();
                }
            }
            if (centinel) {
                tareas.add(stack.pop());
                tareas.add(newTarea);
            }
            else{
                tareas.add(newTarea);
            }
            while (!stack.isEmpty()){
                tareas.add(stack.pop());
            }
        }
    }

    public void addTarea(String descripcion, int prioridad){
        Task newTarea = new Task(descripcion,prioridad);
        Stack<Task> stack = new Stack<>();
        if (tareas.isEmpty()){
            tareas.add(newTarea);
        }
        else {
            Task tareaActual = tareas.removeLast();
            stack.add(tareaActual); // no, es para ir vaciando la lista hasta donde entra la nueva tarea
            var prioActual = tareaActual.getPrioridad();
            var centinel = true;
            while (newTarea.getPrioridad() > tareaActual.getPrioridad()){
                if (tareas.isEmpty()){
                    centinel = false;
                    break;
                }
                else{
                    tareaActual = tareas.removeLast();
                    stack.add(tareaActual);
                    prioActual = tareaActual.getPrioridad();
                }
            }
            if (centinel) {
                tareas.add(stack.pop());
                tareas.add(newTarea);
            }
            else{
                tareas.add(newTarea);
            }
            while (!stack.isEmpty()){
                tareas.add(stack.pop());
            }
        }
    }

    public  String mostrarTareas(){
        StringBuilder resultado = new StringBuilder();
        for (Task tarea : tareas){
            if (!(tarea.isVencida() || tarea.isTerminada())) {
                resultado.append(tarea.mostrarTarea()).append("\n");
            }
        }
        return resultado.toString();
    }

    public  String mostrarTareas(String x){
        StringBuilder resultado = new StringBuilder();
        for (Task tarea : tareas){
            boolean contienex = tarea.contiene(x);
            if (!(tarea.isVencida() || tarea.isTerminada()) && contienex) {
                resultado.append(tarea.mostrarTarea()).append("\n");
            }
        }
        return resultado.toString();
    }

    public void tachar(String desc){
        for (Task tarea : tareas){
            if (tarea.isTitulo(desc)){
                tarea.terminada();
            }
        }
    }


}