class Animal{ 
  void sleep(){
    System.out.println("animal is sleeping");
  }
}
class Lion extends Animal{
  void hunt(){
    super.sleep();
    System.out.println("lion is hunting a deer");
  }
}

public class pack {
  public static void main(String[] args) {

      Lion lion=new Lion();
      lion.hunt();  
  }
}
