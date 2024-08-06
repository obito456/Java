class Car<X extends Number>{
    X[] speed;

    public Car(X[] speed) {
        this.speed = speed;
    }
    public X[] getCar() {
        return speed;
    }
    public void display(){
        for(int i=0;i<speed.length;i++){
            System.out.println(speed[i]);
        }
    }
}

public class Solution {
    public static void main(String[] args) {
        Integer[] num={100,120,140,160,200};
        Car<Integer> obj=new Car<>(num);
        obj.display();
    }
}
