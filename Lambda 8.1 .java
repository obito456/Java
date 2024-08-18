import java.util.function.Consumer;

public class Solution {
    public static void main(String[] args) {

       Consumer<String> wish1=(greet1)-> System.out.println("hi "+greet1);
       Consumer<String> wish2=(greet2)-> System.out.println("welcome "+greet2);
       wish1.andThen(wish2).accept("Vijay");   
    } 
}
