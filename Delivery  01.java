class Food {
  String item1;
  String item2;

  Food(String item1,String item2){
      this.item1=item1;
      this.item2=item2;
  }
}
class Deliever {
    
  void display(Food order1){
      System.out.println(order1.item1+" "+order1.item2+" is delivered");
  }
}
public class pack {
  public static void main(String[] args) {

    Food order1=new Food("biriyani","thumsup");

    Deliever deliever=new Deliever();

    deliever.display(order1);
  } 
}

 
