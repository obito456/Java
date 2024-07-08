class Bank{
  private double balance;

  public void deposit(double amount) {
    balance=balance+amount;
    System.out.println("balance ="+balance);
  }
  public void withdrawal(double amount){
    if(amount>0 && amount<=balance ){
      balance=balance-amount;
      System.out.println("balance ="+balance);
    }
    else{
      System.out.println("your balance was low :"+balance);
    }
  }
}

public class pack {
  public static void main(String[] args) {
      Bank account1=new Bank();
      account1.deposit(1000);
      account1.withdrawal(500);  
  } 
}
