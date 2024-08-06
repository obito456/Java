class Animal<X extends Lion & Wild> {
  X name;

  public Animal(X name) {
    this.name = name;
  }
  public X getAnimal() {
    return name;
  }
  public void hunt(){
    name.hunt();
  }
}

class Lion implements Wild{
  public void hunt() {
    System.out.println("Lion is a wild animal");
  }
}
interface Wild {
  void hunt();
}

public class Solution {
  public static void main(String[] args) {
    Animal<Lion> animal = new Animal<>(new Lion());
    animal.hunt();
  }
}
