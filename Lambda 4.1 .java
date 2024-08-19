import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Pack {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        Predicate<String> startsWithA = new Predicate<String>() {
            @Override
            public boolean test(String name) {
                return name.startsWith("A");
            }
        };
      
        Consumer<String> printName = new Consumer<String>() {
            @Override
            public void accept(String name) {
                System.out.println(name);
            }
        };

        names.stream()
                .filter(startsWithA) 
                .forEach(printName);
    }
}
