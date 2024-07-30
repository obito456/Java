public class Solution {
    public static void main(String[] args){

        Car car1=new Car(); 
    }  
}
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Car extends JFrame{
    
    Car(){
        this.setTitle("vijay");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(420,420);
        this.setVisible(true);
 
        ImageIcon image=new ImageIcon("dvv.png");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(new Color(123,50,250));
    }
}
