import java.util.PriorityQueue;

public class Solution {
    public static void main(String[] args) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        minHeap.add(10);
        minHeap.add(20);
        minHeap.add(15);

        System.out.println("elements: " +minHeap); 
        System.out.println("Polling element: " + minHeap.poll()); 
        System.out.println("Polling element: " + minHeap.poll()); 
        System.out.println("Polling element: " + minHeap.poll());
    }
}
