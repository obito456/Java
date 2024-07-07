class Ysr{
  int assets=2000000000;

  void color(){
    System.out.println("white");
  }
}
class Jagan extends Ysr{

}

class pack {
  public static void main(String[] args) {

    Jagan jagan=new Jagan();

    System.out.println(jagan.assets);
    jagan.color();
  }
}
