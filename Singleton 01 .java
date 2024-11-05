import java.util.*;
import java.lang.*;

class Marriage {
    private static Marriage single_instance = null;
    private Marriage() {}

    public static Marriage getInstance() {
        if (single_instance == null) {
            single_instance = new Marriage();
        }
        return single_instance;
    }
    public String toString() {
        return "This is the single instance of the Marriage class.";
    }
}

public class Solution {
    public static void main(String[] args) {
        Marriage instance = Marriage.getInstance();
        System.out.println("Singleton instance: " + instance);
    }
}
