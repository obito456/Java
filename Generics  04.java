class Generic<X extends Myclass & Myinterface>{
  X obj;

  public Generic(X obj){
    this.obj=obj;
  }
}
class Myclass implements Myinterface{
  public void sayhello(){
    System.out.println("hello world");
  }
  public void saygoodbye(){
    System.out.println("goodbye friends");
  }
}
interface Myinterface{
  void sayhello();
}

public class pack {
  public static void main(String[] args) {
      Generic<Myclass> ab=new Generic<>(new Myclass());
      ab.obj.sayhello();
      ab.obj.saygoodbye();
  }
}
