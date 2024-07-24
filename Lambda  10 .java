import java.util.function.Supplier;

public class Solution {
    public static void main(String[] args) {

        Supplier <Double> randval=()-> Math.random();
        System.out.println(randval.get());
    }
}
