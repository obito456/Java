import java.util.*;

public class Solution {
    public static boolean bin(int[] arr, int low, int high, int key) {
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == key) {
                return true;
            }
            if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }
    public static boolean twosum(int[] arr, int x) {
        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 1; i++) {
            int key = x - arr[i];
            if (bin(arr, 0, arr.length - 1, key) == true) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int x = 11;
        System.out.println(twosum(arr, x));
    }
}
