public class Solution {
    public static void main(String[] args){

        int[] arr={1,2,3,4,5,6};
        int n=arr.length;
        int firsm=Integer.MAX_VALUE;
        int secsm=Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            if(arr[i]<firsm){
                secsm=firsm;
                firsm=arr[i];
            }
            else if(arr[i]<secsm && arr[i]!=firsm){
                secsm=arr[i];
            }
        }
        System.out.println("first smallest is = "+firsm);
        System.out.println("second smallest is = "+secsm);  
    }
}
