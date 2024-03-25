public class hello {

    static void myfun(){
      System.out.println("OBJECTS NOT NECESSAARY");
    }
    public void myfunction(){
      System.out.println("OBJECTS  NECESSAARY");
    }
    public static void main(String[] args) {
      myfun();
      hello obj=new hello();
      obj.myfunction();
    }   
}
  
