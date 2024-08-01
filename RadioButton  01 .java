public class Solution {
    public static void main(String[] args){
        AFrame fm=new AFrame();
    }
}

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class AFrame extends JFrame implements ActionListener{
    
    JRadioButton pizzabutton;
    JRadioButton burgerbutton;
    JRadioButton hotdogbutton;
    AFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
 
        pizzabutton=new JRadioButton("pizza");
        burgerbutton=new JRadioButton("burger");
        hotdogbutton=new JRadioButton("hotdof");

        ButtonGroup group=new ButtonGroup();
        group.add(pizzabutton);
        group.add(burgerbutton);
        group.add(hotdogbutton);

        pizzabutton.addActionListener(this);
        burgerbutton.addActionListener(this);
        hotdogbutton.addActionListener(this);

        this.add(pizzabutton);
        this.add(burgerbutton);
        this.add(hotdogbutton);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==pizzabutton){
           System.out.println("you ordered pizza"); 
        }
        else if(e.getSource()==burgerbutton){
            System.out.println("you ordered burger"); 
        }
        else{
            System.out.println("you ordered hotdog");
        }
    }  
}
