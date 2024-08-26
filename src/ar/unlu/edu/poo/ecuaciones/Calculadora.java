package ar.unlu.edu.poo.ecuaciones;

public class Calculadora {
    public static void main(String[] args) {
        Ecuacion ecuacion = new Ecuacion(1,-10,25);
        System.out.println(ecuacion.calcularY(1));
        System.out.println(ecuacion.raiz().toString());
    }
}
