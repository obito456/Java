public class Solution {
    public static void main(String[] args) {
        int x = 16;
        boolean isprime = true;
        if (x <= 1) {
            isprime = false;
        } else {
            for (int i = 2; i <= x / 2; i++) {
                if (x%i == 0) {
                    isprime = false;
                    break;
                }
            }
        }
        System.out.println(x + " is prime: " + isprime);
    }
}
