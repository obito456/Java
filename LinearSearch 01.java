public class Solution {
    public static boolean search(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int target=3;
        boolean found=search(arr,target);
        if(found){
            System.out.print("found");
        }
        else{
            System.out.print("not found");
        }
    }
}
