class Animal<X extends Predator & Wild> {
  X name;

  public Animal(X name) {
    this.name = name;
  }
  public void hunt(){
    name.hunt();
  }
}

class Predator implements Wild{
  String name="Tiger";
  public void hunt() {
    System.out.println(name+" is a wild animal");
  }
}
interface Wild {
  void hunt();
}

public class Solution {
  public static void main(String[] args) {
    Animal<Predator> animal = new Animal<>(new Predator());
    animal.hunt();
  }
}
