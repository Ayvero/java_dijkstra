#  Algoritmo de Dijkstra

## Descripción del Problema
El objetivo de este ejercicio es implementar el **algoritmo de Dijkstra** para encontrar el camino más corto en un grafo con pesos no negativos. Dado un vértice de origen, el algoritmo calcula el **array de distancias mínimas** desde el origen hasta cada vértice y determina los **predecesores** en el camino más corto. Finalmente, se debe imprimir el camino más corto desde el origen hasta cada vértice.

## Enfoque
- **Cola de Prioridad**: Se utiliza una cola de prioridad (min-heap) para seleccionar el siguiente vértice con la menor distancia conocida.
- **Actualización de Distancias**: Se actualizan iterativamente las distancias mínimas para cada vértice.
- **Reconstrucción del Camino**: Se almacena la información de predecesores para reconstruir el camino más corto.

## Aplicaciones
El algoritmo de Dijkstra es ampliamente utilizado en:
- **Navegación y Sistemas GPS**: Para encontrar la ruta más corta en mapas.
- **Enrutamiento de Redes**: Optimización de transmisión de datos en redes de computadoras.
- **Logística y Transporte**: Planificación eficiente de rutas para entregas.
  
--------------------------------

# Dijkstra's Algorithm

## Problem Description
The objective of this exercise is to implement **Dijkstra's Algorithm** to find the shortest path in a weighted graph with non-negative weights. Given a source vertex, the algorithm calculates the **minimum distance array** from the source to each vertex and determines the **predecessors** in the shortest path. Finally, the shortest path from the source to each vertex should be printed.

## Approach
- **Priority Queue**: Uses a priority queue (min-heap) to efficiently find the next vertex with the smallest known distance.
- **Distance Updates**: Iteratively updates the minimum distance for each vertex.
- **Path Reconstruction**: Stores predecessor information to reconstruct the shortest path.

## Applications
Dijkstra’s algorithm is widely used in:
- **Navigation and GPS Systems**: Finding the shortest route in maps.
- **Network Routing**: Optimizing data packet transmission in computer networks.
- **Logistics and Transportation**: Efficient route planning for deliveries.
