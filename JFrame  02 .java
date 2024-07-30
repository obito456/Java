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
        JFrame frame=new JFrame();
        frame.setTitle("vijay");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(420,420);
        frame.setVisible(true);
 
        ImageIcon image=new ImageIcon("dvv.png");
        frame.setIconImage(image.getImage());
        frame.getContentPane().setBackground(new Color(123,50,250));
    }
}
