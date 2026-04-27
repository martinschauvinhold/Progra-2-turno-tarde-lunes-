package Modelo;

public class boleto {
    private String descripcion;
    private int prioridad;

    public boleto(String descripcion, int prioridad) {
        this.descripcion = descripcion;
        this.prioridad = prioridad;
    }

    public int getPrioridad() { return prioridad; }
    public String getDescripcion() { return descripcion; }
}