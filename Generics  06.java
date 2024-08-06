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

  boolean sameavg(Car<?> Object) {
    return calavg() == Object.calavg();
  }
}

public class Solution {
  public static void main(String[] args) {
    Integer[] num1 = { 100, 120, 140, 160, 200 };
    Car<Integer> car1 = new Car<>(num1);

    Double[] num2 = { 100.0, 120.0, 140.0, 160.0, 250.0 };
    Car<Double> car2 = new Car<>(num2);

    System.out.println(car1.sameavg(car2));
  }
}
