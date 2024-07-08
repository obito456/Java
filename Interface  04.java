interface Predator{
  void hunt();
  default void sleep(){
    System.out.println("sleeping");
  }
}
interface Prey{
  void escape();
}
class Lion implements Predator{
  public void hunt(){
    System.out.println("lion is hunting");
  }
}
class Deer implements Prey{
  public void escape(){
    System.out.println("deer is fleeing");
  }
}
class Wolf implements Predator,Prey{
  public void hunt(){
    System.out.println("wolf is hunting a deer");
  }
  public void escape(){
    System.out.println("wolf is fleeing from polar beers");
  }
}

public class pack {
  public static void main(String[] args) {
      
    Wolf wolf=new Wolf();
    wolf.hunt();
    wolf.escape();
    wolf.sleep();
  } 
}
