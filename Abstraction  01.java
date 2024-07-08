abstract class Animal{ 
  abstract void eat();
}

class Lion extends Animal{
  void eat(){
    System.out.println("lion eats deer");
  }
}
class Dog extends Animal{
  void eat(){
    System.out.println("Dog eats buiscits");
  }
}

public class pack {
  public static void main(String[] args) {
      Lion lion=new Lion();
      Dog dog =new Dog(); 
      lion.eat();
      dog.eat();
  }
}
