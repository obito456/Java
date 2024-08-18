import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("John", "Jane", "Jack", "Doe", "John");
        List<String> result = names.stream()
                .filter(name -> name.startsWith("J"))
                .map(String::toUpperCase)
                .sorted()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
