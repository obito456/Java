import java.util.*;

class Graph {
    private int vertices;
    private LinkedList<Integer>[] adjacencyList;

    public Graph(int vertices) {
        this.vertices = vertices;
        adjacencyList = new LinkedList[vertices];
        for (int i = 0; i < vertices; i++) {
            adjacencyList[i] = new LinkedList<>();
        }
    }

    public void addEdge(int a, int b) {
        adjacencyList[a].add(b);
    }

    // Helper method for DFS traversal
    private void DFSUtil(int v, boolean[] visited) {
        // Mark the current node as visited and print it
        visited[v] = true;
        System.out.print(v + " ");

        // Recur for all the vertices adjacent to this vertex
        for (int adj : adjacencyList[v]) {
            if (!visited[adj]) {
                DFSUtil(adj, visited);
            }
        }
    }

    // The DFS traversal of the vertices reachable from v
    public void DFS(int v) {
        // Mark all the vertices as not visited (set as false)
        boolean[] visited = new boolean[vertices];

        // Call the recursive helper function to print DFS traversal
        DFSUtil(v, visited);
    }

    public static void main(String[] args) {
        Graph graph = new Graph(7);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 5);
        graph.addEdge(2, 6);

        System.out.println("Depth First Search starting from vertex 0:");
        graph.DFS(0);
    }
}
