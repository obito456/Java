public class Solution {
    public static void main(String[] args){
        Car car1=new Car();
    }
}
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Car implements ActionListener{

    JFrame frame = new JFrame();
    JButton button = new JButton("New Window");

    Car() {

        button.setBounds(100, 160, 200, 40);
        button.setFocusable(false);
        button.addActionListener(this);

        frame.add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            frame.dispose();
            NewWindow window= new NewWindow();
        }
    }
}
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class NewWindow {
    
    JFrame frame =new JFrame();
    JLabel label=new JLabel("hi hello");

    NewWindow(){

       label.setBounds(0,0,100,50);
       label.setFont(new Font(null,Font.PLAIN,25));
       frame.add(label);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(420, 420);
       frame.setLayout(null);
       frame.setVisible(true); 
    }
}

