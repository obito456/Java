public class Solution {
    public static void main(String[] args){
        AFrame fm=new AFrame();
    }
}

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class AFrame extends JFrame implements ActionListener{
    
    JRadioButton pizzabutton;
    JRadioButton burgerbutton;
    JRadioButton hotdogbutton;
    ImageIcon pizzaicon;
    ImageIcon burgericon;
    ImageIcon hotdogicon;

    AFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        pizzaicon=new ImageIcon("https://w7.pngwing.com/pngs/1006/158/png-transparent-pizza-food-small-piece-of-pizza-pizza-logo-cartoon-one-piece-thumbnail.png");
        burgericon=new ImageIcon("https://png.pngtree.com/png-vector/20231214/ourmid/pngtree-cute-style-mini-burgers-png-image_11350873.png");
        hotdogicon=new ImageIcon("https://png.pngtree.com/element_pic/00/16/10/0457f346324cfc5.jpg");
 
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

        pizzabutton.setIcon(pizzaicon);
        burgerbutton.setIcon(burgericon);
        hotdogbutton.setIcon(hotdogicon);

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
