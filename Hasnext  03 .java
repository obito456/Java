import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String token = scanner.nextLine();
            System.out.println(token);
        }
        scanner.close();
    }
}
