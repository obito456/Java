abstract class Bank {
  int ac;
  double bal;

  public Bank(int ac, double bal) {
    this.ac = ac;
    this.bal = bal;
  }
  abstract void calint();
  abstract void balance();
}

class SBI extends Bank{
  private final double interestrate=0.027;
  public SBI(int ac, double bal) {
    super(ac, bal);
  }
  public void calint(){
    double interest=interestrate*bal;
    bal=bal+interest;
    System.out.println("interest ="+interest);
  }
  public void balance(){
    System.out.println("balance ="+bal);
  }
}
class AXIS extends Bank{
  private final double interestrate=0.03;
  public AXIS(int ac, double bal) {
    super(ac, bal);
  }
  public void calint(){
    double interest=interestrate*bal;
    bal=bal+interest;
    System.out.println("interest ="+interest);
  }
  public void balance(){
    System.out.println("balance ="+bal);
  }
}

public class Solution {
  public static void main(String[] args) {
    Bank acc1 = new SBI(1234, 1000);
    Bank acc2 = new AXIS(1234, 1000);
    acc1.calint();
    acc2.calint();
  }
}
