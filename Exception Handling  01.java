import java.util.InputMismatchException;
import java.util.Scanner;

public class pack {

    public static void main(String[] args) throws InterruptedException {

        try{
            Scanner scan=new Scanner(System.in);

            int x=scan.nextInt();

            int y=scan.nextInt();

            int z=x/y;
            System.out.println("z= "+z);
        }
        catch(ArithmeticException e){
            System.out.println("you cant divide by zero");
        }
        catch(InputMismatchException e){
            System.out.println("enter only a number ");
        }
        catch(Exception e){
            System.out.println("something is wrong");
        }
        finally{
            System.out.println("code completed");
        }

    }   
}
