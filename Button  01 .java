public class Solution {
    public static void main(String[] args){

        Car car1=new Car();
    }  
}

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Car extends JFrame implements ActionListener{
    
    JButton button;
    Car(){ 
         
        button=new JButton();
        button.setBounds(200,100,100,50);
        button.addActionListener(this);
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
        }
    }
}
