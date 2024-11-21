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

    private void DFSUtil(int v, boolean[] visited) {
        visited[v] = true;
        System.out.print(v + " ");

        for (int adj : adjList.get(v)) {
            if (!visited[adj]) {
                DFSUtil(adj, visited);
            }
        }
    }
    public void DFS(int v) {
        boolean[] visited = new boolean[vertices];
        DFSUtil(v, visited);
    }

    public static void main(String[] args) {
        Graph graph = new Graph(6);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 4);
        graph.addEdge(2, 5);
        System.out.println("\nDepth First Search starting from vertex 0:");
        graph.DFS(0);
    }
}
