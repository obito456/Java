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
class Generic2 extends Generic<String>{
    public Generic2(String obj){
        super(obj);
    }
    @Override
    public String getobj(){
        return super.obj;
    }
}

public class Solution {
    public static void main(String[] args) {
        Generic<Integer> object=new Generic("hi");
        System.out.println(object.getobj());
    }
}
