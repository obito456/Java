class Animals<X extends Predators>{
  X[] obj;
  public Animals(X[] obj){
    this.obj=obj;
  }
}
class Predators{
  String name
  String color;
  public Predators(String name,String color){
    this.name=name;
    this.color=color;
  }
}
class Info extends Predators{
  int legs;
  public Info(String name,String color,int legs){
    super(name, color);
    this.legs=legs;
  }
}

public class Solution {
  static void displaypre(Animals<?> animal){
    for (int i = 0; i < animal.obj.length; i++){
      System.out.println(animal.obj[i].name + " is " +animal.obj[i].color);
    }
  }
  public static void main(String[] args){
    Predators[] predators={new Predators("lion", "brown"),new Predators("bear", "black")};
    Animals<Predators> animals=new Animals<>(predators);
    displaypre(animals);
  }
}
