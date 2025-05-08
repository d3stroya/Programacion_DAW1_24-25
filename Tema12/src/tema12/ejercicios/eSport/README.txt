# FICHEROS DE TEXTO
Una organización que gestiona torneos de videojuegos competitivos 
necesita procesar los resultados de partidas jugadas por diferentes equipos 
a lo largo de un campeonato. 

Cada partida se registra con datos clave sobre los equipos y su rendimiento. 
Tu tarea es almacenar esta información y generar estadísticas que permitan 
evaluar el rendimiento de los equipos.

Implementa un programa en Java que contenga un menú con las siguientes opciones:

1. **Añadir partida**: Pide los datos al usuario por consola 
y guarda cada avistamiento en un ArrayList. 
Debes permitir añadir avistamientos hasta que el usuario indique 
que no desea añadir más. Cada registro debe incluir:
* Nombre del equipo
* Juego jugado (ej.: League of Legends, Valorant, Dota 2)
* Rondas ganadas
* Rondas perdidas
* Duración de la partida (en minutos)

2. **Escribir fichero**: Vuelca todos los avistamientos del ArrayList a un fichero 
llamado eSport.txt y que crees en la raíz del proyecto. 
Escribe cada partida en una línea con sus datos separados por punto y coma:
```
Team Phoenix;Valorant;12;14;47
IronFist;League of Legends;18;10;35
DarkWolves;Dota 2;33;20;60
```

3. **Leer fichero**:  Lee los datos del fichero y muéstralos por pantalla. 

4. **Importar datos**: Lee las partidas del fichero y guárdalas  en el ArrayList. 
Para ello, deberás limpiar primero todos los registros del ArrayList.

5. **Duración media**: Calcula la duración media de las partidas por juego 
y muestra el resultado por pantalla.
