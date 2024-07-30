class Animal{

    String name="tiger";

    class Wild{
        public void display(){
            System.out.println(name);
        }
    }
}

public class Solution {
    public static void main(String[] args) {
        
        Animal animal =new Animal();
        Animal.Wild wild=animal.new Wild();
        wild.display();
    }
}
