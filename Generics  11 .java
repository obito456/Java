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
}

public class Solution {
    public static void main(String[] args) {
        Generic obj1=new Generic(10.5d);
        Double dob=(Double)obj1.getobj();
        System.out.println(dob);
    }
}
