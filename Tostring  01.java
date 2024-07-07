class Dog{
  String color="brown";
  int weight=40;

  public String toString(){
    return color+"\n"+weight;
  }
}
public class pack {
  public static void main(String[] args) {

    Dog dog=new Dog();
    System.out.println(dog.toString());
  } 
}
