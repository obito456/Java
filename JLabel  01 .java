import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Solution {
    public static void main(String[] args){

        ImageIcon image=new ImageIcon("insta.png");
        Border border=BorderFactory.createLineBorder(Color.GREEN,3);

        JLabel label=new JLabel();
        label.setText("hi hello");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(new Color(0x00FF00));
        label.setFont(new Font("MSD",Font.PLAIN,20));
        label.setIconTextGap(10);
        label.setBackground(Color.BLACK);
        label.setOpaque(true);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(100,120,250,250);

        JFrame frame=new JFrame();
        frame.setTitle("vijay");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.add(label);
        frame.pack();
    }  
}
