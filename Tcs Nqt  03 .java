public class Solution {
    public static void main(String[] args){

        int[] arr={1,2,3,4,5,6};
        int n=arr.length;
        int firlg=Integer.MIN_VALUE;
        int seclg=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(arr[i]>firlg){
                seclg=firlg;
                firlg=arr[i];
            }
            else if(arr[i]>seclg && arr[i]!=firlg){
                seclg=arr[i];
            }
        }
        System.out.println("first largest is = "+firlg);
        System.out.println("second largest is = "+seclg);  
    }
}
