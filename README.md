# **Progra-2-turno-tarde-lunes-**

## *Integrantes del grupo:*

Martin Schauvinhold,
Samuel Franco Salazar,
Sofia Agustina Moral Pesce,
Agustín Lee,
Facundo Larghero,
Maribel Perez Calle Maira.

# *Resumen de Actividades:*

* Actividad 1:
  El cliente necesita un programa en cual se enumere de forma ordenada e irrepetible unos archivos. por lo cual para evitar que se repitan los numero(ID) se propone implementar un sistema de colas que no permita la enumeracion del archivo hasta que se haya hecho la anterior operacion first in first out (FIFO). Por el lado del usuario va a tener los siguiente metodos para manipular la cola:  void inicializarCola();

    void acolar(int x);

    void desacolar();

    int primero();

    boolean colaVacia();

inicializarCola()	Prepara el sistema antes de empezar el día.	Crea el espacio de memoria para los IDs de los archivos.
acolar(int x)	"Carga" el sistema con los IDs disponibles (ej: el ID 101).	Pone un número en la fila de espera para ser usado.
primero()	Pregunta: "¿Qué número le toca a este archivo ahora?".	Permite ver el ID sin borrarlo, para poder escribirlo en el archivo.
desacolar()	Avisa: "Ya terminé de numerar este archivo, pasemos al siguiente".	Elimina el ID usado de la fila para que no se repita nunca.
colaVacia()	Revisa si todavía quedan IDs disponibles en la lista.	Evita que el programa intente numerar archivos cuando ya no hay más IDs.
* Actividad 2:
