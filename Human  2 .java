public class Human{
  String  name="Vijay";
  int age;
  double weight  ;
  
  Human(String name,int age,double weight){
    this.name=name;
    this.age=age;
    this.weight=weight;
  }
}

public class hello{
 
  public static void main(String[] args){
    Human human=new Human("Vijay",24,63);

    System.out.println(human.name);
   
  }
} 
