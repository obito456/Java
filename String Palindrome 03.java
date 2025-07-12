public class Solution {
    public static boolean pal(String s) {
        s = s.toLowerCase();
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            else{
                left++;
                right--;    
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String name = "madam";
        System.out.println ("word is pal "+pal(name));
    }  
}


//  Time=0(n)
//  Space=0(1)
