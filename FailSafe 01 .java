import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.lang.*;

public class Solution {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        list.add("One");
        list.add("Two");

        for (String item : list) {
            list.add("Three"); 
        }
    }
}
