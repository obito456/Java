import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        map.put("apple", 10);
        map.put("banana", 20);
        map.put("orange", 30);

        int appleCount = map.get("apple");
        System.out.println("Count of apples: " + appleCount);

        if (map.containsKey("banana")) {
            System.out.println("Bananas are available.");
        }

        map.remove("orange");

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        System.out.println("Size of the map: " + map.size());
    }
}
