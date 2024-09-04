package BilleteraVirtual;

public class Moneda {
    private String nombre;
    private double valor;

    public Moneda(String nombre, double valor) {
        this.nombre = nombre;
        this.valor = valor;
    }

    public String getNombre() {
        return this.nombre;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean is(String moneda) {
        return nombre.equals(moneda);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj.getClass() == Moneda.class) {
            return nombre.equals(((Moneda) obj).nombre);
        }
        return false;
    }

    }
