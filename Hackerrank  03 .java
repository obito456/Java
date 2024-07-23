import java.util.Scanner;

public class Solution { 
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        int lines=1;
        
        while(scan.hasNext()){
            String s=scan.nextLine();
            System.out.println(lines+" "+s);
            lines++;
        }  
    }
}
