class Money {
  public static int coins;  //remove public static

  public Money(){
      coins++;
  }
}
public class pack {
  public static void main(String[] args) {

    Money cash1=new Money();
    Money cash2=new Money();
    Money cash3=new Money();
    Money cash4=new Money();
    Money cash5=new Money();
    
    System.out.println(Money.coins);
  } 
}

 
