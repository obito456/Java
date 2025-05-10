public class Solution {
    public static void main(String[] args) {
        int x = 123;
        int sum=0;

        while(x>0){
            int last=x%10;
            sum=sum+last;
            x=x/10;
        }
        System.out.println(sum);
    }
}
