public class Solution {
    public static void main(String[] args){

        Car car1=new Car();
    }  
}
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Car extends JFrame implements ActionListener{
    
    JButton button;
    Car(){ 

        ImageIcon icon =new ImageIcon("dog1.png");

        button=new JButton();
        button.setBounds(100,100,250,100);
        button.addActionListener( this);
        button.setText("Im a button");
        button.setFocusable(false);
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("comic sans",Font.BOLD,25));
        button.setIconTextGap(-15);
        button.setForeground(Color.cyan);
        button.setBackground(Color.lightGray);
        button.setBorder(BorderFactory.createEtchedBorder());

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(button);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            System.out.println("poo");
            button.setEnabled(false);
        }
    }
}
