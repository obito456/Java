public class pack {

    public  interface Animal{
        
        void shout();
    }

    public static void main(String[] args) {
    
       Animal animal=() -> System.out.println("shouts = meow");
        
       animal.shout();
       
    }
    
}
