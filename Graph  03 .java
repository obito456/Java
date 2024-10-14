import java.util.*;  // opt

class Graph {
    private Map<Integer, List<Integer>> adjList;

    public Graph() {
        adjList = new HashMap<>();
    }

    public void addEdge(int v, int w) {
        adjList.putIfAbsent(v, new ArrayList<>());
        adjList.get(v).add(w);
        adjList.putIfAbsent(w, new ArrayList<>()); // Ensure the reverse edge exists for undirected graph
        adjList.get(w).add(v); // Uncomment this if the graph is undirected
    }

    // Recursive DFS
    public void dfsRecursive(int start) {
        Set<Integer> visited = new HashSet<>();
        dfsUtil(start, visited);
    }

    private void dfsUtil(int v, Set<Integer> visited) {
        visited.add(v);
        System.out.print(v + " "); // Process the node

        for (int neighbor : adjList.getOrDefault(v, new ArrayList<>())) {
            if (!visited.contains(neighbor)) {
                dfsUtil(neighbor, visited);
            }
        }
    }

    // Iterative DFS
    public void dfsIterative(int start) {
        Set<Integer> visited = new HashSet<>();
        Stack<Integer> stack = new Stack<>();

        stack.push(start);

        while (!stack.isEmpty()) {
            int v = stack.pop();
            if (!visited.contains(v)) {
                visited.add(v);
                System.out.print(v + " "); // Process the node

                for (int neighbor : adjList.getOrDefault(v, new ArrayList<>())) {
                    if (!visited.contains(neighbor)) {
                        stack.push(neighbor);
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of vertices: ");
        int vertices = scanner.nextInt();
        
        System.out.print("Enter the number of edges: ");
        int edges = scanner.nextInt();
        
        Graph graph = new Graph();

        System.out.println("Enter the edges (format: v1 v2):");
        for (int i = 0; i < edges; i++) {
            int v1 = scanner.nextInt();
            int v2 = scanner.nextInt();
            graph.addEdge(v1, v2);
        }

        System.out.print("Enter the starting vertex for DFS: ");
        int startVertex = scanner.nextInt();

        System.out.println("DFS Recursive:");
        graph.dfsRecursive(startVertex);
        
        System.out.println("\nDFS Iterative:");
        graph.dfsIterative(startVertex);

        scanner.close();
    }
}
