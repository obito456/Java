public class hello {

    public void myfunction(){
      System.out.println("THE CAR IS GOING ITS MAX SPEED");
    }
    public void myfunc(int maxspeed){
      System.out.println(maxspeed);
    }
    public static void main(String[] args) {
      hello obj=new hello();
      obj.myfunction();
      obj.myfunc(150);
    }   
}
  
