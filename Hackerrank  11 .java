import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder output = new StringBuilder();
        
        output.append("================================\n");
        for (int i = 0; i < 3; i++) { 
            String input = scanner.nextLine();
            String[] parts = input.split(" ");
            String text = parts[0];
            int number = Integer.parseInt(parts[1]);
            
            output.append(String.format("%-15s%03d\n", text, number));
        }
        output.append("================================");
        System.out.print(output.toString());
    }
}



