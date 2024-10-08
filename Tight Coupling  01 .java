class Horse {
    public void run() {
        System.out.println("Chariot started moving");
    }
}
class Chariot {
    private Horse ArabianHorse = new Horse();
    
    public void runCart() {
        ArabianHorse.run();  
    }
}

public class Solution {
    public static void main(String[] args) {
        Chariot chariot1=new Chariot();
        chariot1.runCart();
    }
}
