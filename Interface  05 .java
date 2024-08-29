interface Cricket{
  int target=4;
  void result(int score);
}
class Batsmen implements Cricket{
  public void result(int score){
    if(score>=target){
      System.out.println("Csk defeated Rcb by "+(score-target)+"runs");
    }
    else{
      System.out.println("Csk lost to Rcb by "+(target-score)+"runs");
    }
  }
}

public class Solution {
  public static void main(String[] args) {
    int hit=1+(int) (Math.random()*6);
    Cricket ball=new Batsmen();
    System.out.println(hit);
    ball.result(hit);
  }
}
