import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        int q = scanner.nextInt();
        

        for (int i = 0; i < q; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();
            
            generateAndPrintSeries(a, b, n);
        }
        
        scanner.close();
    }
    
    private static void generateAndPrintSeries(int a, int b, int n) {
        int currentValue = a;
        for (int j = 0; j < n; j++) {
            currentValue += b * (1 << j);
            System.out.print(currentValue + " ");
        }
        System.out.println();
    }
}
