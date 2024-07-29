import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("abs.txt"))) {
            bw.write("Hello, world!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
