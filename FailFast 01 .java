import java.util.*;
import java.lang.*;

public class Solution {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");

        for (String item : list) {
            list.add("Three");
        }
    }
}
