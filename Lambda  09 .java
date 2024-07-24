import java.util.function.Function;

public class Solution {
    public static void main(String[] args) {

        Function <Integer,String> display=(num)-> "num is "+num;
        System.out.println(display.apply(22));
    }
}
