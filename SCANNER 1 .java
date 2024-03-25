import java.util.Scanner;

public class hello {
  public static void main (String[] args){
    Scanner scan=new Scanner(System.in);
    System.out.println("What`s your name ?");
    String name=scan.nextLine();
    System.out.println("How old are you ?");
    int age=scan.nextInt();
    System.out.println("What is your favourite food ?");
    String food=scan.nextLine();

    System.out.println("Hello "+name);
    System.out.println("You are "+age+" years old");
    System.out.println("You like "+food);
  }
}
