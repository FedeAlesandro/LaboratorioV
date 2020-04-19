# LaboratorioV
¿Cuántos consumidores se necesitan para que el stock llegue a 0?
En este caso si inicializo en cero el stock, se va a hacer un bucle de que un productor produce 1 cerveza y el consumidor la consume en el acto seguido, por ende 1 consumidor se necesita.

Bloques synchronized, por qué deben serlo?
Los bloques synchronized deben serlos porque si por ejemplo dos consumidores consumen al mismo tiempo y nomás hay 1 stock, se les va a permitir a ambos consumir cuando no deberían.

Explicar el recurso compartido
El recurso que comparten es el stock, ya que cuando el productor produzca éste va a aumentar y cuando el consumidor consuma, éste va a disminuir. Por ende ambos acceden al mismo atributo.

Explicar las 3 formas de instanciar un Thread.

-Instanciarlo con un new.
-Implementando la interfaz Runnable.
-Extendiendo de la clase Thread.
