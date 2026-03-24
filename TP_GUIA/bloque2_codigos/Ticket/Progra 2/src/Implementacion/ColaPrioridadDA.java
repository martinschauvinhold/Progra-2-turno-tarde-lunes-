package Implementacion;

import Interfaces.ColaPrioridadTDA;

public class ColaPrioridadDA implements ColaPrioridadTDA {
	int[] elementos;
	int[] prioridades;
	int indice;
	
	public void InicializarCola() {
		elementos = new int[100];
		prioridades = new int[100];
		indice = 0;
	}

	public void AcolarPrioridad(int x, int prioridad) {
		int j = indice;
		// IMPORTANTE: El uso de >= hace que los de IGUAL prioridad
		// también se desplacen a la izquierda.
		// Esto deja al VIEJO a la derecha (índice más alto) y al NUEVO a su izquierda.
		while(j > 0 && prioridades[j-1] >= prioridad) {
			elementos[j] = elementos[j-1];
			prioridades[j] = prioridades[j-1];
			j--;
		}
		elementos[j] = x;
		prioridades[j] = prioridad;
		indice++;
	}
	public void Desacolar() {
		indice--;
	}
	
	public boolean ColaVacia() {
		return(indice==0);
	}
	
	public int Primero() {
		return elementos[indice-1];
	}
	
	public int Prioridad() {
		return prioridades[indice-1];
	}
	
	public void MostrarCola() {
		ColaPrioridadTDA aux = new ColaPrioridadDA();
		aux.InicializarCola();
		System.out.print("Valores -> ");
		while (!this.ColaVacia()) {
			aux.AcolarPrioridad(this.Primero(), this.Prioridad());
			System.out.print(this.Primero()+" ");
			this.Desacolar();
		}
		System.out.println("");
		System.out.print("Priorid -> ");
		while (!aux.ColaVacia()) {
			this.AcolarPrioridad(aux.Primero(), aux.Prioridad());
			System.out.print(aux.Prioridad()+" ");
			aux.Desacolar();
		}
	}
	
	public boolean SonIdenticas(ColaPrioridadTDA origen2) {
		ColaPrioridadTDA aux = new ColaPrioridadDA();
		ColaPrioridadTDA aux2 = new ColaPrioridadDA();
		aux.InicializarCola();
		aux2.InicializarCola();
		boolean identicas=true;
		int cant1=0;
		int cant2=0;
		while(!this.ColaVacia()) {
			aux.AcolarPrioridad(this.Primero(), this.Prioridad());
			this.Desacolar();
			cant1++;
		}
		while(!origen2.ColaVacia()) {
			aux2.AcolarPrioridad(origen2.Primero(), origen2.Prioridad());
			origen2.Desacolar();
			cant2++;
		}
		
		if (cant1==cant2) {
		while(!aux.ColaVacia() && !aux2.ColaVacia()) {
			if (aux.Primero()!=aux2.Primero() || aux.Prioridad()!=aux2.Prioridad()) {
				identicas=false;
			}
			this.AcolarPrioridad(aux.Primero(), aux.Prioridad());
			origen2.AcolarPrioridad(aux2.Primero(), aux2.Prioridad());
			aux.Desacolar();
			aux2.Desacolar();
		}
		} else {
			identicas=false;
			while(!aux.ColaVacia()) {
				this.AcolarPrioridad(aux.Primero(), aux.Prioridad());
				aux.Desacolar();
			}
			while(!aux.ColaVacia()) {
				origen2.AcolarPrioridad(aux2.Primero(), aux2.Prioridad());
				aux2.Desacolar();
			}
			
		}
		return identicas;
	}
	
	

}
