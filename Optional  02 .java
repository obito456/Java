import java.util.Optional;

public class Solution {
     public static void main(String[] args) {
        
        Optional<String> a = Optional.of("vijay");

        if(a.isPresent()){
            System.out.println(a.get());
        }  
        a.ifPresent(value -> System.out.println(value));
        System.out.println(a.orElse("Default Value"));
        System.out.println(a.orElseGet(() -> "Fallback Value"));
        System.out.println(a.orElseThrow(() -> new IllegalArgumentException("Value is absent")));
        System.out.println(a.map(String::length));
        System.out.println(a.filter(value -> value.startsWith("v")));
    }
}
