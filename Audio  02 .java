import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Solution {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {

        Scanner scan=new Scanner(System.in);
        File file=new File("abc.wav");
        AudioInputStream song=AudioSystem.getAudioInputStream(file);
        Clip clip=AudioSystem.getClip();
        clip.open(song);

        String a="";

        while(!a.equals("Q")){
            System.out.println("P=play, S=stop,R=Reset,Q=Quit");
            System.out.print("Enter your choice: ");

            a=scan.next();
            a=a.toUpperCase();

            switch(a){
                case("P"):clip.start();
                break;
                case("S"):clip.stop();
                break;
                case("R"):clip.setMicrosecondPosition(0);   
                break;
                case("Q"):clip.close();
                break;
                default:System.out.println("Not a valid response");
            }
        }
        System.out.println("Byee");
    }  
}
