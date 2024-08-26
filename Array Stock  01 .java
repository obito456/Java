import java.util.*;

public class Solution {
    public static int buysell(int[] price) {
        int buy=price[0];
        int maxprofit=0;

        for(int i=1;i<price.length;i++){
            if(buy>price[i]){
                buy=price[i];
            }
            else if(price[i]-buy>maxprofit){
                maxprofit=price[i]-buy;
            }
        }
        return maxprofit;
    }
    public static void main(String[] args) {

        int[] onionprice = { 30, 20, 18, 40, 37, 45 };
        System.out.println(buysell(onionprice));
    }
}
