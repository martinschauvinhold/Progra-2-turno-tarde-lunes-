package Interfaces;

public interface ColaPrioridadTDA {
	void InicializarCola();
	void AcolarPrioridad(int x, int prioridad);
	void Desacolar();
	boolean ColaVacia();
	int Primero();
	int Prioridad();
	boolean SonIdenticas(ColaPrioridadTDA origen2);
	void MostrarCola();
}
