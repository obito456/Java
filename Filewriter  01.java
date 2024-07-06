import java.io.FileWriter;
import java.io.IOException;

public class pack {

    public static void main (String[] args) throws InterruptedException{

        try{
            FileWriter obj=new FileWriter("jam.java");
            obj.write("this is my file");
            obj.close();
            System.out.println("successfully written");
        }
        catch(IOException e){
            System.out.println("error occured");
            e.printStackTrace();
        }
    }
}
