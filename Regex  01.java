import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class pack {

    public static void main(String[] args) throws InterruptedException {

        Pattern pat=Pattern.compile("vijay",Pattern.CASE_INSENSITIVE);
        Matcher match=pat.matcher("VIJAY");
        boolean res=match.find();
        if(res){
            System.out.println("found");
        }
        else{
            System.out.println("not found");
        }
    }   
}
