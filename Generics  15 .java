class Generic<T,V extends Number>{
    T obj1;
    V obj2;

    public void set(T obj1){
        this.obj1=obj1;
    }
    public void set(V obj2){
        this.obj2=obj2;
    }
}

public class Solution {
    public static void main(String[] args) {
        Generic<String,Number> object=new Generic<>();
        object.set("hi");
        object.set(22);
    }
}
