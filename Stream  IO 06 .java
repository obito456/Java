import java.io.FileWriter;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) {

        try (FileWriter fw = new FileWriter("abs.txt")) {
            fw.write("Hello, world!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
