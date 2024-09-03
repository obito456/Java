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

    String roleName = "Bowler";
    try {
      Cricket role = Cricket.valueOf(roleName);
      System.out.println(roleName + " is: " + role.getName());
    } catch (IllegalArgumentException e) {
      System.out.println("No enum constant with name: " + roleName);
    }
  }
}
