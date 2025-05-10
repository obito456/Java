public class Solution {
    public static void main(String[] args) {
        int x = 123;
        int sum=0;

        for(int i=0;i<=x.length;i++){
            int last=x%10;
            sum=sum+last;
        }

    }
}
