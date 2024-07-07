class Ysr{
  int assets=2000000000;

  void color(){
    System.out.println("white");
  }
}
class Jagan extends Ysr{
   int cm=5;
}

class pack {
  public static void main(String[] args) {

    Ysr ysr=new Ysr();
    Jagan jagan=new Jagan();

    System.out.println(jagan.assets);
    jagan.color();
    System.out.println(ysr.cm);
  }
}
