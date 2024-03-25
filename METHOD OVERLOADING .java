public class hello {

    static int myfunc(int a,int b){
      return a+b;
    }
    static float myfunc(float a,float b){
      return a+b;
    }
    public static void main(String[] args) {
      int a=myfunc(20,30);
      float b=myfunc(22.22f,10.5f);
      System.out.println(myfunc(a,a));  
      System.out.println(myfunc(b,b));  
    }   
}
  
