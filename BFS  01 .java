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

    public void bfs(int start) {
        Set<Integer> visited = new HashSet<>(); 
        Queue<Integer> queue = new LinkedList<>(); 
        visited.add(start); 
        queue.offer(start);

        while (!queue.isEmpty()) {
            int node = queue.poll(); 
            System.out.print(node + " ");

            for (int adjacent : adjList.get(node)) {
                if (!visited.contains(adjacent)) {
                    visited.add(adjacent);
                    queue.offer(adjacent);
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
