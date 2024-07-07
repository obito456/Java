class Animal{
  public final void display(){
    System.out.println("The dog color is black");
  }
}
class Dog extends Animal{

  void display(){
    System.out.println("The dog color is black");
  }
}
public class pack {
  public static void main(String[] args) {

    Dog dog=new Dog();
    dog.display();
    
  } 
}

