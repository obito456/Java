import java.util.PriorityQueue;

public class Solution {
    public static void main(String[] args) {
        PriorityQueue pq=new PriorityQueue<>();

        pq.add(6);
        pq.add(5);
        pq.add(4);
        pq.add(8);
        
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
    }
}
