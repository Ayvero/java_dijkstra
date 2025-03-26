package Greedy_3;





/**
 * Ejercicio 4 Algoritmo de Dijkstra. Dado un grafo con pesos no negativos,
 * implemente el algoritmo de Dijkstra para determinar el array de distancias y
 * de predecesores en el camino m�s corto, desde un v�rtice or�gen dado como
 * par�metro hacia el resto de los v�rtices. Una vez realizado, imprima el
 * camino m�s corto que se debe seguir desde el or�gen hacia cada v�rtice.
 * 
 * 
 *
 */
public class Main {

	public static void main(String[] args) {
		Grafo<Integer> grafo = new GrafoDirigido<Integer>();

		grafo.agregarArco(1, 2, 6);
		grafo.agregarArco(1, 3, 2);
		grafo.agregarArco(2, 4, 1);
		grafo.agregarArco(3, 2, 3);
		grafo.agregarArco(3, 4, 5);

		// grafo.imprimir();

		grafo.imprimirPonderado();

		Dijkstra dijkstra = new Dijkstra(grafo);

		int verticeOrigen = 1;

		System.out.println("Distances desde vertice " + verticeOrigen);
		dijkstra.dijkstra(verticeOrigen);

		dijkstra.imprimirDistancias();

		dijkstra.imprimirPadres();
	}

}
