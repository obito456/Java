class Solution {
    public boolean rotateString(String s, String goal) {
        return s.length()==goal.length() && (s+s).contains(goal);
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s="abcde";
        String goal="cdeab";
        System.out.println(solution.rotateString(s,goal));
    }
}
