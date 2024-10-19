import java.util.PriorityQueue;
import java.util.Comparator;

public class Solution {
    public static void main(String[] args) {

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());

        maxHeap.add(20);
        maxHeap.add(10);
        maxHeap.add(15);

        System.out.println("elements: " +maxHeap); 
        System.out.println("Polling element: " + maxHeap.poll()); 
        System.out.println("Polling element: " + maxHeap.poll()); 
        System.out.println("Polling element: " + maxHeap.poll());
    }
}
