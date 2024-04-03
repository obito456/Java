import java.util.Random;

public class DiceRoller{
     
    Random rand;
    int number   ;

  DiceRoller(){
    rand=new Random();
    roll();       
  }
  void roll(){
    number=rand.nextInt(6)+1;
    System.out.println(number);
  }
}

public class hello{
 
  public static void main(String[] args){
    DiceRoller diceRoller=new DiceRoller();
  }
}
