import java.util.HashSet;

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

        String[] s=animal.toArray(new String[0]);
        for(String res:s){
            System.out.println(res);
        }
    }
}
