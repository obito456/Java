import java.util.ArrayList;
import java.util.PriorityQueue;

class Pair {
    int distance;
    int node;
    
    Pair(int distance, int node) {
        this.distance = distance;
        this.node = node;
    }
}

class Solution {
    static int[] dijkstra(int v, ArrayList<ArrayList<ArrayList<Integer>>> adj, int s) {
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>((x, y) -> x.distance - y.distance);
        int[] dist = new int[v];
        
        for (int i = 0; i < v; i++)
            dist[i] = (int)(1e9);
        
        dist[s] = 0;
        pq.add(new Pair(0, s));
        
        // Dijkstra's algorithm
        while (pq.size() != 0) {
            int dis = pq.peek().distance;
            int node = pq.peek().node;
            pq.remove();
            
            // Traverse all adjacent nodes
            for (int i = 0; i < adj.get(node).size(); i++) {
                int adjNode = adj.get(node).get(i).get(0); 
                int edgeWeight = adj.get(node).get(i).get(1); 
                
                if (dis + edgeWeight < dist[adjNode]) {
                    dist[adjNode] = dis + edgeWeight;
                    pq.add(new Pair(dist[adjNode], adjNode));
                }
            }
        }
        return dist;
    }

    public static void main(String[] args) {
        
        int v = 4;
        ArrayList<ArrayList<ArrayList<Integer>>> adj = new ArrayList<>();
        
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<ArrayList<Integer>>());
        }
        
        ArrayList<Integer> edge01 = new ArrayList<>();
        edge01.add(1);
        edge01.add(10);
        adj.get(0).add(edge01);
        
        ArrayList<Integer> edge02 = new ArrayList<>();
        edge02.add(2);
        edge02.add(5);
        adj.get(0).add(edge02);
        
        ArrayList<Integer> edge13 = new ArrayList<>();
        edge13.add(3);
        edge13.add(20);
        adj.get(1).add(edge13);
        
        ArrayList<Integer> edge23 = new ArrayList<>();
        edge23.add(3);
        edge23.add(15);
        adj.get(2).add(edge23);
        
        int source = 0;

        int[] dist = dijkstra(v, adj, source);
        
        System.out.println("Shortest distances from node " + source + ":");
        for (int i = 0; i < dist.length; i++) {
            System.out.println("Distance to node " + i + " is " + dist[i]);
        }
    }
}
