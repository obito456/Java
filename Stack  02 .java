import java.util.Stack;

public class Solution {

    public static void reverses(String s) {
        Stack<String> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            String word = "";
            while (i < s.length() && s.charAt(i) != ' ') {
                word += s.charAt(i);
                i++;
            }
            st.push(word);
        }

        while (!st.empty()) {
            System.out.print(st.peek() + " ");
            st.pop();
        }
        System.out.println(); 
    }

    public static void main(String[] args) {
       String s = "hi iam vijay";
       reverses(s);
    }
}
