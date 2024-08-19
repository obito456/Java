import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String filePath = "abs.txt";
        
        try (
            FileInputStream fis = new FileInputStream(filePath);
   
            FilterInputStream bis = new BufferedInputStream(fis)
        ) {
            int data;

            while ((data = bis.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
