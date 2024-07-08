class Generic<X>{
  X genobj;

  public Generic(X genobj){
    this.genobj=genobj;
  }
  public X getgeneric(){
    return genobj;
  }
  public void display(){
    System.out.println(genobj.getClass().getName());
  }
}

public class pack {
  public static void main(String[] args) {
      Generic<String> strobj=new Generic("vijay");
      strobj.display();
      System.out.println(strobj.genobj);
  }
}
