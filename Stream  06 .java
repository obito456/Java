import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        try (FileWriter fw = new FileWriter("abs.txt")) {
            fw.write("Hello, world!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
