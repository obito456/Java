public class Solution {
    public void  rev(int[] arr,int n){
        int start=0;
        int end=n-1;

        while(start<end){
            int temp=start;
            start=end;
            end=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args){
        Solution solution=new Solution();

        int[] arr={1,2,3,4,5,6};
        int n=arr.length;

        solution.rev(arr,n);

        for(int i:arr){
            System.out.print(i+" ");
        } 
    }
}
