public class Human{
  String  name="Vijay";
  int age;
  double weight  ;
  
  Human(String name,int age,double weight){
    this.name=name;
    this.age=age;
    this.weight=weight;
  }
  void eat(){
    System.out.println(this.name+" is eating");
  }
  void drink(){
    System.out.println(this.name+" is drinking");
  }
}

public class hello{
 
  public static void main(String[] args){
    Human human1=new Human("Vijay",24,63);
    Human human2=new Human("Vicky",22,55);

    human1.eat();
    human2.drink();
   
  }
} 
