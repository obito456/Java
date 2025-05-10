public class Solution {
    public static void main(String[] args) {
        int n = 20;
        for(int i=2;i<=n;i++){
            boolean isprime = true;
            if(i<=1){
                isprime=false;
            }
            else{
                for(int j=2;j<=i/2;j++){
                    if(i%j==0){
                        isprime=false;
                        break;
                    }
                }
                System.out.println(i+" is prime:"+isprime);
            }
        }
    }
}
