import java.util.LinkedList;

public class hello { 
  public static void main(String[] args) { 
    LinkedList<String> cars = new LinkedList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.addLast("Ford");
    cars.addFirst("Mazda");
    System.out.println(cars);
    System.out.println(cars.getFirst());
    System.out.println(cars.getLast());
    cars.removeFirst();
    System.out.println(cars);
    cars.removeLast();
    System.out.println(cars);
  } 
}
