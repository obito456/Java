import java.util.*;

class Graph {
    private int vertices;
    private LinkedList<Edge>[] adjacencyList;

    static class Edge {
        int destination;
        int weight;

        public Edge(int destination, int weight) {
            this.destination = destination;
            this.weight = weight;
        }
    }

    public Graph(int vertices) {
        this.vertices = vertices;
        adjacencyList = new LinkedList[vertices];
        for (int i = 0; i < vertices; i++) {
            adjacencyList[i] = new LinkedList<>();
        }
    }

    public void addEdge(int source, int destination, int weight) {
        adjacencyList[source].add(new Edge(destination, weight));
        adjacencyList[destination].add(new Edge(source, weight));
    }

    // Dijkstra's algorithm to find the shortest path from the source to all vertices
    public void dijkstra(int source) {
        // Priority queue to store (vertex, distance) pairs, where the vertex with the smallest distance is dequeued first
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(arr -> arr[1]));
        
        // Distance array to store the shortest distance to each vertex, initialized to infinity (Integer.MAX_VALUE)
        int[] distances = new int[vertices];
        Arrays.fill(distances, Integer.MAX_VALUE);
        distances[source] = 0;

        // Add the source vertex to the queue with distance 0
        pq.add(new int[] {source, 0});

        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int currentVertex = current[0];
            int currentDistance = current[1];

            // Process all the adjacent vertices of the current vertex
            for (Edge edge : adjacencyList[currentVertex]) {
                int adjacentVertex = edge.destination;
                int weight = edge.weight;

                // Relaxation step: check if we can improve the distance to the adjacent vertex
                if (currentDistance + weight < distances[adjacentVertex]) {
                    distances[adjacentVertex] = currentDistance + weight;
                    pq.add(new int[] {adjacentVertex, distances[adjacentVertex]});
                }
            }
        }

        System.out.println("Vertex \t Distance from Source");
        for (int i = 0; i < vertices; i++) {
            System.out.println(i + " \t " + distances[i]);
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph(6);

        graph.addEdge(0, 1, 4);
        graph.addEdge(0, 2, 1);
        graph.addEdge(2, 1, 2);
        graph.addEdge(1, 3, 1);
        graph.addEdge(2, 3, 5);
        graph.addEdge(3, 4, 3);
        graph.addEdge(4, 5, 1);

        System.out.println("Dijkstra's Algorithm (Shortest Path from Vertex 0):");
        graph.dijkstra(0);
    }
}
