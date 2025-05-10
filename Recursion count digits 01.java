public class Solution {
    public static int countdigits(int n){
        n=Math.abs(n);
        if(n==0) return 0;
        return 1+countdigits(n/10);
    }
    public static void main(String[] args) {
        int n=-12345;
        int count=(n==0) ? 1: countdigits(n);
        System.out.print(count);
    }
}
