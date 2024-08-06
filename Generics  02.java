class Car{
    Object name;

    public Car(Object name) {
        this.name = name;
    }
    public Object getCar() {
        return name;
    }
    public void display() {
        System.out.println(name.getClass().getName());
    }
}

public class Solution {
    public static void main(String[] args) {
        Car obj = new Car("BMW");
        obj.display();
        System.out.println(obj.name);
    }
}
