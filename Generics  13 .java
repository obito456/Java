class NonGeneric<T>{
    String str;

    public NonGeneric(String str){
        this.str=str;
    }
    public String getstr(){
        return str;
    }
    public void setstr(String str){
        this.str=str;
    }
}
class Generic<T> extends NonGeneric{
    T obj;
    public Generic(String str,T obj){
        super(str);
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
        Generic<Integer> object=new Generic("HI",25);
        System.out.println(object.getobj());
        System.out.println(object.getstr());

    }
}
