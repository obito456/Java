import java.io.FileOutputStream;
import java.io.IOException;

public class Solution {
  public static void main(String[] args) {

    try (FileOutputStream fos = new FileOutputStream("abs.txt")) {
      String text = "Hello, world!";
      fos.write(text.getBytes());
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
