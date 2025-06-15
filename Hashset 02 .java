import java.util.HashSet;
import java.util.Iterator;

public class Solution {
    public static void main(String[] args) {
        HashSet<String> animal=new HashSet<>();
        HashSet<String> wildanimal=new HashSet<>();
        animal.add("cat");
        animal.add("dog");
        animal.add("dog");
        wildanimal.add("lion");
        wildanimal.add("tiger");
        animal.addAll(wildanimal);

        Iterator<String> it=animal.iterator();
        while(it.hasNext()){
            String res=it.next();
            System.out.println(res);
        }   
    }
}
