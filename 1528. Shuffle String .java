import java.util.*;

public class Solution {
    public String restoreString(String s, int[] indices) {
        char[] ans = new char[s.length()];

        for (int i = 0; i < indices.length; ++i) {
            ans[indices[i]] = s.charAt(i);
        }
        return new String(ans);
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "codeleet";
        int[] indices = {4, 5, 6, 7, 0, 2, 1, 3};
        System.out.println(solution.restoreString(s, indices));
    }
}

