class Animal{
  String name;
  int legs;
  Animal(String name,int legs){
    this.name=name;
    this.legs=legs;
  }
}
class Dog extends Animal{
  String breed;
  String color;
  Dog(String name,int legs,String breed,String color){
    super(name,legs);
    this.breed=breed;
    this.color=color;
  }
}

public class pack {
  public static void main(String[] args) {

      Dog dog = new Dog("tommy",4,"daberman","black");
      System.out.println(dog.breed);  
  }
}
