import java.util.*;

public class Solution {
    public static boolean twosum(int[] arr,int x) {
        int len=arr.length;
        for(int i=0;i<len-1;i++){
            for(int j=i+1;j<len;j++){
                if(arr[i]+arr[j]==x){
                    return true;
                };
            }
        }
        return false;
    }
    public static void main(String[] args) {

        int[] arr={1,2,3,4,5,6};
        int x=11;
        System.out.println(twosum(arr, x));
    }
}
