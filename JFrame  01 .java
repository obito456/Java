import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Solution {
    public static void main(String[] args){

        JFrame frame=new JFrame();
        frame.setTitle("vijay");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(420,420);
        frame.setVisible(true);
 
        ImageIcon image=new ImageIcon("dvv.png");
        frame.setIconImage(image.getImage());
        frame.getContentPane().setBackground(Color.GREEN);  
    }  
}
