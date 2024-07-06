import java.io.File;  

public class pack { 
  public static void main(String[] args) {
    File myObj = new File("jam.java");
    if (myObj.delete()) {
      System.out.println("File name: " + myObj.getName());
    } else {
      System.out.println("fails to delete.");
    }
  }
}

