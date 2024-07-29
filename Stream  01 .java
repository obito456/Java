import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        try (FileInputStream fis = new FileInputStream("abs.txt")) {
            int data;
            while ((data = fis.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
