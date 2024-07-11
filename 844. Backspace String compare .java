public class Solution {
    public boolean backspaceCompare(String s, String t) {
        return backspace(s).equals(backspace(t));
    }

    private String backspace(final String s) {
        StringBuilder sb = new StringBuilder();
        for (final char c : s.toCharArray()) {
            if (c != '#') {
                sb.append(c);
            } else if (sb.length() != 0) {
                sb.deleteCharAt(sb.length() - 1);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        String s1 = "ab#c";
        String t1 = "ad#c";
        System.out.println(solution.backspaceCompare(s1, t1)); 

        String s2 = "ab##";
        String t2 = "c#d#";
        System.out.println(solution.backspaceCompare(s2, t2)); 

        String s3 = "a#c";
        String t3 = "b";
        System.out.println(solution.backspaceCompare(s3, t3)); 

        String s4 = "a##c";
        String t4 = "#a#c";
        System.out.println(solution.backspaceCompare(s4, t4));
    }
}
