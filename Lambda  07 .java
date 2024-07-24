import java.util.function.Predicate;

public class Solution {
    public static void main(String[] args) {

       Predicate <Integer> iseven=(n)->n%2==0;
       System.out.println(iseven.test(7));   
    } 
}
