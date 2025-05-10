public class Solution {
    public static void main(String[] args) {
        int s = 10;
        int e = 20; 
        boolean isprime = true;
        for(int i=s;i<=e;i++){
            isprime=true;
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
                if(isprime){
                    System.out.println(i);
                }
            }
        }
    }
}
