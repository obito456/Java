import java.util.Stack;

public class Solution {
    public static void main(String[] args) {

        String s = "vijaykumar";
        Stack<Character> st = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            st.push(s.charAt(i));
        }
        char[] ch = new char[s.length()];
        int i = 0;
        while (st.isEmpty() == false) {
            ch[i++] = st.pop();
        }
        s = new String(ch);
        System.out.println(s);
    }
}
