import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        String s = "vijaykumar";

        String rev = s.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.collectingAndThen(Collectors.toList(), lst -> {
                    java.util.Collections.reverse(lst);
                    return lst.stream();
                }))
                .map(Object::toString)
                .collect(Collectors.joining());
        
        s=rev;
        System.out.println(s);
    }
}
