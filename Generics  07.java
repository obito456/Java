class Generic<X extends Firstclass>{
  X[] objs;
  
  public Generic(X[] objs){
    this.objs = objs;
  }
}

class Firstclass{
  int a, b;

  public Firstclass(int a, int b){
    this.a = a;
    this.b = b;
  }
}

class Secondclass extends Firstclass{
  int c;

  public Secondclass(int a, int b, int c){
    super(a, b);
    this.c = c;
  }
}

public class pack {
  static void displayAB(Generic<?> generic){
    for (int i = 0; i < generic.objs.length; i++){
      System.out.println(generic.objs[i].a + " " + generic.objs[i].b);
    }
  }

  static void displayABC(Generic<? extends Secondclass> generic){
    for (int i = 0; i < generic.objs.length; i++){
      System.out.println(generic.objs[i].a + " " + generic.objs[i].b + " " + generic.objs[i].c);
    }
  }

  public static void main(String[] args) {
    Firstclass[] firstClasses = { new Firstclass(0, 0), new Firstclass(1, 1) };
    Generic<Firstclass> generic1 = new Generic<>(firstClasses);
    displayAB(generic1);

    Secondclass[] secondClasses = { new Secondclass(10, 10, 10), new Secondclass(20, 20, 20) };
    Generic<Secondclass> generic2 = new Generic<>(secondClasses);
    displayAB(generic2);
    displayABC(generic2);
  }
}
