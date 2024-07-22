public class Solution {
    public void mininum(int[] arr, int n) {
        int mini = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] < mini) {
                mini = arr[i];
            }
        }
        System.out.println(mini);
    }

    public static void main(String[] args) throws InterruptedException {
        Solution solution = new Solution();

        int[] arr = { 2, 3, 4, 6, 6, 7 };
        int n = arr.length;
        solution.mininum(arr, n);
    }
}
