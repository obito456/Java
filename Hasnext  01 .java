import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("vijay");
        list.add("kumar");
        list.add("vipparthi");

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
    }
}
