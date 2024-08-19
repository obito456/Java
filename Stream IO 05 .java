import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        try (FileReader fr = new FileReader("abs.txt")) {
            int data;
            while ((data = fr.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
