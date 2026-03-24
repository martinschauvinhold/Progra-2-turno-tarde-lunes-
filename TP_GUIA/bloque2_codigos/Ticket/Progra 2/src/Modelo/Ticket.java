package Modelo;

public class Ticket {
    private String descripcion;
    private int prioridad;

    public Ticket(String descripcion, int prioridad) {
        this.descripcion = descripcion;
        this.prioridad = prioridad;
    }

    public int getPrioridad() { return prioridad; }
    public String getDescripcion() { return descripcion; }
}