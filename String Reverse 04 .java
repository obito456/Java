public class Solution {
    public static void main(String[] args) {

        String s = "vijaykumar";
        char[] ch = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;
        }
        s = new String(ch);
        System.out.println(s);
    }
}
