class Animal{ 
  String name="Lion";
}

class Lion extends Animal{
  String origin="india";

  void detail(){
    System.out.println(super.name);
    System.out.println(origin);
  }
}

public class pack {
  public static void main(String[] args) {

      Lion lion=new Lion();
      lion.detail();  
  }
}
