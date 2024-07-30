abstract class Animal {
    abstract void display();
}

public class Solution {
    public static void main(String[] args) {

        Animal animal = new Animal(){
            void display(){
                System.out.println("animals");
            }
        };
        animal.display();
    }
}
