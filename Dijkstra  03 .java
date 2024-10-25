import java.util.*;

public class DijkstraAlgorithm {

    static class Pair {
        int vertex, weight;

        Pair(int vertex, int weight) {
            this.vertex = vertex;
            this.weight = weight;
        }
    }

    public static void dijkstra(List<List<Pair>> graph, int source) {
        int V = graph.size();
        
        PriorityQueue<Pair> pq = new PriorityQueue<>(Comparator.comparingInt(p -> p.weight));
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        
        pq.offer(new Pair(source, 0));
        dist[source] = 0;

        while (!pq.isEmpty()) {
            Pair current = pq.poll();
            int u = current.vertex;

            for (Pair adj : graph.get(u)) {
                int v = adj.vertex;
                int weight = adj.weight;

                if (dist[u] + weight < dist[v]) {
                    dist[v] = dist[u] + weight;
                    pq.offer(new Pair(v, dist[v]));
                }
            }
        }

        System.out.println("Vertex   Distance from Source");
        for (int i = 0; i < V; i++) {
            System.out.println(i + "\t\t" + dist[i]);
        }
    }

    public static void main(String[] args) {
        int V = 5;
        List<List<Pair>> graph = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }

        // (0)----10-----(1)
        //  |             |
        //  3             2
        //  |             |
        // (4)----1-----(2)----9----(3)
        //                        
        //  |-----------7------------|

        graph.get(0).add(new Pair(1, 10));
        graph.get(0).add(new Pair(4, 3));
        graph.get(1).add(new Pair(2, 2));
        graph.get(2).add(new Pair(3, 9));
        graph.get(4).add(new Pair(2, 1));
        graph.get(3).add(new Pair(4, 7));

        int source = 0;
        dijkstra(graph, source);
    }
}
