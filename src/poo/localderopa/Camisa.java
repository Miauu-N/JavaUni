package localderopa;

public  class Camisa extends Prenda {

    // agregrear boolean para ser si es manga corta o no, si es manga larga que lo de manga larga y lesto. Sacamo mangacorta
    private boolean mangaLarga;
    public Camisa(double precioLista, boolean mangaLarga){
        super(precioLista);
        this.mangaLarga= mangaLarga;
        if (mangaLarga){
            setPorcentajeGanancia(getPorcentajeGanancia() + 5);
        }
    }

}
