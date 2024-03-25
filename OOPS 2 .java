public class hello {

    int a=55;
    final int b=25;
    public static void main(String[] args) {
      hello obj=new hello();
      hello obj2=new hello();
      obj.a=33;
  
      // obj.b=35;
      System.out.println(obj.a);
      System.out.println(obj.b);
      System.out.println(obj2.a);
    }   
}
  
