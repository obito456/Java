import java.util.Optional;
public class Solution {
     public static void main(String[] args) {
        
        Optional<String> a = Optional.empty();
        Optional<String> b = Optional.of("vijay");
        Optional<String> c = Optional.ofNullable(null);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
