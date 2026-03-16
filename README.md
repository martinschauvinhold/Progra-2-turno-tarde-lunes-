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

inicializarCola()
Funcionamiento: Es el punto de partida del sistema. Se encarga de reservar el espacio físico en la memoria (el arreglo) y configurar los índices de control (primero y ultimo) en su estado inicial.

Contexto de uso: Se ejecuta una única vez al inicio del día o del proceso para "limpiar" cualquier dato anterior y dejar el sistema listo para operar.

acolar(int x)
Funcionamiento: Recibe un número entero x (el ID) y lo ubica al final de la fila de espera. Utiliza lógica de Aritmética Modular para determinar la posición en el arreglo, asegurando que si hay espacio disponible al principio del mismo, el ID sea guardado allí.

Contexto de uso: Se utiliza para cargar los números de identificación que serán asignados a los archivos.

primero()
Funcionamiento: Accede al valor que se encuentra en el frente de la cola y lo devuelve al usuario. Es una operación de sólo lectura; es decir, el dato permanece en la cola y los índices no se mueven.

Contexto de uso: El usuario lo utiliza para saber qué ID debe escribir en el archivo actual antes de confirmar la operación.

desacolar()
Funcionamiento: Produce el avance de la cola. Desplaza el índice del frente al siguiente elemento. Técnicamente, el dato anterior no se borra, pero el sistema lo considera fuera de la estructura, permitiendo que ese espacio sea reutilizado en el futuro.

Contexto de uso: Se invoca únicamente después de que el archivo ha sido numerado con éxito. Es lo que garantiza que el ID no se vuelva a repetir.

colaVacia()
Funcionamiento: Realiza una validación lógica comparando la cantidad de elementos actuales contra cero. Devuelve un valor verdadero (true) si no hay datos almacenados.

Contexto de uso: Es la medida de seguridad del usuario. Se debe consultar siempre antes de intentar usar los métodos primero() o desacolar() para evitar errores de ejecución cuando ya no quedan archivos por procesar.

* Actividad 2:
