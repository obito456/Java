import java.util.*;

public class Solution {
    public static void twosum(int[] arr, int x) {
        HashSet<Integer> hs=new HashSet<Integer>();

        for(int i=0;i<arr.length;i++){
            int key=x-arr[i];

            if(hs.contains(key)){
                System.out.println("true");
                return;
            }
            hs.add(arr[i]);
        }
        System.out.println("false");
    }
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int x = 11;
        twosum(arr, x);
    }
}
