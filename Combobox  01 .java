import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;

class AFrame extends JFrame implements ActionListener{
    
    JComboBox combobox;
    AFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        String[] animals={"dogs","cat","bird"};
        combobox=new JComboBox(animals);
        combobox.addActionListener(this);
        combobox.setEditable(true);
        combobox.insertItemAt("pig",0);
        //combobox.setSelectedIndex(1);
        //combobox.removeItem("bird");

        this.add(combobox);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==combobox){
            System.out.println(combobox.getSelectedItem());
            //System.out.println(combobox.getSelectedIndex());
        }
    }  
}


public class Solution {
    public static void main(String[] args){
        AFrame fm=new AFrame();
    }
}
 
