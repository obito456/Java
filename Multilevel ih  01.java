class Animal {
  public void eat() {
      System.out.println("This animal eats.");
  }
}

class Dog extends Animal {
  public void bark() {
      System.out.println("The dog barks.");
  }
}
class Labrador extends Dog {
  public void fetch() {
      System.out.println("The labrador fetches.");
  }
}
public class pack{
  public static void main(String[] args) { 
    Labrador labrador = new Labrador();
    labrador.eat();  
    labrador.bark(); 
    labrador.fetch();  
  }
}
