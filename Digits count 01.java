public class Solution {
    public static void main(String[] args) {
        int n=12345;
        int count=(n==0) ? 1: (int) Math.log10(Math.abs(n))+1;
        System.out.print(count);
    }
}
