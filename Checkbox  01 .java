public class Solution {
    public static void main(String[] args){
        AFrame fm=new AFrame();
    }
}

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class AFrame extends JFrame implements ActionListener{
    JButton button;
    JCheckBox checkbox;
    ImageIcon icon;
    ImageIcon icon2;

    AFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        icon=new ImageIcon("dog1.png");
        icon2=new ImageIcon("dog2.png");

        button=new JButton();
        button.setText("Submit");
        button.addActionListener(this);

        checkbox=new JCheckBox();
        checkbox.setText("iam vegan");
        checkbox.setFocusable(false);
        checkbox.setFont(new Font("consolsa",Font.PLAIN,35));
        checkbox.setIcon(icon);

        this.add(button);
        this.add(checkbox);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            System.out.println(checkbox.isSelected());
        }
    }  
}
