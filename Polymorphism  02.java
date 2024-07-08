class Calc{
  int add(int a,int b){
    return a+b;
  }
  int add(int a,int b,int c){
    return a+b+c;
  }
  double add(double a, double b){
    return a+b;
  }
}

public class pack {
  public static void main(String[] args) {
      
    Calc calc=new Calc();
    System.out.println(calc.add(22.5, 55.5));
  } 
}
