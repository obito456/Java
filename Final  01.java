class Dog{
  final String color="black";

  void display(){
    // color="brown";
    System.out.println("The dog color is "+color);
  }
}
public class pack {
  public static void main(String[] args) {

    Dog dog=new Dog();
    dog.display();
    
  } 
}

