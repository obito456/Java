import java.util.*;

class Graph {
    private final int vertices;
    private final List<List<Integer>> adjList;

    public Graph(int vertices) {
        this.vertices = vertices;
        adjList = new ArrayList<>(vertices);
        for (int i = 0; i < vertices; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    public void addEdge(int source, int destination) {
        adjList.get(source).add(destination);
        adjList.get(destination).add(source);
    }

    // BFS algorithm
    public void bfs(int start) {
        Set<Integer> visited = new HashSet<>(); // Set to track visited nodes
        Queue<Integer> queue = new LinkedList<>(); // Queue for BFS

        visited.add(start); // Mark the starting node as visited
        queue.offer(start); // Enqueue the starting node

        while (!queue.isEmpty()) {
            int node = queue.poll(); // Dequeue a vertex from queue
            System.out.print(node + " "); // Print the dequeued vertex

            // Get all adjacent vertices of the dequeued vertex
            for (int adjacent : adjList.get(node)) {
                if (!visited.contains(adjacent)) { // If not visited
                    visited.add(adjacent); // Mark it visited
                    queue.offer(adjacent); // Enqueue it
                }
            }
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph(6);
        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(1,3);
        graph.addEdge(1,4);
        graph.addEdge(2,4);
        graph.addEdge(2,5);

        System.out.println("Breadth First Search starting from vertex 0:");
        graph.bfs(0);
    }
}
