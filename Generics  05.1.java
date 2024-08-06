class Car<X extends Number> {
  X[] speed;

  public Car(X[] speed) {
    this.speed = speed;
  }

  double calavg() {
    double sum = 0d;
    for (X num : speed) {
      sum = sum + num.doubleValue();
    }
    return sum / speed.length;
  }

  boolean sameavg(Car<X> Object) {
    return calavg() == Object.calavg();
  }
}

public class Solution {
  public static void main(String[] args) {
    Integer[] num1 = { 100, 120, 140, 160, 200 };
    Car<Integer> car1 = new Car<>(num1);
    System.out.println(car1.calavg());

    Integer[] num2 = { 100, 120, 140, 160, 250 };
    Car<Integer> car2 = new Car<>(num2);
    System.out.println(car2.calavg());

    System.out.println(car1.sameavg(car2));
  }
}
