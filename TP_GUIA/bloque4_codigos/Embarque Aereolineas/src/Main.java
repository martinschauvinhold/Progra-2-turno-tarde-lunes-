import Implementacion.ColaPrioridadDA;
import Interfaces.ColaPrioridadTDA;

public class Main {

    public static void main(String[] args) {
        ColaPrioridadTDA boleto = new ColaPrioridadDA();
        boleto.InicializarCola();

        // 1. Definición de prioridades
        int prioridadAlta = 999; // Cliente Discapacitado
        int prioridadNormal = 0;      // Cliente Regular

        // PRUEBA

        boleto.AcolarPrioridad(1, prioridadNormal);
        boleto.AcolarPrioridad(2, prioridadNormal);
        boleto.Desacolar();
        boleto.Desacolar();
        boleto.AcolarPrioridad(3,prioridadNormal);
        boleto.AcolarPrioridad(4,prioridadNormal);
        boleto.Desacolar();
        boleto.Desacolar();
        boleto.AcolarPrioridad(5,prioridadNormal);
        boleto.AcolarPrioridad(6,prioridadNormal);
        boleto.AcolarPrioridad(7,prioridadAlta);
        boleto.Desacolar();











        System.out.println("--- Estado actual de la cola de boletos del Embarque de Aereolineas ---");
        boleto.MostrarCola();
        boleto.Prioridad();


    }
}