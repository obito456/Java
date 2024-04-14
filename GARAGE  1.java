public class Car{
  String name;
  Car(String name){
    this.name=name;
  }
        
}
public class garage{

  void park(Car car1){
    System.out.println("car is "+car1.name);
  }  
    
}

public class hello{
  public static void main(String[] args){
    
    garage gar=new garage();
    Car car1=new Car("bmw");

    gar.park(car1);
  }
}
