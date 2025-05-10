public class Solution {
    public static void main(String[] args) {
        int[] num={1,2,6,4,5};
        int max=num[0];
        for(int i=0;i<num.length;i++){
            if(num[i]>max){
                max=num[i];
            }
        }
        System.out.print(max);
    }
}
