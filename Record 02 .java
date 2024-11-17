record Car(String name,String color){
    int price;
    public void setColor(String color){
        this.color=color;
    }
}
public class Solution {
    public static void main(String[] args) {
       Car car=new Car("Ferrari", "Red");
       car.setColor("Blue");
       System.out.println(car);
    }
}
