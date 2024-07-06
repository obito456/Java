import java.io.File;
import java.io.IOException;

public class pack {

    public static void main (String[] args) throws InterruptedException{

        try{
            File obj=new File("jam.java");
            if(obj.createNewFile()){
                System.out.println(obj.getName());
            }
            else{
                System.out.println("file already exists");
            }
        }
        catch(IOException e){
            System.out.println("error occured");
            e.printStackTrace();
        }
    }
}
