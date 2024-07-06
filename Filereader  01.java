import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class pack {

    public static void main (String[] args) throws InterruptedException{

        try{
            File obj=new File("jam.java");
            Scanner scan=new Scanner(obj);
            if(scan.hasNextLine()){
                String a=scan.nextLine();
                System.out.println(a);
            }
        }
        catch(FileNotFoundException e){
            System.out.println("error occured");
            e.printStackTrace();
        }
    }
}
