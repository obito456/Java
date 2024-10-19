import java.util.PriorityQueue;
import java.util.Comparator;

public class Solution {
    public static void main(String[] args) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>(Comparator.naturalOrder());

        minHeap.add(20);
        minHeap.add(10);
        minHeap.add(15);

        System.out.println("elements: " +minHeap); 
        System.out.println("Polling element: " + minHeap.poll()); 
        System.out.println("Polling element: " + minHeap.poll()); 
        System.out.println("Polling element: " + minHeap.poll());
    }
}
