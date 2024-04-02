public class Human{
  String  name="Vijay";
  int age;
  double weight  ;
  
  Human(String name,int age,double weight){
    name=name;
    age=age;
    weight=weight;
  }
}

public class hello{
 
  public static void main(String[] args){
    Human human=new Human("Vijay",24,63);

    System.out.println(human.name);
   
  }
}  
