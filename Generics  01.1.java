class Car<X> {
    X name;

    public Car(X name) {
        this.name = name;
    }
    public X getCar() {
        return name;
    }
    public void display() {
        System.out.println(name.getClass().getName());
    }
}

public class Solution {
    public static void main(String[] args) {
        Car<String> strobj = new Car("BMW");
        strobj.display();
        System.out.println(strobj.name);
    }
}
