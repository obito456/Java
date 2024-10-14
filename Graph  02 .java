import java.util.*; // opt

public class Solution {
    public static void bfsTraversal(Map<Integer, List<Integer>> graph, int startNode) {
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();

        queue.offer(startNode);
        visited.add(startNode);

        while (!queue.isEmpty()) {
            int currentNode = queue.poll();
            System.out.print(currentNode + " ");

            List<Integer> neighbors = graph.getOrDefault(currentNode, new ArrayList<>());

            for (int neighbor : neighbors) {
                if (!visited.contains(neighbor)) {
                    queue.offer(neighbor);
                    visited.add(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Integer, List<Integer>> graph = new HashMap<>();
        
        System.out.print("Enter the number of nodes: ");
        int nodes = scanner.nextInt();
        
        System.out.print("Enter the number of edges: ");
        int edges = scanner.nextInt();

        System.out.println("Enter the edges (from to):");
        for (int i = 0; i < edges; i++) {
            int from = scanner.nextInt();
            int to = scanner.nextInt();

            graph.putIfAbsent(from, new ArrayList<>());
            graph.get(from).add(to);

            graph.putIfAbsent(to, new ArrayList<>());
            graph.get(to).add(from);
        }

        System.out.print("Enter the start node: ");
        int startNode = scanner.nextInt();

        System.out.println("BFS traversal starting from node " + startNode + ":");
        bfsTraversal(graph, startNode);

        scanner.close();
    }
}
