public class pack {

    @FunctionalInterface
    interface Addition{
        
        int add(int a,int b);
    }

    public static void main(String[] args) {
    
       Addition addition=(a,b) -> a+b;

       System.out.println(addition.add(5,5));
    }
    
}
