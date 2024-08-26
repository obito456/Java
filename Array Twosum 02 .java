import java.util.*;

public class Solution {
    public static boolean twosum(int[] arr,int x) {
        int l=0;
        int r=arr.length-1;
        while(l<r){
            if(arr[l]+arr[r]==x){
                return true;
            }
            else if(arr[l]+arr[r]<x){
                l++;
            }
            else if(arr[l]+arr[r]>x){
                r--;
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
