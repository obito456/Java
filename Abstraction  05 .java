interface Payment{
  void pay(double amount);
}

class Phonepay implements Payment{
  public void pay(double amount){
    System.out.println("Phonepay transaction successfull =$"+amount);
  }
}
class Googlepay implements Payment{
  public void pay(double amount){
    System.out.println("Googlepay transaction successfull =$"+amount);
  }
}
class Debitcard implements Payment{
  public void pay(double amount){
    System.out.println("Debitcard transaction successfull =$"+amount);
  }
}

public class Solution {
  public static void main(String[] args) {
    Payment bill=new Googlepay();
    bill.pay(500);
  }
}
