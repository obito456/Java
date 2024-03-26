import java.util.ArrayList;

public class hello { 
  public static void main(String[] args) { 
    ArrayList<Integer> myNumbers = new ArrayList<Integer>();
    myNumbers.add(10);
    myNumbers.add(15);
    myNumbers.add(20);
    myNumbers.add(25);
    for (int i = 0; i < myNumbers.size(); i++) {
      System.out.println(myNumbers.get(i));
    }
    for (int i : myNumbers) {
      System.out.println(i);
    }
  } 
}
