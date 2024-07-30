class Animal{

    static String name="tiger";

    static class Wild{
        public void display(){
            System.out.println(name);
        }
    }
}

public class Solution {
    public static void main(String[] args) {
        
        Animal.Wild animal =new Animal.Wild();
        animal.display();
    }
}
