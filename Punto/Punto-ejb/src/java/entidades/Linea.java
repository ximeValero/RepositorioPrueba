package entidades;

public class Linea {

    private Punto puntoInicial;
    private int longitud;
    private double direccion;

    public double getDireccion() {
        return direccion;
    }

    public void setDireccion(double direccion) {
        this.direccion = direccion;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public Punto getPuntoInicial() {
        return puntoInicial;
    }

    public void setPuntoInicial(Punto puntoInicial) {
        this.puntoInicial = puntoInicial;
    }

}
