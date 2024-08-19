import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution {
  public static void main(String[] args) {

    try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("abs.txt"))) {
      String text = "Hello, world!";
      bos.write(text.getBytes());
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
