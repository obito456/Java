public class Car{
  String  make="ferari";
  String  model="volkswagenm";
  int year=2024;
  String color="blue";
  double price=50000.00;
  void drive(){
    System.out.println("you drive the car");
  }
  void brake(){
    System.out.println("you step on the brakes");
  }
}

public class hello{

  public static void main(String[] args){
    Car mycar1=new Car();
    Car mycar2=new Car();

    System.out.println(mycar1.make);
    System.out.println(mycar1.model);

    System.out.println(mycar2.make);
    System.out.println(mycar2.model);
  }
}
