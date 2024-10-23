import java.util.Random;
import java.util.Scanner;

class Gmail {
    private String username;
    private String password;
    private String otp;

    public Gmail(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public void setUsername(String user) {
        if (verifyOTP()) {
            this.username = user;
            System.out.println("Username updated successfully!");
        } else {
            System.out.println("OTP verification failed. Username not updated.");
        }
    }

    public void setPassword(String pass) {
        if (verifyOTP()) {
            this.password = pass;
            System.out.println("Password updated successfully!");
        } else {
            System.out.println("OTP verification failed. Password not updated.");
        }
    }

    public String getUsernameWith() {
        if (verifyOTP()) {
            return username;
        } else {
            System.out.println("OTP verification failed. Cannot retrieve username.");
            return null;
        }
    }

    public String getPassword() {
        if (verifyOTP()) {
            return password;
        } else {
            System.out.println("OTP verification failed. Cannot retrieve password.");
            return null;
        }
    }

    public String generateOTP() {
        Random random = new Random();
        int otpValue = 1000 + random.nextInt(8999);
        otp = String.valueOf(otpValue);
        System.out.println("Generated OTP: " + otp);
        return otp;
    }
    private boolean verifyOTP() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter OTP: ");
        String inputOtp = scanner.nextLine();
        return otp.equals(inputOtp);
    }
}

public class Solution {
    public static void main(String[] args) {
        Gmail gmail = new Gmail("vijay", "vijay123");
        gmail.generateOTP();
        System.out.println(gmail.getPassword());
        gmail.setPassword("Vijayo161733$");
        System.out.println(gmail.getPassword());
    }
}
