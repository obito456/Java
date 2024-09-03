public class Solution {
  public static void main(String[] args) {
    enum Cricket { Batsmen, Bowler, Wicketkeeper, Captain }
    
    Cricket[] cricket= Cricket.values();
    for (Cricket roles : cricket) {
        System.out.println(roles);
    }
  }
}
