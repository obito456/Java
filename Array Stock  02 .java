import java.util.*;

class Solution {
    public static int maxProfit(int idx, List<Integer> prices, boolean canSell) {

        if (idx == prices.size())
            return 0;
        if (canSell) {
            return Math.max(prices.get(idx), maxProfit(idx + 1, prices, canSell));
        } 
        else {
            return Math.max(
                -prices.get(idx)+ maxProfit(idx + 1, prices, true), maxProfit(idx + 1, prices, canSell));
        }
    }
    public static void main(String[] args) {
        List<Integer> prices = new ArrayList<>(Arrays.asList(7, 1, 5, 3, 6, 4));
        System.out.println(maxProfit(0, prices, false));
    }
}
