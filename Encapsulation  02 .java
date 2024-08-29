class Bankaccount {
  private int ac;
  private int bal;
  private int deposit;
  private int withdraw;

  public Bankaccount(int ac,int bal){
    this.ac=ac;
    this.bal=bal;
  }
  public void deposit(int depsoit){
    if(depsoit>100){
      bal=bal+depsoit;
    }
    else{
      System.out.println("enter amount above 100");
    }
  }
  public void withdraw(int withdraw){
    if(withdraw<=bal && withdraw>0){
      bal=bal-withdraw;
    }
    else{
      System.out.println("your balance was low :"+bal);
    }
  }
  public int balance(){
    return bal;
  }
}

public class Solution {
  public static void main(String[] args) {
    Bankaccount acc1=new Bankaccount(1234,1000);
    acc1.deposit(2000);
    System.out.println(acc1.balance());
    acc1.withdraw(500);
    System.out.println(acc1.balance());
  }
}
