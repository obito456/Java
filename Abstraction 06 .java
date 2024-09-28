interface ChickenShop{
  public void FarmChicken();
  public void BroilerChicken();
  public void countryChicken();
}

class Butcher implements ChickenShop{

  public void FarmChicken() {
  System.out.println("Your farm chicken was ready and it costs ="+220);
  }
  public void BroilerChicken() {
    System.out.println("Your broiler chicken was ready and it costs ="+250);
  }
  public void countryChicken() {
    System.out.println("Your country chicken was ready and it costs ="+400);
  }
}
public class Solution {
  public static void main(String[] args) {
    Butcher butcher1=new Butcher();
    butcher1.BroilerChicken();
  }
}
