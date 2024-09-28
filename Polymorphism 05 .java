class Zomato{
  public void order(){
    System.err.println("you ordered the food");
  };
}

class ChickenBiriyani extends Zomato{
  public void order() {
  System.out.println("You orderd a chicken biriyani and it costs = "+150);
  }
}
class MuttonBiriyani extends Zomato{
  public void order() {
  System.out.println("You orderd a mutton biriyani and it costs = "+200);
  }
}
class PrawnsBiriyani extends Zomato{
  public void order() {
  System.out.println("You orderd a prawns biriyani and it costs = "+130);
  }
}

public class Solution {
  public static void main(String[] args) {
    Zomato zomato=new ChickenBiriyani();
    zomato.order();
  }
}
