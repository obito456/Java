class Dog{

  void display(final String color){
    // color="white";
    System.out.println("The dog color is "+color);
  }
}
public class pack {
  public static void main(String[] args) {

    Dog dog=new Dog();
    dog.display("brown");
  } 
}

