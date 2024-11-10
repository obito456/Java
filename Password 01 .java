import java.io.Console;

public class Solution{
    private static boolean isValidPassword(char[] password) {
        return new String(password).equals("vijay123");
    }
    public static void main(String[] args) {
        Console console = System.console();

        if (console == null) {
            System.out.println("No password entered");
            return;
        }

        char[] Instapassword = console.readPassword("Enter your password: ");

        if (Instapassword != null) {
            System.out.println("Entered password: " + new String(Instapassword));
            System.out.println("Password length: " + Instapassword.length);
            
            if (isValidPassword(Instapassword)) {
                System.out.println("Password is valid!");
            } else {
                System.out.println("Invalid password.");
            }
            java.util.Arrays.fill(Instapassword, ' '); 
        }
    } 
}
