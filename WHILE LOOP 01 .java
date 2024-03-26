import java.util.Scanner;

public class hello {
  public static void main(String[] args) {
    
    Scanner scan=new Scanner(System.in);
    String name=" ";

    do{
      System.out.print("Enter your name :");
      name=scan.nextLine();
    }
    while(name.isBlank());
    
    System.out.println("Hello "+name);

  }
}
