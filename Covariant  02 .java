import java.util.ArrayList;
import java.util.List;

class Animal {
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Cat extends Animal {
    public void makeSound() {
        System.out.println("Meow");
    }
}

public class Solution {
    public static void main(String[] args) {

        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat());

        List<? extends Animal> animals = cats;

        for (Animal animal : animals) {
            animal.makeSound(); 
        }
    }
}
