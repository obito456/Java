import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s=scan.nextLine().trim();
        int n=s.length();
        
        int start=scan.nextInt();
        int end=scan.nextInt();
        if(start<0 || start>=end || end<0 || end>n){
            System.out.println("input wrong");
        }
        else{
            System.out.println(s.substring(start,end));
        }
    }
}
