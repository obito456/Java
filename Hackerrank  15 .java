import java.util.Scanner;

public class Solution {
    static boolean isAnagram(String a, String b) {

        a = a.toLowerCase();
        b = b.toLowerCase();

        if (a.length() != b.length()) {
            return false;
        }

        String sortedA = sortString(a);
        String sortedB = sortString(b);

        return sortedA.equals(sortedB);
    }

    private static String sortString(String s) {
        char[] charArray = s.toCharArray();
        java.util.Arrays.sort(charArray); 
        return new String(charArray); 
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
