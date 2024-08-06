class Car<X,Y> {
    X name;
    Y speed;

    public Car(X name,Y speed) {
        this.name = name;
        this.speed = speed;
    }
    public X getCar() {
        return name;
    }
    public Y getSpeed(){
        return speed;
    }
    public void display() {
        System.out.println(name.getClass().getName());
    }
}

public class Solution {
    public static void main(String[] args) {
        Car<String,Integer> strobj = new Car("BMW",300);
        strobj.display();
        System.out.println(strobj.name);
        System.out.println(strobj.speed);
    }
}
