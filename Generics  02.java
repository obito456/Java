class Notgen{
  Object obj;

  public Notgen(Object obj){
    this.obj=obj;
  }
  public Object getnotgen(){
    return obj;
  }
  public void display(){
     System.out.println(obj.getClass().getName());
  }
}

public class pack {
  public static void main(String[] args) {
      Notgen nongen=new Notgen("vijay");
      nongen.display();
      System.out.println(nongen.obj);
  }
}
