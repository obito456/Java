import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        String input = "Hello World 123";
        Scanner scanner = new Scanner(input);

        while (scanner.hasNext()) {
            String token = scanner.next();
            System.out.println(token);
        }
        
        scanner.close();
    }
}
