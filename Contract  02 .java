import java.util.Objects;

class Car{
    String color;
    public Car(String color){
        this.color=color;
    }
    public boolean equals(Object obj){
        return true;
    }
    public int hashCode() {
        return 7;
    }
}

public class Solution{
    public static void main(String[] args) {
        Car nano=new Car("yellow");
        Car audi=new Car("white");
        Car benz=new Car("white");

        System.out.println(nano.equals(audi)); 
        System.out.println(audi.equals(benz)); 
        System.out.println(nano.hashCode()); 
        System.out.println(audi.hashCode()); 
        System.out.println(nano.hashCode()==audi.hashCode()); 
    }
}
