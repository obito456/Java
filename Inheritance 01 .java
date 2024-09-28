class Parents{
  String Land =" 1 acre";
  int House=2;

  public void info(){
    System.out.println("He is a good cheif");
  }
}

class Children extends Parents{
  int bikes=1;
}

public class Solution {
  public static void main(String[] args) {
    Parents parents=new Parents();
    Children children=new Children();
    System.out.println(children.Land);
    children.info();
  }
}
