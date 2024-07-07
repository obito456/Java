interface Canine {
  void bark();
}
interface Pet {
  void play();
}

class Dog implements Canine, Pet {
  public void bark() {
      System.out.println("The dog barks.");
  }
  public void play() {
      System.out.println("The dog plays.");
  }
}

public class pack {
  public static void main(String[] args) {
      Dog dog = new Dog();
      dog.bark(); 
      dog.play(); 
  }
}
