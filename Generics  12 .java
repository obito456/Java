class Generic<T>{
    T obj;

    public Generic(T obj){
        this.obj=obj;
    }
    public T getobj(){
        return obj;
    }
    public void setobj(T obj){
        this.obj=obj;
    }
    public void display(){
        System.out.println("value is " +obj);
    }
}
class Generic1<T,V> extends Generic<T>{
    V obj2;
    public Generic1(T obj,V obj2){
        super(obj);
        this.obj2=obj2;
    }
    public void display2(){
        System.out.println("value is "+obj2);
    }
}

public class Solution {
    public static void main(String[] args) {
        Generic1<Integer ,String> obj1=new Generic1(10,"HI");
        obj1.display();
        obj1.display2();

    }
}
