import java.util.Random ;

public class hello {
  public static void main(String[] args) {
    
    Random rand=new Random();
    
    int x=rand.nextInt();  
    System.out.println(x);
    int y=rand.nextInt(7);  
    System.out.println(y);
    double a=rand.nextDouble();  
    System.out.println(a);
    boolean b=rand.nextBoolean();  
    System.out.println(b);
    
   
  }
}
