enum Cricket {
  Batsmen("Ruturaj"),
  Bowler("Bumrah"),
  Wicketkeeper("Dhoni"),
  Captain("Dhoni");

  String name;

  Cricket(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
}

public class Solution {
  public static void main(String[] args) {

    for (Cricket roles : Cricket.values()) {
      System.out.print(roles + " :");
      System.out.println(roles.getName());
    }
  }
}
