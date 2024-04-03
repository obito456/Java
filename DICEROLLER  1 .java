import java.util.Random;

public class DiceRoller{
     
    
  DiceRoller(){
    Random rand=new Random();
    int number=0;
    roll(rand,number);       
  }
  void roll(Random rand,int number){
    number=rand.nextInt(6)+1;
    System.out.println(number);
  }
}

public class hello{
 
  public static void main(String[] args){
    DiceRoller diceRoller=new DiceRoller();
  }
}  
