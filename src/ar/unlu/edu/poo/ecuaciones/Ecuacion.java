package ar.unlu.edu.poo.ecuaciones;
import java.util.ArrayList;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Ecuacion {
    private int a;
    private int b;
    private int c;

    public Ecuacion(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public ArrayList<Double> raiz(){
        double raiz = Math.sqrt((pow(b,2)) - (4 * a * c)); //
        double n = (-b + raiz) / (2 * a);
        double m = (-b - raiz) / (2 * a);
        ArrayList<Double> resultado = new ArrayList<>();
        resultado.add(n);
        if(n != m){
            resultado.add(m);
        }
        return resultado;
    }

    public double calcularY(double x){
        return (Math.pow(x,2) * a) + (x * b) + c;
    }
}
