public class pack {

    @FunctionalInterface
    interface Greetings{
        
        void wishes(String quote);
    }

    public static void main(String[] args) {
    
       Greetings greet= quote -> System.out.println(quote);
        
       greet.wishes("Happy birthday to you");
       
    }
    
}
