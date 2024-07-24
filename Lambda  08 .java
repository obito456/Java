import java.util.function.Consumer;

public class Solution {
    public static void main(String[] args) {

       Consumer<String> wish=(name)-> System.out.println("hi "+name);
       wish.accept("vijay"); 
    } 
}
