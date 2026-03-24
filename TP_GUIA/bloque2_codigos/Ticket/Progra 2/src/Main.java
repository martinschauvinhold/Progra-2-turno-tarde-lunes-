
import Implementacion.ColaPrioridadDA;
import Interfaces.ColaPrioridadTDA;
import Modelo.Ticket;

public class Main {

    public static void main(String[] args) {
        ColaPrioridadTDA tickets = new ColaPrioridadDA();
        tickets.InicializarCola();

        // 1. Definición de prioridades
        int prioridadCritica = 999; // Servidor roto
        int prioridadBaja = 0;      // Fondo de pantalla

        // PRUEBA
        // El primer parámetro es un ID de ticket (inventado) y el segundo la prioridad
        tickets.AcolarPrioridad(1, prioridadBaja);
        tickets.AcolarPrioridad(2, prioridadBaja);
        tickets.Desacolar();
        tickets.Desacolar();
        tickets.AcolarPrioridad(3,prioridadBaja);
        tickets.AcolarPrioridad(4,prioridadBaja);
        tickets.Desacolar();
        tickets.Desacolar();
        tickets.AcolarPrioridad(5,prioridadBaja);
        tickets.AcolarPrioridad(6,prioridadBaja);
        tickets.AcolarPrioridad(7,prioridadCritica);
        tickets.Desacolar();











        System.out.println("--- Estado actual de la cola de IT ---");
        tickets.MostrarCola();
        tickets.Prioridad();


        }
    }
