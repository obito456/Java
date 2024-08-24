import java.util.*;

public class Solution {
    public static boolean anargram(String s1, String s2) {
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        if (s1.length() != s2.length()) {
            return false;
        }
        int freq[] = new int[200];
        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s2.length(); i++) {
            freq[s2.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {

        String s1 = "vijay";
        String s2 = "yajiv";
        System.out.println(anargram(s1, s2));
    }
}
